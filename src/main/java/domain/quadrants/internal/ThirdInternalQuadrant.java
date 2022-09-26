package domain.quadrants.internal;

public enum ThirdInternalQuadrant {

	FIRST_INDEX(1, 5), SECOND_INDEX(2, 5), THIRD_INDEX(3, 5), FOURTH_INDEX(1, 6), FIFTH_INDEX(2, 6), SIXTH_INDEX(3, 6),
	SEVENTH_INDEX(1, 7), EIGHTH_INDEX(2, 7), NINTH_INDEX(3, 7);

	ThirdInternalQuadrant(int xCoord, int yCoord) {
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
