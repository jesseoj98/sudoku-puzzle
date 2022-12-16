package com.jesseoj98.sudokupuzzle.domain.quadrants.internal;

public enum SecondInternalQuadrant {

	FIRST_INDEX(5, 1), SECOND_INDEX(6, 1), THIRD_INDEX(7, 1), FOURTH_INDEX(5, 2), FIFTH_INDEX(6, 2), SIXTH_INDEX(7, 2),
	SEVENTH_INDEX(5, 3), EIGHTH_INDEX(6, 3), NINTH_INDEX(7, 3);

	SecondInternalQuadrant(int xCoord, int yCoord) {
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
