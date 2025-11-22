package Ejercicio4;
import java.awt.Point;
import java.awt.Graphics;

public class Rectangle extends TwoDimensionalShape {
    public Rectangle(Point location, int height, int width) {
        super(location, height, width);
    }

    @Override
    public double getArea() {
        return (this.getHeight() * this.getWidth());
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(getLocation().x, getLocation().y, getHeight(), getWidth());
    }
}

