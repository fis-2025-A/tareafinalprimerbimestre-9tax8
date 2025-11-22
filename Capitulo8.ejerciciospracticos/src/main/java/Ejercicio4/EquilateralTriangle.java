package Ejercicio4;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;


public class EquilateralTriangle extends OneDimensionalShape {


    public EquilateralTriangle(Point location, int sideLength) {
        super(location, sideLength);
    }

    @Override
    public double getArea() {
        // Math.sqrt(3) / 4 * Math.pow(getDimension(), 2)
        return (Math.sqrt(3.0) / 4.0) * Math.pow(getDimension(), 2.0);
    }

   
    @Override
    public void draw(Graphics g) {
  
        int side = getDimension();
        

        int apexX = getLocation().x;
        int apexY = getLocation().y;

        int height = (int) ( (Math.sqrt(3.0) / 2.0) * side );
        
       
        int x2 = apexX - (side / 2);
        int y2 = apexY + height;

        int x3 = apexX + (side / 2);
        int y3 = apexY + height;

        int[] xPoints = {apexX, x2, x3};
        int[] yPoints = {apexY, y2, y3};
        

        g.fillPolygon(xPoints, yPoints, 3);
    }
}
