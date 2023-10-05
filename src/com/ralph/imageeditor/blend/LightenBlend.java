package com.ralph.imageeditor.blend;

public class LightenBlend extends AbstractBlendMode {

	@Override
	protected float calculatedBlend(float fa, float fb) {
		if(fa>fb)
			return fa;
		else
			return fb;
	}

}
