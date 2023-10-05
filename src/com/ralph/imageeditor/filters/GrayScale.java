package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class GrayScale implements Filter {
	@Override
	public Color transform(Color c) {
		int r=c.getRed();
		int b=c.getBlue();
		int g=c.getGreen();
		int a=c.getAlpha();
		int m=(r+b+g)/3;
		Color col=new Color(m,m,m,a);
		return col;
		
	}
	

}
