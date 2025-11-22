package Ejercicio6;
import java.awt.Graphics;
import java.awt.Graphics2D; // Importamos Graphics2D
import java.awt.Point;

public class Oval extends TwoDimensionalShape implements Drawable {
    public Oval(Point location, int height, int width) {
        super(location, height, width);
    }

    @Override
    public double getArea() {
        return Math.PI * 0.25 * getHeight() * getWidth();
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
        
       
        g2d.fillOval(x, y, w, h);
        
        g2d.dispose();
    }
}