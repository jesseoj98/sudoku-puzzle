package domain.quadrants.base;

public enum SixthBaseQuadrant {

	FIRST_INDEX(6, 3), SECOND_INDEX(7, 3), THIRD_INDEX(8, 3), FOURTH_INDEX(6, 4), FIFTH_INDEX(7, 4), SIXTH_INDEX(8, 4),
	SEVENTH_INDEX(6, 5), EIGHTH_INDEX(7, 5), NINTH_INDEX(8, 5);

	SixthBaseQuadrant(int xCoord, int yCoord) {
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
