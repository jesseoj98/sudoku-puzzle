package com.jesseoj98.sudokupuzzle.util;

import com.jesseoj98.sudokupuzzle.domain.GameBoard;

/**
 * A printer class that prints puzzles.
 * 
 * @author Jesse
 *
 */
public class Printer {

	public void printPuzzle(int[][] puzzle) {
		printTopOfPuzzle();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			printPuzzleRow(puzzle, i);
			if (i != 8) {
				printPuzzleDivider();
			}
		}
		printBottomOfPuzzle();
	}

	private void printPuzzleRow(int[][] puzzle, int xCoordinate) {
		System.out.print((xCoordinate + 1) + " |");
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			if (endOfIndexMatch(i)) {
				System.out.print(" " + printEmptyIfEmptyOrInvalid(Integer.toString(puzzle[xCoordinate][i])) + " |");
			} else {
				System.out.print(" " + printEmptyIfEmptyOrInvalid(Integer.toString(puzzle[xCoordinate][i])));
			}
		}
		System.out.println(" | " + (xCoordinate + 1));
	}

	private void printTopOfPuzzle() {
		System.out.println("    1   2   3   4   5   6   7   8   9");
		printPuzzleDivider();
	}

	private void printPuzzleDivider() {
		System.out.println("  |---|---|---|---|---|---|---|---|---|");
	}

	private void printBottomOfPuzzle() {
		printPuzzleDivider();
		System.out.println("    1   2   3   4   5   6   7   8   9\n");
	}

	public String printPuzzleRowValues(int[][] puzzle, int rowNumber) {
		StringBuilder rowValues = new StringBuilder();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			if (endOfIndexMatch(i)) {
				rowValues.append("[" + (rowNumber + 1) + ", " + i + 1 + "] contains "
						+ printNothingIfEmptyOrInvalid(Integer.toString(puzzle[rowNumber][i])) + "\n");
			} else {
				rowValues.append("[" + (rowNumber + 1) + ", " + i + 1 + "] contains "
						+ printNothingIfEmptyOrInvalid(Integer.toString(puzzle[rowNumber][i])));
			}
		}
		return rowValues.toString();
	}

	public String printPuzzleColumnValues(int[][] puzzle, int columnNumber) {
		StringBuilder columnValues = new StringBuilder();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			if (endOfIndexMatch(i)) {
				columnValues.append("[" + (columnNumber + 1) + ", " + i + 1 + "] contains "
						+ printNothingIfEmptyOrInvalid(Integer.toString(puzzle[i][columnNumber])) + "\n");
			} else {
				columnValues.append("[" + (columnNumber + 1) + ", " + i + 1 + "] contains "
						+ printNothingIfEmptyOrInvalid(Integer.toString(puzzle[i][columnNumber])));
			}
		}
		return columnValues.toString();
	}

	public String printPuzzleBackwardDiagonalValues(int[][] puzzle) {
		StringBuilder backwardDiagonalValues = new StringBuilder();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			for (int j = 0; j < GameBoard.MAX_PUZZLE_DIMENSION; j++) {
				if (i == j) {
					if (endOfIndexMatch(i) && endOfIndexMatch(j)) {
						backwardDiagonalValues.append("[" + (i + 1) + ", " + (j + 1) + "] contains "
								+ printNothingIfEmptyOrInvalid(Integer.toString(puzzle[i][j])) + "\n");
					} else {
						backwardDiagonalValues.append("[" + (i + 1) + ", " + (j + 1) + "] contains "
								+ printNothingIfEmptyOrInvalid(Integer.toString(puzzle[i][j])));
					}
				}
			}
		}
		return backwardDiagonalValues.toString();
	}

	public String printPuzzleForwardDiagonalValues(int[][] puzzle) {
		StringBuilder forwardDiagonalValues = new StringBuilder();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			for (int j = GameBoard.MAX_PUZZLE_DIMENSION; j > 0; j--) {
				if (i + j == GameBoard.MAX_PUZZLE_DIMENSION) {
					if (endOfIndexMatch(i) && endOfIndexMatch(j)) {
						forwardDiagonalValues.append("[" + (i + 1) + ", " + (j + 1) + "] contains "
								+ printNothingIfEmptyOrInvalid(Integer.toString(puzzle[i][j])) + "\n");
					} else {
						forwardDiagonalValues.append("[" + (i + 1) + ", " + (j + 1) + "] contains "
								+ printNothingIfEmptyOrInvalid(Integer.toString(puzzle[i][j])));
					}
				}
			}
		}
		return forwardDiagonalValues.toString();
	}

	private boolean endOfIndexMatch(int index) {
		return index != GameBoard.MAX_PUZZLE_DIMENSION - 1;
	}

	private String printEmptyIfEmptyOrInvalid(String puzzleValue) {
		return puzzleValue.equals("-1") || puzzleValue.equals("0") ? " " : puzzleValue;
	}

	private String printNothingIfEmptyOrInvalid(String puzzleValue) {
		return puzzleValue.equals("-1") || puzzleValue.equals("0") ? "nothing" : puzzleValue;
	}

}
