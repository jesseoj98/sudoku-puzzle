package com.jesseoj98.sudokupuzzle.util;

import java.util.ArrayList;
import java.util.List;

import com.jesseoj98.sudokupuzzle.domain.Coordinate;
import com.jesseoj98.sudokupuzzle.domain.diagonals.BackwardsDiagonal;
import com.jesseoj98.sudokupuzzle.domain.diagonals.ForwardsDiagonal;
import com.jesseoj98.sudokupuzzle.domain.quadrants.base.BaseQuadrant;
import com.jesseoj98.sudokupuzzle.domain.quadrants.internal.InternalQuadrant;

/**
 * A helper class that performs puzzle operations.
 * 
 * @author Jesse
 * 
 */
public class Helper {

	private static final int MAX_PUZZLE_DIMENSION = 9;

	private static BaseQuadrant baseQuadrant = new BaseQuadrant();
	private static InternalQuadrant internalQuadrant = new InternalQuadrant();

	public boolean validatePuzzleValue(int input) {
		return input > 0 && input < 10;
	}

	public boolean validateDifficulty(int input) {
		return input > 0 && input < 5;
	}

	public boolean validateComplexity(int input) {
		return input > 0 && input < 6;
	}

	public boolean validatePuzzleValue(String input) {
		return validatePuzzleValue(Integer.parseInt(input));
	}

	public void insertIntoPuzzle(int[][] puzzle, int xCoordinate, int yCoordinate, int value) {
		puzzle[xCoordinate][yCoordinate] = value;
	}

	public void removeFromPuzzle(int[][] puzzle, int xCoordinate, int yCoordinate) {
		puzzle[xCoordinate][yCoordinate] = -1;
	}

	public int retrievePuzzleIndexValue(int[][] puzzle, int xCoordinate, int yCoordinate) {
		return puzzle[xCoordinate][yCoordinate];
	}

	public boolean isEmptyOrRemoved(int[][] puzzle, int xCoordinate, int yCoordinate) {
		return puzzle[xCoordinate][yCoordinate] == 0 || puzzle[xCoordinate][yCoordinate] == -1;
	}

	public boolean valueAlreadyExists(int[][] puzzle, int xCoordinate, int yCoordinate) {
		return validatePuzzleValue(puzzle[xCoordinate][yCoordinate]);
	}

