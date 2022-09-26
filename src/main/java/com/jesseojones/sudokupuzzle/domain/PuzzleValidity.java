package com.jesseojones.sudokupuzzle.domain;

public class PuzzleValidity {

	private boolean valid;

	private int problemIndex;

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public int getProblemIndex() {
		return problemIndex;
	}

	public void setProblemIndex(int problemIndex) {
		this.problemIndex = problemIndex;
	}

}
