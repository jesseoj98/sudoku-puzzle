package com.jesseoj98.sudokupuzzle.util;

import java.util.Random;

import com.jesseoj98.sudokupuzzle.domain.GameBoard;

/**
 * A generator class that generates puzzles.
 * 
 * @author Jesse
 *
 */
public class Generator {

	private static Helper helper = new Helper();
	private static Validator validator = new Validator();

	public int[][] generatePuzzle(int difficulty, int complexity) {
		final int[][] puzzle = new int[GameBoard.MAX_PUZZLE_DIMENSION][GameBoard.MAX_PUZZLE_DIMENSION];
		return generatePuzzle(puzzle, difficulty, complexity);
	}

	private int[][] generatePuzzle(int[][] puzzle, int difficulty, int complexity) {
		do {
			insertValuesIntoPuzzle(puzzle, complexity);
		} while (!validator.validatePuzzle(puzzle, difficulty));
		return puzzle;
	}

	private void insertValuesIntoPuzzle(int[][] puzzle, int complexity) {
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			for (int j = 0; j < GameBoard.MAX_PUZZLE_DIMENSION; j++) {
				if (insertIntoPuzzle(complexity)) {
					helper.insertIntoPuzzle(puzzle, i, j, generateRandomValue());
				}
			}
		}
	}

	public int[][] removeAllValuesFromPuzzle(int[][] puzzle) {
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			for (int j = 0; j < GameBoard.MAX_PUZZLE_DIMENSION; j++) {
				helper.removeFromPuzzle(puzzle, i, j);
			}
		}
		return puzzle;
	}

	/**
	 * Algorthmic method to check if the puzzle is solvable by a human based on
	 * difficulty
	 * 
	 * @param difficulty the difficulty of the puzzle
	 * @return if the puzzle is solvable via human
	 */
	private boolean isPuzzleSolvable(int difficulty) {
		return true;
	}

	/**
	 * Generates a random value from 1 through 9 both inclusive
	 * 
	 * @return a random value from 1 through 9 both inclusive
	 */
	private int generateRandomValue() {
		Random random = new Random();
		int value = random.nextInt(GameBoard.MAXIMUM_VALUE);
		if (value == 0) {
			value++;
		}
		return value;
	}

	/**
	 * Whether the value should be inserted into the puzzle or not based on
	 * complexity
	 * 
	 * @param complexity the complexity of the puzzle
	 * @return
	 */
	private boolean insertIntoPuzzle(int complexity) {
		Random random = new Random();
		int value = 0;
		switch (complexity) {
		case 1:
			value = 750;
			break;
		case 2:
			value = 635;
			break;
		case 3:
			value = 500;
			break;
		case 4:
			value = 375;
			break;
		case 5:
			value = 250;
			break;
		default:
			value = 1;
			break;
		}
		return random.nextInt(1000) < value;
	}

}
