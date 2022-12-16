package com.jesseoj98.sudokupuzzle.domain.quadrants.internal;

public enum FourthInternalQuadrant {

	FIRST_INDEX(5, 5), SECOND_INDEX(6, 5), THIRD_INDEX(7, 5), FOURTH_INDEX(5, 6), FIFTH_INDEX(6, 6), SIXTH_INDEX(7, 6),
	SEVENTH_INDEX(5, 7), EIGHTH_INDEX(6, 7), NINTH_INDEX(7, 7);

	FourthInternalQuadrant(int xCoord, int yCoord) {
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
