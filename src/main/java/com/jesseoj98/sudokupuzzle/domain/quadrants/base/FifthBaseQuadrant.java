package com.jesseoj98.sudokupuzzle.domain.quadrants.base;

public enum FifthBaseQuadrant {

	FIRST_INDEX(3, 3), SECOND_INDEX(4, 3), THIRD_INDEX(5, 3), FOURTH_INDEX(3, 4), FIFTH_INDEX(4, 4), SIXTH_INDEX(5, 4),
	SEVENTH_INDEX(3, 5), EIGHTH_INDEX(4, 5), NINTH_INDEX(5, 5);

	FifthBaseQuadrant(int xCoord, int yCoord) {
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
