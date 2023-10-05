package com.ralph.imageeditor.filters;

import ro.itschool.pixels.Color;

public class Sepia implements Filter {

	@Override
	public Color transform(Color c) {
		int r2=c.getRed();
		int b2=c.getBlue();
		int g2=c.getGreen();
		float r=(float) r2;
		float b=(float) b2;
		float g=(float) g2;
		int a=c.getAlpha();
		r=r/255;
		g=g/255;
		b=b/255;
		r=(r* .393f) + (g * .796f) + (b* .189f);
		g=(r* .349f) + (g* .686f) +(b* .186f);
		b= (r* .272f) + (g* .534f) + (b* .131f);
		
		int nr= (int) Math.max(0,Math.min(255, r*255f));
		int ng=(int) Math.max(0, Math.min(255, g*255f));
		int nb=(int) Math.max(0, Math.min(255, b)*255f);
		Color col=new Color(nr,ng,nb,a);
		return col;
		
		
	
	}

}
