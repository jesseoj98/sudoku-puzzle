package domain.diagonals;

/**
 * \
 * 
 * @author Jesse
 *
 */
public enum BackwardsDiagonal {

	FIRST_INDEX(0, 0), SECOND_INDEX(1, 1), THIRD_INDEX(2, 2), FOURTH_INDEX(3, 3), FIFTH_INDEX(4, 4), SIXTH_INDEX(5, 5),
	SEVENTH_INDEX(6, 6), EIGHTH_INDEX(7, 7), NINTH_INDEX(8, 8);

	BackwardsDiagonal(int xCoord, int yCoord) {
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
