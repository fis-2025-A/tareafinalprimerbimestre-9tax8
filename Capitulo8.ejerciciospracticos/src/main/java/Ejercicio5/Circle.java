package Ejercicio5;

import java.awt.Point; 
import java.awt.Graphics;
import java.awt.Graphics2D; // Importamos Graphics2D

public class Circle extends OneDimensionalShape {
	
	public Circle (Point location,int dimension) {
		super(location, dimension); 
	}
	
	public double getArea(){
	    double radius = getDimension() / 2.0;
		return (Math.PI * (Math.pow(radius, 2.0)));
	}
	
	public void draw(Graphics g) {

	    
	    Graphics2D g2d = (Graphics2D) g.create();
	    
	    int x = getLocation().x;
	    int y = getLocation().y;
	    int d = getDimension(); 
	    
	    int centerX = x + d / 2;
	    int centerY = y + d / 2;
	    
	    g2d.rotate(Math.toRadians(orientation), centerX, centerY);
	    
		g2d.fillOval(x, y, d, d);
		
		g2d.dispose();
	}
}