	public List<Coordinate> getBaseQuadrantCoordinates(int xCoordinate, int yCoordinate) {

		List<Coordinate> firstBaseQuadrantCoordinates = baseQuadrant.getFirstBaseQuadrantCoordinates();
		List<Coordinate> secondBaseQuadrantCoordinates = baseQuadrant.getSecondBaseQuadrantCoordinates();
		List<Coordinate> thirdBaseQuadrantCoordinates = baseQuadrant.getThirdBaseQuadrantCoordinates();
		List<Coordinate> fourthBaseQuadrantCoordinates = baseQuadrant.getFourthBaseQuadrantCoordinates();
		List<Coordinate> fifthBaseQuadrantCoordinates = baseQuadrant.getFifthBaseQuadrantCoordinates();
		List<Coordinate> sixthBaseQuadrantCoordinates = baseQuadrant.getSixthBaseQuadrantCoordinates();
		List<Coordinate> seventhBaseQuadrantCoordinates = baseQuadrant.getSeventhBaseQuadrantCoordinates();
		List<Coordinate> eighthBaseQuadrantCoordinates = baseQuadrant.getEighthBaseQuadrantCoordinates();
		List<Coordinate> ninthBaseQuadrantCoordinates = baseQuadrant.getNinthBaseQuadrantCoordinates();

		if (fallsInQuadrant(firstBaseQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return firstBaseQuadrantCoordinates;
		}

		if (fallsInQuadrant(secondBaseQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return secondBaseQuadrantCoordinates;
		}

		if (fallsInQuadrant(thirdBaseQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return thirdBaseQuadrantCoordinates;
		}

		if (fallsInQuadrant(fourthBaseQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return fourthBaseQuadrantCoordinates;
		}

		if (fallsInQuadrant(fifthBaseQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return fifthBaseQuadrantCoordinates;
		}

		if (fallsInQuadrant(sixthBaseQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return sixthBaseQuadrantCoordinates;
		}

		if (fallsInQuadrant(seventhBaseQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return seventhBaseQuadrantCoordinates;
		}

		if (fallsInQuadrant(eighthBaseQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return eighthBaseQuadrantCoordinates;
		}

		return ninthBaseQuadrantCoordinates;
	}

	public List<Coordinate> getInternalQuadrantCoordinates(int xCoordinate, int yCoordinate) {

		List<Coordinate> firstInternalQuadrantCoordinates = internalQuadrant.getFirstInternalQuadrantCoordinates();
		List<Coordinate> secondInternalQuadrantCoordinates = internalQuadrant.getSecondInternalQuadrantCoordinates();
		List<Coordinate> thirdInternalQuadrantCoordinates = internalQuadrant.getThirdInternalQuadrantCoordinates();
		List<Coordinate> fourthInternalQuadrantCoordinates = internalQuadrant.getFourthInternalQuadrantCoordinates();

		if (fallsInQuadrant(firstInternalQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return firstInternalQuadrantCoordinates;
		}

		if (fallsInQuadrant(secondInternalQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return secondInternalQuadrantCoordinates;
		}

		if (fallsInQuadrant(thirdInternalQuadrantCoordinates, xCoordinate, yCoordinate)) {
			return thirdInternalQuadrantCoordinates;
		}

		return fourthInternalQuadrantCoordinates;
	}

	private boolean fallsInQuadrant(List<Coordinate> quadrantCoordinates, int xCoordinate, int yCoordinate) {
		for (int i = 0; i < quadrantCoordinates.size(); i++) {
			if (quadrantCoordinates.get(i).getxCoordinate() == xCoordinate
					&& quadrantCoordinates.get(i).getyCoordinate() == yCoordinate) {
				return true;
			}
		}
		return false;
	}

	public List<Integer> retrievePuzzleRowValues(int[][] puzzle, int rowNumber) {
		final ArrayList<Integer> rowValues = new ArrayList<>();
		for (int i = 0; i < MAX_PUZZLE_DIMENSION; i++) {
			rowValues.add(puzzle[rowNumber][i]);
		}
		return rowValues;
	}

	public List<Integer> retrievePuzzleColumnValues(int[][] puzzle, int columnNumber) {
		final ArrayList<Integer> columnValues = new ArrayList<>();
		for (int i = 0; i < MAX_PUZZLE_DIMENSION; i++) {
			columnValues.add(puzzle[i][columnNumber]);
		}
		return columnValues;
	}

	public int retrieveProblemRowIndex(int[][] puzzle, int insertValue, int xCoordinate) {
		int problemIndex = 0;
		for (int i = 0; i < MAX_PUZZLE_DIMENSION; i++) {
			// to-do: ignore empty values
			if (puzzle[xCoordinate][i] == insertValue) {
				problemIndex = i;
				break;
			}
		}
		return problemIndex;
	}

	public int retrieveProblemColumnIndex(int[][] puzzle, int insertValue, int yCoordinate) {
		int problemIndex = 0;
		for (int i = 0; i < MAX_PUZZLE_DIMENSION; i++) {
			// to-do: ignore empty values
			if (puzzle[i][yCoordinate] == insertValue) {
				problemIndex = i;
				break;
			}
		}
		return problemIndex;
	}

	public List<Coordinate> retrieveProblemBackwardDiagonalIndices(int[][] puzzle, int insertValue) {
		final ArrayList<Coordinate> problemIndices = new ArrayList<>();
		for (BackwardsDiagonal diagonalCoords : BackwardsDiagonal.values()) {
			if (puzzle[diagonalCoords.getxCoord()][diagonalCoords.getyCoord()] == insertValue) {
				problemIndices.add(new Coordinate(diagonalCoords.getxCoord(), diagonalCoords.getyCoord()));
				break;
			}
		}
		return problemIndices;
	}

	public List<Coordinate> retrieveProblemForwardDiagonalIndices(int[][] puzzle, int insertValue) {
		final ArrayList<Coordinate> problemIndices = new ArrayList<>();
		for (ForwardsDiagonal diagonalCoords : ForwardsDiagonal.values()) {
			if (puzzle[diagonalCoords.getxCoord()][diagonalCoords.getyCoord()] == insertValue) {
				problemIndices.add(new Coordinate(diagonalCoords.getxCoord(), diagonalCoords.getyCoord()));
				break;
			}
		}
		return problemIndices;
	}

}
