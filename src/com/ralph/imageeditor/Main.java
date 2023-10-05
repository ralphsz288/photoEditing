package com.ralph.imageeditor;

import ro.itschool.pixels.Image;

import java.io.IOException;

import com.ralph.imageeditor.blend.AddBlend;
import com.ralph.imageeditor.blend.BlendMode;
import com.ralph.imageeditor.blend.DarkenBlend;
import com.ralph.imageeditor.blend.DivideBlend;
import com.ralph.imageeditor.blend.LightenBlend;
import com.ralph.imageeditor.blend.MultiplyBlend;
import com.ralph.imageeditor.blend.OverlayBlend;
import com.ralph.imageeditor.blend.ScreenBlend;
import com.ralph.imageeditor.blend.SoftLightBlend;
import com.ralph.imageeditor.blend.SubtractBlend;
import com.ralph.imageeditor.filters.Brightness;
import com.ralph.imageeditor.filters.Colorize;
import com.ralph.imageeditor.filters.Combination;
import com.ralph.imageeditor.filters.Filter;
import com.ralph.imageeditor.filters.GrayScale;
import com.ralph.imageeditor.filters.Invert;
import com.ralph.imageeditor.filters.Saturation;
import com.ralph.imageeditor.filters.Sepia;
import com.ralph.imageeditor.filters.Vibrance;
import com.ralph.imageeditor.frames.Home;
import com.ralph.imageeditor.layers.GradientLayer;
import com.ralph.imageeditor.layers.ImageLayer;
import com.ralph.imageeditor.layers.Layer;
import com.ralph.imageeditor.layers.SolidLayer;
import com.ralph.imageeditor.filters.Contrast;

import ro.itschool.pixels.Color;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Layer l=new SolidLayer(0,0,100,100,Color.BLUE);
		Image im = Image.load("C:\\Users\\User\\Downloads\\Photo.png");
	    Image im2=Image.load("C:\\Users\\User\\Downloads\\pisica2.png");
	    Image im3=Image.load("C:\\Users\\User\\Downloads\\ferrarilogo.png");
	    Image im4=Image.load("C:\\Users\\User\\Downloads\\Landscape.jpg");
	    Image im5=Image.load("C:\\Users\\User\\Downloads\\city.jpg");
	    Image im6=Image.load("C:\\Users\\User\\Downloads\\ironman3.jfif");
	    Image im7=Image.load("C:\\Users\\User\\Downloads\\furia.png");
	    Image im8=Image.load("C:\\Users\\User\\Downloads\\android.jpg");
	    
	    Layer peisaj=new ImageLayer(0,0,im);
	    Layer pisica=new ImageLayer(0,0,im2);
	    Layer ferrari=new ImageLayer(150,20,im3);
	    Layer ceva=new ImageLayer(0,0,im4);
	    Layer city=new ImageLayer(0,0,im5);
	    Layer iron=new ImageLayer(160,25,im6);
	    Layer furia=new ImageLayer(0,200,im7);
	    Layer android=new ImageLayer(280,230,im8);
	    
        Filter f1=new Brightness(15);
        Filter f2=new Colorize(75,Color.BLUE);
        Filter f3=new Contrast(2);
        Filter f4=new GrayScale();
        Filter f5=new Invert();
        Filter f6=new Saturation(1);
        Filter f7=new Sepia();
        Filter f8=new Vibrance(100);
        
        BlendMode b1=new DivideBlend();
        BlendMode b2=new SubtractBlend();
        BlendMode b3=new MultiplyBlend();
        BlendMode b4=new AddBlend();
        BlendMode b5=new DarkenBlend();
        BlendMode b6=new LightenBlend();
        BlendMode b7=new OverlayBlend();
        BlendMode b8=new ScreenBlend();
        BlendMode b9=new SoftLightBlend();
        
        
        ceva.setFilter(f3);
        peisaj.setFilter(f8);
        ferrari.setBlend(b1);
        pisica.setBlend(b3);
        city.setFilter(f5);
        iron.setFilter(f8);
        iron.setBlend(b3);
        furia.setBlend(b2);
        android.setFilter(f1);
        android.setBlend(b5);
		

		Workspace ws=new Workspace(peisaj.getWidth(),peisaj.getHeight());
		
		//ws.addLayer(peisaj);
		//ws.addLayer(ferrari);
		
		//ws.addLayer(ceva);
		//ws.addLayer(pisica);
		
		//ws.addLayer(city);
		//ws.addLayer(iron);
		
		ws.addLayer(ceva);
		ws.addLayer(iron);
		ws.addLayer(furia);
		ws.addLayer(android);
		
		
		ws.save("test.png");
		
		//Home home=new Home();
		//home.setVisible(true);
	
		
		

		

	}

}
//5 blendmodes add multiply overlay screen+unu la alegere