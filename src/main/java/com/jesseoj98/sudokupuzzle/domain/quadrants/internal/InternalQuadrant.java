package com.jesseoj98.sudokupuzzle.domain.quadrants.internal;

import java.util.ArrayList;
import java.util.List;

import com.jesseoj98.sudokupuzzle.domain.Coordinate;

public class InternalQuadrant {

	public List<Coordinate> getFirstInternalQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(1, 1));
		coordinates.add(new Coordinate(2, 1));
		coordinates.add(new Coordinate(3, 1));
		coordinates.add(new Coordinate(1, 2));
		coordinates.add(new Coordinate(2, 2));
		coordinates.add(new Coordinate(3, 2));
		coordinates.add(new Coordinate(1, 3));
		coordinates.add(new Coordinate(2, 3));
		coordinates.add(new Coordinate(3, 3));

		return coordinates;
	}

	public List<Coordinate> getSecondInternalQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(5, 1));
		coordinates.add(new Coordinate(6, 1));
		coordinates.add(new Coordinate(7, 1));
		coordinates.add(new Coordinate(5, 2));
		coordinates.add(new Coordinate(6, 2));
		coordinates.add(new Coordinate(7, 2));
		coordinates.add(new Coordinate(5, 3));
		coordinates.add(new Coordinate(6, 3));
		coordinates.add(new Coordinate(7, 3));

		return coordinates;
	}

	public List<Coordinate> getThirdInternalQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(1, 5));
		coordinates.add(new Coordinate(2, 5));
		coordinates.add(new Coordinate(3, 5));
		coordinates.add(new Coordinate(1, 6));
		coordinates.add(new Coordinate(2, 6));
		coordinates.add(new Coordinate(3, 6));
		coordinates.add(new Coordinate(1, 7));
		coordinates.add(new Coordinate(2, 7));
		coordinates.add(new Coordinate(3, 7));

		return coordinates;
	}

	public List<Coordinate> getFourthInternalQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(5, 5));
		coordinates.add(new Coordinate(6, 5));
		coordinates.add(new Coordinate(7, 5));
		coordinates.add(new Coordinate(5, 6));
		coordinates.add(new Coordinate(6, 6));
		coordinates.add(new Coordinate(7, 5));
		coordinates.add(new Coordinate(5, 7));
		coordinates.add(new Coordinate(6, 7));
		coordinates.add(new Coordinate(7, 7));

		return coordinates;
	}

}
