package com.ralph.imageeditor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ralph.imageeditor.layers.Layer;

import ro.itschool.pixels.Image;

public class Workspace {
	
	private final int x;
	private final int y;
	private final List<Layer>layers;

	public Workspace(int x,int y) {
		this.x=x;
		this.y=y;
		this.layers=new ArrayList<>();
		
	}
	
	public void save(String path) throws IOException {
		 final Image image=new Image(x,y);
		 for(int i=0;i<layers.size();i++) {
			 layers.get(i).apply(image);
		 }
		 image.write(path);
		
	}
	
	public void addLayer(Layer l) {
		layers.add(l);	
	}
	
	
	
	
	


}
