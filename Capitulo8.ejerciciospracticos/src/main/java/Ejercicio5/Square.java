package Ejercicio5;

import java.awt.Graphics;
import java.awt.Graphics2D; // Importamos Graphics2D
import java.awt.Point;

public class Square extends OneDimensionalShape {
    public Square(Point location, int size) {
        super(location, size);
    }

    @Override
    public double getArea() {
        return Math.pow(getDimension(), 2);
    }

    @Override
    public void draw(Graphics g) {
       
        
        Graphics2D g2d = (Graphics2D) g.create();
        
        int x = getLocation().x;
        int y = getLocation().y;
        int size = getDimension();
        
        int centerX = x + size / 2;
        int centerY = y + size / 2;

        g2d.rotate(Math.toRadians(orientation), centerX, centerY);
        
        g2d.fillRect(x, y, size, size);
        
        g2d.dispose();
    }
}