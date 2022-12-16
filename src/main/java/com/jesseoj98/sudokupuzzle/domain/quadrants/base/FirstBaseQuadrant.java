package com.jesseoj98.sudokupuzzle.domain.quadrants.base;

public enum FirstBaseQuadrant {

	FIRST_INDEX(0, 0), SECOND_INDEX(1, 0), THIRD_INDEX(2, 0), FOURTH_INDEX(0, 1), FIFTH_INDEX(1, 1), SIXTH_INDEX(2, 1),
	SEVENTH_INDEX(0, 2), EIGHTH_INDEX(1, 2), NINTH_INDEX(2, 2);

	FirstBaseQuadrant(int xCoord, int yCoord) {
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
