package com.jesseojones.sudokupuzzle.domain.quadrants.base;

public enum SecondBaseQuadrant {

	FIRST_INDEX(3, 0), SECOND_INDEX(4, 0), THIRD_INDEX(5, 0), FOURTH_INDEX(3, 1), FIFTH_INDEX(4, 1), SIXTH_INDEX(5, 1),
	SEVENTH_INDEX(3, 2), EIGHTH_INDEX(4, 2), NINTH_INDEX(5, 2);

	SecondBaseQuadrant(int xCoord, int yCoord) {
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
