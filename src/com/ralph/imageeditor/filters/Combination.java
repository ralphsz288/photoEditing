package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Combination implements Filter {

	private final Filter[] filters;

	public Combination(Filter... filters) {

		this.filters = filters;
	}

	@Override
	public Color transform(Color c) {
		for (int i = 0; i < filters.length; i++) {
			c = filters[i].transform(c);

		}
		return c;

	}

}
