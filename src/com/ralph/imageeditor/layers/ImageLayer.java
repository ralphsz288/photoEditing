package com.ralph.imageeditor.layers;

import ro.itschool.pixels.Color;
import ro.itschool.pixels.Image;

public class ImageLayer extends Layer {

	private final Image image;

	public ImageLayer(int x, int y, Image image) {
		super(x, y, image.getWidth(), image.getHeight());
		this.image = image;
	}

	@Override
	protected Color getPixel(int x, int y) {
		return image.getPixel(x, y);
	}

}
