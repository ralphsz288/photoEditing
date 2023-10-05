package com.ralph.imageeditor.blend;

public class DarkenBlend extends AbstractBlendMode {

	@Override
	protected float calculatedBlend(float fa, float fb) {
		if (fa>fb)
			return fb;
		else
			return fa;
		
		
	}

}
