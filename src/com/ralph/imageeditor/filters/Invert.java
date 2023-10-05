package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Invert implements Filter {
	@Override
	public Color transform(Color c) {
		int r=c.getRed();
		int g=c.getGreen();
		int b=c.getBlue();
		int a=c.getAlpha();
		Color col=new Color(255-r,255-g,255-b,a);
		
		return col;
		
	}



}
