package com.ralph.imageeditor.blend;

import ro.itschool.pixels.Color;

public class SoftLightBlend extends AbstractBlendMode {
	
	@Override
	protected float calculatedBlend(float fa, float fb) {
		if (fb>0.5f) {
			return 1-((1-fb)*(1-(fa-0.5f)));
		}else {
			return fb*(fa+0.5f);
		}
		
	}

} 
