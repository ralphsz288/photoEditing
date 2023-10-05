package com.ralph.imageeditor.layers;

import ro.itschool.pixels.Color;

public class SolidLayer extends Layer {
	private final Color col;

	public SolidLayer(int x, int y, int width,int height,Color col) {
		super(x, y, width, height);
		this.col=col;
		
	}

	@Override
	protected Color getPixel(int x, int y) {
		return col;
		
	}



}
