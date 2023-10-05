package com.ralph.imageeditor.blend;

import ro.itschool.pixels.Color;

public class NullBlend implements BlendMode{

	@Override
	public Color combine(Color a, Color b) {
		return b;
	}

}
