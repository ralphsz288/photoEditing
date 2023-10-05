package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Brightness implements Filter {
	private final int value;
	

	public Brightness(int value) {
		
		this.value = value;
	}


	@Override
	public Color transform(Color c) {
		int r=c.getRed();
		int b=c.getBlue();
		int g=c.getGreen();
		int a=c.getAlpha();
		Color col=new Color(r+value,g+value,b+value,a);
		return col;
		
	}

}
