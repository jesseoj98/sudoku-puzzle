package com.jesseojones.sudokupuzzle.domain.quadrants.base;

public enum EighthBaseQuadrant {

	FIRST_INDEX(3, 6), SECOND_INDEX(4, 6), THIRD_INDEX(5, 6), FOURTH_INDEX(3, 7), FIFTH_INDEX(4, 7), SIXTH_INDEX(5, 7),
	SEVENTH_INDEX(3, 8), EIGHTH_INDEX(4, 8), NINTH_INDEX(5, 8);

	EighthBaseQuadrant(int xCoord, int yCoord) {
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
