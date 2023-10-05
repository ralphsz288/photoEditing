package com.ralph.imageeditor.blend;

import ro.itschool.pixels.Color;

public class ScreenBlend extends AbstractBlendMode implements BlendMode {
	@Override
	public Color combine(Color a,Color b) {
		return new Color(blend(a.getRed(),b.getRed()),blend(a.getGreen(),b.getGreen()),blend(a.getBlue(),b.getBlue()),alphaBlend(a.getAlpha(),b.getAlpha()));			
	}
	private int blend(int a,int b) {
		float fa=(float) a;
		float fb=(float) b;
		fa=fa/255;
		fb=fb/255;
		float result=calculatedBlend(fa,fb);
		if(result>1) {
			result=1;
		}
	    if(result<0) {
	    	result=0;
	    }
	    return Math.round(result)*255;
		
		
	}
	private int alphaBlend(int a ,int b) {
		float fa=(float) a;
		float fb=(float) b;
		fa=fa/255;
		fb=fb/255;
		float result=1-(1-fa)*(1-fb);
		if(result>1) {
			result=1;
		}
	    if(result<0) {
	    	result=0;
	    }
	    return Math.round(result)*255;
	}
	
	


	@Override
	protected float calculatedBlend(float fa, float fb) {
		return 1-(1-fa)*(1-fb);
		
	
	}
	

}
