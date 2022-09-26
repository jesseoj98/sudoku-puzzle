package com.jesseojones.sudokupuzzle.domain.quadrants.base;

public enum FourthBaseQuadrant {

	FIRST_INDEX(0, 3), SECOND_INDEX(1, 3), THIRD_INDEX(2, 3), FOURTH_INDEX(0, 4), FIFTH_INDEX(1, 4), SIXTH_INDEX(2, 4),
	SEVENTH_INDEX(0, 5), EIGHTH_INDEX(1, 5), NINTH_INDEX(2, 5);

	FourthBaseQuadrant(int xCoord, int yCoord) {
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
