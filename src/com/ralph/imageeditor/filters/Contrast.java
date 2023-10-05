package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Contrast implements Filter {
	public final float adjustment;
	
	public Contrast(float adjustment) {
		this.adjustment=adjustment;
	}

	@Override
	public Color transform(Color c) {
		int r2=c.getRed();
		int b2=c.getBlue();
		int g2=c.getGreen();
		int a=c.getAlpha();
		float r=(float) r2;
		float b=(float) b2;
		float g=(float) g2;
		r/=255;
		r-=0.5;
		r*=adjustment;
		r+=0.5;
		r*=255;
		r=Math.max(0, Math.min(255,r));
		g/=255;
		g-=0.5;
		g*=adjustment;
		g+=0.5;
		g*=255;
		g=Math.max(0, Math.min(255,g));
		b/=255;
		b-=0.5;
		b*=adjustment;
		b+=0.5;
		b*=255;
		b=Math.max(0, Math.min(255,b));
		Color col=new Color(Math.round(r),Math.round(g),Math.round(b),a);
		return col;
		
		
		
	}

}
