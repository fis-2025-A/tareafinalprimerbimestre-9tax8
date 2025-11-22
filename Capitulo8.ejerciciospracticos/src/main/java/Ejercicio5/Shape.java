package Ejercicio5;

import java.awt.Point;
import java.awt.Graphics;

public abstract class Shape implements Rotatable {

    protected Point location;
    protected int[] dimensions;
    
  
    protected int orientation = 0; 

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
 
    public abstract double getArea();
    public abstract void draw(Graphics g);	    
    
 

    @Override
    public void rotate() {
        this.rotate(90); // Rota 90 grados
    }

    @Override
    public void rotate180() {
        this.rotate(180);
    }

    @Override
    public void rotateCounterClockwise() {
        this.rotate(-90); 
    }

    @Override
    public void rotate(int degrees) {
      
        this.orientation = (this.orientation + degrees) % 360;
        if (this.orientation < 0) {
            this.orientation += 360;
        }
    }
}
