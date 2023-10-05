package com.ralph.imageeditor.layers;

import com.ralph.imageeditor.blend.BlendMode;
import com.ralph.imageeditor.blend.NullBlend;
import com.ralph.imageeditor.filters.Filter;

import ro.itschool.pixels.Color;
import ro.itschool.pixels.Image;

public abstract class Layer {
	private final int x;
	private final int y;
	private final int width;
	private final int height;
	private Filter filter;
	private BlendMode blend=new NullBlend();

	public Layer(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	public void setBlend(BlendMode b) {
		this.blend=b;
	}

	protected abstract Color getPixel(int x, int y);

	public void apply(Image image) {
		for (int x = 0; x < this.getWidth(); x++) {
			for (int y = 0; y < this.getHeight(); y++) {
				Color c = this.getPixel(x, y);
				int finalX = x + this.getX();
				int finalY = y + this.getY();
				if (finalX < 0 || finalX >= image.getWidth()) {
					continue;
				}
				if (finalY < 0 || finalY >= image.getHeight()) {
					continue;
				}
			    Color finalColor;
				if (this.filter == null) {
					finalColor=c;
				} else {
					finalColor=this.filter.transform(c);
				}
				Color c2=image.getPixel(finalX, finalY);
				finalColor=blend.combine(c2,finalColor);
				image.putPixel(finalX, finalY, finalColor);

			}

		}

	}

}
