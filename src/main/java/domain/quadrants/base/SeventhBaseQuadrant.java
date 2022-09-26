package domain.quadrants.base;

public enum SeventhBaseQuadrant {

	FIRST_INDEX(0, 6), SECOND_INDEX(1, 6), THIRD_INDEX(2, 6), FOURTH_INDEX(0, 7), FIFTH_INDEX(1, 7), SIXTH_INDEX(2, 7),
	SEVENTH_INDEX(0, 8), EIGHTH_INDEX(1, 8), NINTH_INDEX(2, 8);

	SeventhBaseQuadrant(int xCoord, int yCoord) {
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
