package com.jesseojones.sudokupuzzle;
import java.util.List;
import java.util.Scanner;

import com.jesseojones.sudokupuzzle.domain.Coordinate;
import com.jesseojones.sudokupuzzle.util.PuzzleGenerator;
import com.jesseojones.sudokupuzzle.util.PuzzleHelper;
import com.jesseojones.sudokupuzzle.util.PuzzlePrinter;
import com.jesseojones.sudokupuzzle.util.PuzzleValidator;

/**
 * The main application class
 * 
 * @author Jesse
 *
 */
public class Application {

	private static PuzzleGenerator generator = new PuzzleGenerator();
	private static PuzzleHelper helper = new PuzzleHelper();
	private static PuzzlePrinter printer = new PuzzlePrinter();
	private static Scanner scanner = new Scanner(System.in);
	private static PuzzleValidator validator = new PuzzleValidator();

	public static void main(String[] args) {

		System.out.println("Java Sudoku Puzzle v1.0 by Jesse Jones \n\n");

		int difficulty;
		int complexity;

		System.out.println("Difficulties:\n");
		System.out.println("1 - Easy (all rows + all columns)");
		System.out.println("2 - Intermediate (easy + all nine 3x3 quadrants)");
		System.out.println("3 - Hard (intermediate + four internal 3x3 quadrants)");
		System.out.println("4 - Expert (hard + forward & backward diagonals)\n");

		System.out.print("Please enter a difficulty: ");

		do {
			difficulty = scanner.nextInt();
		} while (!helper.validateDifficulty(difficulty));

		System.out.println("\nComplexities:\n");
		System.out.println("1 (75% of indices filled)");
		System.out.println("2 (62.5% of indices filled)");
		System.out.println("3 (50% of indices filled)");
		System.out.println("4 (37.5% of indices filled)");
		System.out.println("5 (25% of indices filled)\n");

		System.out.print("Please enter a complexity: ");

		do {
			complexity = scanner.nextInt();
		} while (!helper.validateComplexity(complexity));

		int[][] puzzle = generator.generatePuzzle(difficulty, complexity);

		System.out.println();

		printer.printPuzzle(puzzle);

		do {

			int xCoordinate;
			int yCoordinate;
			int insertValue;

			do {
				System.out.print("Please enter the x coordinate: ");
				xCoordinate = scanner.nextInt();
			} while (!helper.validatePuzzleValue(xCoordinate));

			do {
				System.out.print("Please enter the y coordinate: ");
				yCoordinate = scanner.nextInt();
			} while (!helper.validatePuzzleValue(yCoordinate));

			do {
				System.out.print("Please enter the value to insert into the puzzle for the coordinates [" + xCoordinate
						+ ", " + yCoordinate + "]: ");
				insertValue = scanner.nextInt();
			} while (!helper.validatePuzzleValue(insertValue));

			System.out.println("\nAttempting to insert value " + insertValue + " into puzzle coordinate " + "["
					+ xCoordinate + ", " + yCoordinate + "]...\n");

			if (validInsert(puzzle, yCoordinate - 1, xCoordinate - 1, insertValue, difficulty)) {

				System.out.println("Value successfully inserted into puzzle\n");
				helper.insertIntoPuzzle(puzzle, xCoordinate - 1, yCoordinate - 1, insertValue);
				printer.printPuzzle(puzzle);

			} else {

				printer.printPuzzle(puzzle);

			}

		} while (!validator.validatePuzzle(puzzle, difficulty));

		System.out.println("Sudoku puzzle solved!");

	}

