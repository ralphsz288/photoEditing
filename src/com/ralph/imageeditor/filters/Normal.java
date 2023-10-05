package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Normal implements Filter {

	@Override
	public Color transform(Color c) {
		Color col= new Color(c.getRed(),c.getGreen(),c.getBlue(),c.getAlpha());
		return col;
	
	}

}
