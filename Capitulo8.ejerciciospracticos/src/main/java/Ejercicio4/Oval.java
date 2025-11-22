package Ejercicio4;

import java.awt.Graphics;
import java.awt.Point;

public class Oval extends TwoDimensionalShape {
    public Oval(Point location, int height, int width) {
        super(location, height, width);
    }

    @Override
    public double getArea() {
        return Math.PI * 0.25 * getHeight() * getWidth();
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(getLocation().x, getLocation().y, getHeight(), getWidth());
    }
}

