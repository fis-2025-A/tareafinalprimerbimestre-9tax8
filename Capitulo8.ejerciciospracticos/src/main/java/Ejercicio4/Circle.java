package Ejercicio4;

import java.awt.Point;
import java.awt.Graphics;

public class Circle extends OneDimensionalShape {
	
	public Circle (Point location,int height) {
		super(location, height);
	}
	
	public double getArea(){
		return (Math.PI * (Math.pow(this.getDimension(),2.0)));
	}
	
	public void draw(Graphics g) {
		g.fillOval(getLocation().x, getLocation().y, getDimension(),getDimension());
	}
	
}
