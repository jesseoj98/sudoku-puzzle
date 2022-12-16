package com.jesseoj98.sudokupuzzle.domain.diagonals;

/**
 * /
 * 
 * @author Jesse
 *
 */
public enum ForwardsDiagonal {

	FIRST_INDEX(0, 8), SECOND_INDEX(1, 7), THIRD_INDEX(2, 6), FOURTH_INDEX(3, 5), FIFTH_INDEX(4, 4), SIXTH_INDEX(5, 3),
	SEVENTH_INDEX(6, 2), EIGHTH_INDEX(7, 1), NINTH_INDEX(8, 0);

	ForwardsDiagonal(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	private int xCoord;

	private int yCoord;

	public int getxCoord() {
		return xCoord;
	}

	void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

}
