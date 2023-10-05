package com.ralph.imageeditor.blend;

public class DivideBlend extends AbstractBlendMode {

	@Override
	protected float calculatedBlend(float fa, float fb) {
		return fa/fb;
	}

}