	private static boolean validInsert(int[][] puzzle, int xCoordinate, int yCoordinate, int insert, int difficulty) {

		if (!helper.valueAlreadyExists(puzzle, xCoordinate, yCoordinate)) {

			helper.insertIntoPuzzle(puzzle, xCoordinate, yCoordinate, insert);

			boolean validRow = validator.validateRow(puzzle, xCoordinate);
			boolean validColumn = validator.validateColumn(puzzle, yCoordinate);

			boolean validBaseQuadrant = validator.validateBaseQuadrant(puzzle, xCoordinate, yCoordinate);

			boolean validInternalQuadrant = validator.validateInternalQuadrant(puzzle, xCoordinate, yCoordinate);

			boolean validBackwardDiagonal = validator.validateBackwardDiagonal(puzzle, xCoordinate, yCoordinate);
			boolean validForwardDiagonal = validator.validateForwardDiagonal(puzzle, xCoordinate, yCoordinate);

			helper.removeFromPuzzle(puzzle, xCoordinate, yCoordinate);

			if (!validRow) {
				System.out.println(insert + " cannot be inserted into row " + (xCoordinate + 1));
				// System.out.println("Row values: " + printer.printPuzzleRowValues(puzzle,
				// xCoordinate) + "\n");
				final int problemIndex = helper.retrieveProblemRowIndex(puzzle, insert, xCoordinate);
				System.out.println("Conflicts with existing value " + puzzle[xCoordinate][problemIndex] + " at index "
						+ "[" + (problemIndex + 1) + ", " + (xCoordinate + 1) + "]\n");
			}

			if (!validColumn) {
				System.out.println(insert + " cannot be inserted into column " + (yCoordinate + 1));
				// System.out.println("Column values: " +
				// printer.printPuzzleColumnValues(puzzle, yCoordinate) + "\n");
				final int problemIndex = helper.retrieveProblemColumnIndex(puzzle, insert, yCoordinate);
				System.out.println("Conflicts with existing value " + puzzle[problemIndex][yCoordinate] + " at index "
						+ "[" + (yCoordinate + 1) + ", " + (problemIndex + 1) + "]\n");
			}

			if (!validBackwardDiagonal) {
				System.out.println(insert + " cannot be inserted into backward diagonal");
				// System.out.println("Backward diagonal values: " +
				// printer.printPuzzleBackwardDiagonalValues(puzzle) + "\n");
				final List<Coordinate> problemIndices = helper.retrieveProblemBackwardDiagonalIndices(puzzle, insert);
				final int problemIndexXCoordinate = problemIndices.get(0).getxCoordinate();
				final int problemIndexYCoordinate = problemIndices.get(0).getyCoordinate();
				System.out.println("Conflicts with existing value "
						+ puzzle[problemIndexXCoordinate][problemIndexYCoordinate] + " at index " + "["
						+ (problemIndexXCoordinate + 1) + ", " + (problemIndexYCoordinate + 1) + "]\n");
			}

			if (!validForwardDiagonal) {
				System.out.println(insert + " cannot be inserted into forward diagonal");
				// System.out.println("Forward diagonal values: " +
				// printer.printPuzzleForwardDiagonalValues(puzzle));
				final List<Coordinate> problemIndices = helper.retrieveProblemForwardDiagonalIndices(puzzle, insert);
				final int problemIndexXCoordinate = problemIndices.get(0).getxCoordinate();
				final int problemIndexYCoordinate = problemIndices.get(0).getyCoordinate();
				System.out.println("Insert value " + insert + " conflicts with existing value "
						+ puzzle[problemIndexXCoordinate][problemIndexYCoordinate] + " at index " + "["
						+ (problemIndexXCoordinate + 1) + ", " + (problemIndexYCoordinate + 1) + "]\n");
			}

			boolean valid;

			switch (difficulty) {
			case 1:
				valid = validRow && validColumn;
				break;
			case 2:
				valid = validRow && validColumn && validBaseQuadrant;
				break;
			case 3:
				valid = validRow && validColumn && validBaseQuadrant && validInternalQuadrant;
				break;
			case 4:
				valid = validRow && validColumn && validBaseQuadrant && validInternalQuadrant && validBackwardDiagonal
						&& validForwardDiagonal;
				break;
			default:
				valid = false;
				break;
			}

			return valid;

		} else {

			System.out.println("Error: Value " + helper.retrievePuzzleIndexValue(puzzle, xCoordinate, yCoordinate)
					+ " already exists in coordinate: " + "[" + (xCoordinate + 1) + ", " + (yCoordinate + 1) + "]\n");

			return false;
		}
	}
}
