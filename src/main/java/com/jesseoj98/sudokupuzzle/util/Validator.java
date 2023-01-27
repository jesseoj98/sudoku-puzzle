package com.jesseoj98.sudokupuzzle.util;

import java.util.ArrayList;
import java.util.List;

import com.jesseoj98.sudokupuzzle.domain.Coordinate;
import com.jesseoj98.sudokupuzzle.domain.GameBoard;
import com.jesseoj98.sudokupuzzle.domain.diagonals.BackwardsDiagonal;
import com.jesseoj98.sudokupuzzle.domain.diagonals.ForwardsDiagonal;

/**
 * A validation class that performs puzzle validation.
 * 
 * @author Jesse
 * 
 */
public class Validator {

	private static Helper helper = new Helper();
	private static Generator generator = new Generator();

	/**
	 * Validates a row of the puzzle for a given row number
	 * 
	 * @param puzzle
	 * @param rowNumber
	 * @return
	 */
	public boolean validateRow(int[][] puzzle, int rowNumber) {
		final ArrayList<Integer> row = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			if (!helper.isEmptyOrRemoved(puzzle, rowNumber, i)) {
				row.add(puzzle[rowNumber][i]);
			}
		}
		return validate(row);
	}

	protected boolean validateFirstRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[0][i]);
		}
		return validate(middleRow);
	}

	protected boolean validateSecondRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[1][i]);
		}
		return validate(middleRow);
	}

	protected boolean validateThirdRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[2][i]);
		}
		return validate(middleRow);
	}

	protected boolean validateFourthRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[3][i]);
		}
		return validate(middleRow);
	}

	protected boolean validateFifthRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[4][i]);
		}
		return validate(middleRow);
	}

	protected boolean validateSixthRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[5][i]);
		}
		return validate(middleRow);
	}

	protected boolean validateSeventhRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[6][i]);
		}
		return validate(middleRow);
	}

	protected boolean validateEighthRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[7][i]);
		}
		return validate(middleRow);
	}

	protected boolean validateNinthRow(int[][] puzzle) {
		final ArrayList<Integer> middleRow = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleRow.add(puzzle[8][i]);
		}
		return validate(middleRow);
	}

	/**
	 * Validates a column of the puzzle for a given column number
	 * 
	 * @param puzzle
	 * @param columnNumber
	 * @return
	 */
	public boolean validateColumn(int[][] puzzle, int columnNumber) {
		final ArrayList<Integer> column = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			if (!helper.isEmptyOrRemoved(puzzle, i, columnNumber)) {
				column.add(puzzle[i][columnNumber]);
			}
		}
		return validate(column);
	}

	protected boolean validateMiddleColumn(int[][] puzzle) {
		final ArrayList<Integer> middleColumn = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			middleColumn.add(puzzle[i][4]);
		}
		return validate(middleColumn);
	}

	public boolean validateBaseQuadrant(int[][] puzzle, int xCoordinate, int yCoordinate) {
		final List<Coordinate> baseQuadrantCoordinates = helper.getBaseQuadrantCoordinates(xCoordinate, yCoordinate);
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			if (baseQuadrantCoordinates.get(i).getxCoordinate() == xCoordinate
					&& baseQuadrantCoordinates.get(i).getyCoordinate() == yCoordinate) {
				return validateQuadrant(puzzle, baseQuadrantCoordinates);
			}
		}
		return true;
	}

	public boolean validateInternalQuadrant(int[][] puzzle, int xCoordinate, int yCoordinate) {
		final List<Coordinate> internalQuadrantCoordinates = helper.getInternalQuadrantCoordinates(xCoordinate,
				yCoordinate);
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			if (internalQuadrantCoordinates.get(i).getxCoordinate() == xCoordinate
					&& internalQuadrantCoordinates.get(i).getyCoordinate() == yCoordinate) {
				return validateQuadrant(puzzle, internalQuadrantCoordinates);
			}
		}
		return false;
	}

	private boolean validateQuadrant(int[][] puzzle, List<Coordinate> quadrantCoordinates) {
		final ArrayList<Integer> quadrant = new ArrayList<>();
		for (int i = 0; i < quadrantCoordinates.size(); i++) {
			quadrant.add(
					puzzle[quadrantCoordinates.get(i).getxCoordinate()][quadrantCoordinates.get(i).getyCoordinate()]);
		}
		return validate(quadrant);
	}

	/**
	 * Validates the backward diagonal of the puzzle if coordinates align via an
	 * enum
	 * 
	 * @param puzzle
	 * @param xCoordinate
	 * @param yCoordinate
	 * @return
	 */
	public boolean validateBackwardDiagonal(int[][] puzzle, int xCoordinate, int yCoordinate) {
		for (BackwardsDiagonal diagonalCoords : BackwardsDiagonal.values()) {
			if (diagonalCoords.getxCoord() == xCoordinate && diagonalCoords.getyCoord() == yCoordinate) {
				return validateBackwardDiagonal(puzzle);
			}
		}
		return true;
	}

	/**
	 * Validates the backward diagonal of the puzzle if coordinates align via a
	 * simple if check
	 * 
	 * @param puzzle
	 * @param xCoordinate
	 * @param yCoordinate
	 * @return
	 */
	protected boolean validateBackwardDiagonalSimple(int[][] puzzle, int xCoordinate, int yCoordinate) {
		if (xCoordinate == yCoordinate) {
			return validateBackwardDiagonal(puzzle);
		}
		return true;
	}

	protected boolean validateBackwardDiagonalSimplest(int[][] puzzle) {
		final ArrayList<Integer> backwardDiagonal = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			backwardDiagonal.add(puzzle[i][i]);
		}
		return validate(backwardDiagonal);
	}

	/**
	 * Validates the backward diagonal of the puzzle
	 * 
	 * @param puzzle
	 * @return
	 */
	public boolean validateBackwardDiagonal(int[][] puzzle) {
		final ArrayList<Integer> backwardDiagonal = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			for (int j = 0; j < GameBoard.MAX_PUZZLE_DIMENSION; j++) {
				if (i == j && !helper.isEmptyOrRemoved(puzzle, i, j)) {
					backwardDiagonal.add(puzzle[i][j]);
				}
			}
		}
		return validate(backwardDiagonal);
	}

	/**
	 * Validates the forward diagonal of the puzzle if coordinates align via an enum
	 * 
	 * @param puzzle
	 * @param xCoordinate
	 * @param yCoordinate
	 * @return
	 */
	public boolean validateForwardDiagonal(int[][] puzzle, int xCoordinate, int yCoordinate) {
		for (ForwardsDiagonal diagonalCoords : ForwardsDiagonal.values()) {
			if (diagonalCoords.getxCoord() == xCoordinate && diagonalCoords.getyCoord() == yCoordinate) {
				return validateForwardDiagonal(puzzle);
			}
		}
		return true;
	}

	/**
	 * Validates the forward diagonal of the puzzle if coordinates align via a
	 * simple if check
	 * 
	 * @param puzzle
	 * @param xCoordinate
	 * @param yCoordinate
	 * @return
	 */
	protected boolean validateForwardDiagonalSimple(int[][] puzzle, int xCoordinate, int yCoordinate) {
		if (xCoordinate + yCoordinate == GameBoard.MAX_PUZZLE_DIMENSION - 1) {
			return validateForwardDiagonal(puzzle);
		}
		return true;
	}

	/**
	 * Validates the forward diagonal of the puzzle
	 * 
	 * @param puzzle
	 * @return
	 */
	public boolean validateForwardDiagonal(int[][] puzzle) {
		final ArrayList<Integer> forwardDiagonal = new ArrayList<>();
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			for (int j = GameBoard.MAX_PUZZLE_DIMENSION; j > 0; j--) {
				if (i + j == GameBoard.MAX_PUZZLE_DIMENSION - 1 && !helper.isEmptyOrRemoved(puzzle, i, j)) {
					forwardDiagonal.add(puzzle[i][j]);
				}
			}
		}
		return validate(forwardDiagonal);
	}

	/**
	 * Validates that a value does not occur twice in an array list
	 * 
	 * @param values the ArrayList to validate
	 * @return whether there are multiple occurences of a value
	 */
	private boolean validate(ArrayList<Integer> values) {
		for (int i = 0; i < values.size(); i++) {
			for (int j = i + 1; j < values.size(); j++) {
				if (values.get(i).equals(values.get(j))) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Validates the entire puzzle
	 * 
	 * @param puzzle
	 * @return
	 */
	public boolean validatePuzzle(int[][] puzzle, int difficulty) {
		boolean result;
		switch (difficulty) {
		case 1:
			result = validateAllRows(puzzle) && validateAllColumns(puzzle);
		case 2:
			// to-do: validate all nine 3x3 quadrants
			result = validateAllRows(puzzle) && validateAllColumns(puzzle);
		case 3:
			// to-do: validate four internal 3x3 quadrants
			result = validateAllRows(puzzle) && validateAllColumns(puzzle);
		case 4:
			// to-do: validate all
			result = validateAllRows(puzzle) && validateAllColumns(puzzle) && validateBackwardDiagonal(puzzle)
					&& validateForwardDiagonal(puzzle);
		default:
			result = false;
		}
		if (!result) {
			generator.removeAllValuesFromPuzzle(puzzle);
		}
		return result;
	}

	public boolean validateAllRows(int[][] puzzle) {
		boolean result = true;
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			result = validateRow(puzzle, i);
			if (!result) {
				break;
			}
		}
		return result;
	}

	public boolean validateAllColumns(int[][] puzzle) {
		boolean result = true;
		for (int i = 0; i < GameBoard.MAX_PUZZLE_DIMENSION; i++) {
			result = validateColumn(puzzle, i);
			if (!result) {
				break;
			}
		}
		return result;
	}

	public boolean validateAllBaseQuadrants(int[][] puzzle) {
		boolean result = true;
		return result;
	}

	public boolean validateAllInternalQuadrants(int[][] puzzle) {
		boolean result = true;
		return result;
	}

}
