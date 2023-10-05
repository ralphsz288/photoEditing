package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Colorize implements Filter {
	private final float level;
	private final Color c2;
	public Colorize(float level,Color c2) {
		this.level=level;
		this.c2=c2;
	}

	@Override
	public Color transform(Color c) {
		int r2=c.getRed()+c2.getRed();
		int b2=c.getBlue()-c2.getBlue();
		int g2=c.getGreen()-c2.getGreen();
		float r=(float) r2;
		float b=(float) b2;
		float g=(float) g2;
		r=r/255f*(level/100f);
		r=Math.max(0, Math.min(255, r));
		g=g*(level/100f);
		g=Math.max(0, Math.min(255, g));
		b=b*(level/100f);
		b=Math.max(0,Math.min(255, b));
		int a=c.getAlpha();
		Color col=new Color(Math.round(r),Math.round(g),Math.round(b),a);
		return col;
	}

}
