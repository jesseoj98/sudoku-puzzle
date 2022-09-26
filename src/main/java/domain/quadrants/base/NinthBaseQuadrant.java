package domain.quadrants.base;

public enum NinthBaseQuadrant {

	FIRST_INDEX(6, 6), SECOND_INDEX(7, 6), THIRD_INDEX(8, 6), FOURTH_INDEX(6, 7), FIFTH_INDEX(7, 7), SIXTH_INDEX(8, 7),
	SEVENTH_INDEX(6, 8), EIGHTH_INDEX(7, 8), NINTH_INDEX(8, 8);

	NinthBaseQuadrant(int xCoord, int yCoord) {
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
