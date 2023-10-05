package com.ralph.imageeditor.blend;

import ro.itschool.pixels.Color;

public class OverlayBlend extends AbstractBlendMode implements BlendMode {
	@Override
	protected float calculatedBlend(float fa, float fb) {
		return fa*(fa+fb*2*(1-fa));
	}

}
