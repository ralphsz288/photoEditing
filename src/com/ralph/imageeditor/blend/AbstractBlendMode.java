package com.ralph.imageeditor.blend;

import ro.itschool.pixels.Color;

public abstract class AbstractBlendMode implements BlendMode{
	
	@Override
	public Color combine(Color a,Color b) {
		return new Color(
		blend(a.getRed(),b.getRed()),
		blend(a.getGreen(),b.getGreen()),
		blend(a.getBlue(),b.getBlue()),
		alphaBlend(a.getAlpha(),b.getAlpha())
		);
	}
	private int blend(int a, int b) {
		float fa=(float) a;
		float fb=(float) b;
		fa=fa/255f;
		fb=fb/255f;
		float result=calculatedBlend(fa,fb);
		if(result>1) {
			result=1;
		}
	    if(result<0) {
	    	result=0;
	    }
	    return (int) (result * 255); 
		
	}
	private int alphaBlend(int a,int b) {
		float fa=(float) a;
		float fb=(float) b;
		fa=fa/255f;
		fb=fb/255f;
		float result=fa+fb*(1-fa);
		if(result>1) {
			result=1;
		}
	    if(result<0) {
	    	result=0;
	    }
	    return (int) (result * 255); 
	}
	protected abstract float calculatedBlend(float fa,float fb);
	
	

}
