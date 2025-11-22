package Ejercicio5;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Graphics2D; 

public class RoundedRectangle extends Rectangle {
    private int cornerRadius;

    private int getCornerRadius() {
        return cornerRadius;
    }

    private void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

 
    public RoundedRectangle(Point location, int width, int height, int cornerRadius) {
        super(location, height, width); // Llama a super(loc, alto, ancho)
        setCornerRadius(cornerRadius);
    }

    @Override
    public double getArea() {
       
        double innerWidth = getHeight() - (getCornerRadius() * 2);
        double innerHeight = getWidth() - (getCornerRadius() * 2);
        return innerWidth * innerHeight + 2 * getCornerRadius() * (innerWidth + innerHeight) 
        		+ (Math.PI * Math.pow(this.getCornerRadius(), 2.0));
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
        

        g2d.fillRoundRect(
            x, y, w, h,
            getCornerRadius(), getCornerRadius());
            
        g2d.dispose();
    }
}



