package com.jesseojones.sudokupuzzle.domain.quadrants.internal;

public enum FirstInternalQuadrant {

	FIRST_INDEX(1, 1), SECOND_INDEX(2, 1), THIRD_INDEX(3, 1), FOURTH_INDEX(1, 2), FIFTH_INDEX(2, 2), SIXTH_INDEX(2, 3),
	SEVENTH_INDEX(1, 3), EIGHTH_INDEX(2, 3), NINTH_INDEX(3, 3);

	FirstInternalQuadrant(int xCoord, int yCoord) {
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
