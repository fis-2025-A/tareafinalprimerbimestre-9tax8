package Ejercicio4;

import java.awt.Point;
//lo nuevo
import java.awt.Graphics;

public abstract class Shape {

	    protected Point location;
	    protected int[] dimensions;

	    public Shape(Point location){
	        setLocation(location);
	    }

	    public int[] getDimensions(){
	        return dimensions;
	    }
	    public void setDimensions(int[] dim){
	        this.dimensions = dim;
	    }

	    public Point getLocation(){
	        return location;
	    }

	    public void setLocation(Point location){
	        this.location = location;
	    }	  
//lo nuevo 
	    public abstract double getArea();
	    public abstract void draw(Graphics g);	    
}

