package Ejercicio6;
import java.awt.Graphics; 
import java.awt.Point;
import java.awt.Graphics2D; 

public class RightAngledTriangle extends TwoDimensionalShape implements Drawable {
    public RightAngledTriangle(Point location, int dimension1, int dimension2) {
        super(location, dimension1, dimension2);
    }

    @Override
    public double getArea() {
        return (this.getDimensions()[0] * this.getDimensions()[1]) / 2;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        
        int x = getLocation().x;
        int y = getLocation().y;
        int w = getWidth();
        int h = getHeight();
        
  
        int centerX = x + w / 2;
        int centerY = y + h / 2;
        
        g2d.rotate(Math.toRadians(orientation), centerX, centerY);
        

        int[] xValues = {x, x, x + w};
        int[] yValues = {y, y + h, y + h};
        g2d.fillPolygon(xValues, yValues, 3);
        
        g2d.dispose();
    }
}
