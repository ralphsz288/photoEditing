package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Saturation implements Filter {
	private final float adjustment;
	public Saturation(float adjustment) {
		this.adjustment=adjustment;
	}

	@Override
	public Color transform(Color c) {
		
		int r2=c.getRed();
		int b2=c.getBlue();
		int g2=c.getGreen();
		float r=(float) r2;
		float b=(float) b2;
		float g=(float) g2;
		int a=c.getAlpha();
		float m=Math.max(r,Math.max(g, b));
		if(r!=m)
			r+=(m-r)*(adjustment);
		if(b!=m)
			b+=(m-b)*(adjustment);
		if(g!=m)
			g+=(m-g)*(adjustment);
		r=Math.max(0,Math.min(255, r));
		g=Math.max(0, Math.min(255, g));
		b=Math.max(0, Math.min(255, b));
		
		Color col=new Color(Math.round(r),Math.round(g),Math.round(b),a);
		
		
		
		return col;
	}

}
