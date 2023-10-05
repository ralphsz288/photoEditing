package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Vibrance implements Filter {
	private final float adjustment;
	public Vibrance(float adjustment) {
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
		float m=Math.max(r, Math.max(g, b));
		float avg=(r+g+b)/3f;
		float amount=( Math.abs(m-avg)*2/255)*(-adjustment)/100f;
		if(r!=m)
			r+=(m-r)*amount;
		if(b!=m)
			b+=(m-b)*amount;
		if(g!=m)
			g+=(m-g)*amount;
		r=Math.max(0,Math.min(255, r));
		g=Math.max(0, Math.min(255, g));
		b=Math.max(0, Math.min(255, b));
		Color col=new Color((int) r,(int) g ,(int) b,a);
		return col;
		
		
		
	}
	

} 
