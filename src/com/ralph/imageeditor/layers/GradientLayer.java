package com.ralph.imageeditor.layers;

import ro.itschool.pixels.Color;

public class GradientLayer extends Layer {
	
	

	public GradientLayer(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	protected Color getPixel(int x, int y) {
		float h=(float)getHeight();
		float y2=(float)y;
		float rez=y2/h*255;
		return new Color(Math.round(rez),Math.round(rez),Math.round(rez));
		
		
	}

}
