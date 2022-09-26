package com.jesseojones.sudokupuzzle.domain.quadrants.base;

import java.util.ArrayList;
import java.util.List;

import com.jesseojones.sudokupuzzle.domain.Coordinate;

public class BaseQuadrant {

	public List<Coordinate> getFirstBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(0, 0));
		coordinates.add(new Coordinate(1, 0));
		coordinates.add(new Coordinate(2, 0));
		coordinates.add(new Coordinate(0, 1));
		coordinates.add(new Coordinate(1, 1));
		coordinates.add(new Coordinate(2, 1));
		coordinates.add(new Coordinate(0, 2));
		coordinates.add(new Coordinate(1, 2));
		coordinates.add(new Coordinate(2, 2));

		return coordinates;
	}

	public List<Coordinate> getSecondBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(3, 0));
		coordinates.add(new Coordinate(4, 0));
		coordinates.add(new Coordinate(5, 0));
		coordinates.add(new Coordinate(3, 1));
		coordinates.add(new Coordinate(4, 1));
		coordinates.add(new Coordinate(5, 1));
		coordinates.add(new Coordinate(3, 2));
		coordinates.add(new Coordinate(4, 2));
		coordinates.add(new Coordinate(5, 2));

		return coordinates;
	}

	public List<Coordinate> getThirdBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(6, 0));
		coordinates.add(new Coordinate(7, 0));
		coordinates.add(new Coordinate(8, 0));
		coordinates.add(new Coordinate(6, 1));
		coordinates.add(new Coordinate(7, 1));
		coordinates.add(new Coordinate(8, 1));
		coordinates.add(new Coordinate(6, 2));
		coordinates.add(new Coordinate(7, 2));
		coordinates.add(new Coordinate(8, 2));

		return coordinates;
	}

	public List<Coordinate> getFourthBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(0, 3));
		coordinates.add(new Coordinate(1, 3));
		coordinates.add(new Coordinate(2, 3));
		coordinates.add(new Coordinate(0, 4));
		coordinates.add(new Coordinate(1, 4));
		coordinates.add(new Coordinate(2, 4));
		coordinates.add(new Coordinate(0, 5));
		coordinates.add(new Coordinate(1, 5));
		coordinates.add(new Coordinate(2, 5));

		return coordinates;
	}

	public List<Coordinate> getFifthBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(3, 3));
		coordinates.add(new Coordinate(4, 3));
		coordinates.add(new Coordinate(5, 3));
		coordinates.add(new Coordinate(3, 4));
		coordinates.add(new Coordinate(4, 4));
		coordinates.add(new Coordinate(5, 4));
		coordinates.add(new Coordinate(3, 5));
		coordinates.add(new Coordinate(4, 5));
		coordinates.add(new Coordinate(5, 5));

		return coordinates;
	}

	public List<Coordinate> getSixthBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(6, 3));
		coordinates.add(new Coordinate(7, 3));
		coordinates.add(new Coordinate(8, 3));
		coordinates.add(new Coordinate(6, 4));
		coordinates.add(new Coordinate(7, 4));
		coordinates.add(new Coordinate(8, 4));
		coordinates.add(new Coordinate(6, 5));
		coordinates.add(new Coordinate(7, 5));
		coordinates.add(new Coordinate(8, 5));

		return coordinates;
	}

	public List<Coordinate> getSeventhBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(0, 6));
		coordinates.add(new Coordinate(1, 6));
		coordinates.add(new Coordinate(2, 6));
		coordinates.add(new Coordinate(0, 7));
		coordinates.add(new Coordinate(1, 7));
		coordinates.add(new Coordinate(2, 7));
		coordinates.add(new Coordinate(0, 8));
		coordinates.add(new Coordinate(1, 8));
		coordinates.add(new Coordinate(2, 8));

		return coordinates;
	}

	public List<Coordinate> getEighthBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(3, 6));
		coordinates.add(new Coordinate(4, 6));
		coordinates.add(new Coordinate(5, 6));
		coordinates.add(new Coordinate(3, 7));
		coordinates.add(new Coordinate(4, 7));
		coordinates.add(new Coordinate(5, 7));
		coordinates.add(new Coordinate(3, 8));
		coordinates.add(new Coordinate(4, 8));
		coordinates.add(new Coordinate(5, 8));

		return coordinates;
	}

	public List<Coordinate> getNinthBaseQuadrantCoordinates() {
		final ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(6, 6));
		coordinates.add(new Coordinate(7, 6));
		coordinates.add(new Coordinate(8, 6));
		coordinates.add(new Coordinate(6, 7));
		coordinates.add(new Coordinate(7, 7));
		coordinates.add(new Coordinate(8, 7));
		coordinates.add(new Coordinate(6, 8));
		coordinates.add(new Coordinate(7, 8));
		coordinates.add(new Coordinate(8, 8));

		return coordinates;
	}

}
