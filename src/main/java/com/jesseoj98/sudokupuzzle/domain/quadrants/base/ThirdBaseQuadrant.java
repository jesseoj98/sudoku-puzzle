package com.jesseoj98.sudokupuzzle.domain.quadrants.base;

public enum ThirdBaseQuadrant {

	FIRST_INDEX(6, 0), SECOND_INDEX(7, 0), THIRD_INDEX(8, 0), FOURTH_INDEX(6, 1), FIFTH_INDEX(7, 1), SIXTH_INDEX(8, 1),
	SEVENTH_INDEX(6, 2), EIGHTH_INDEX(7, 2), NINTH_INDEX(8, 2);

	ThirdBaseQuadrant(int xCoord, int yCoord) {
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
