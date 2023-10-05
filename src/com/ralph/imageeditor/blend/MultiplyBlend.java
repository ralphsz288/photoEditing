package com.ralph.imageeditor.blend;

import ro.itschool.pixels.Color;

public class MultiplyBlend extends AbstractBlendMode{
	@Override
	public float calculatedBlend(float fa,float fb) {
		return fa*fb;
	}
}
