package Ejercicio4;
import java.awt.Point;

public class ShapeAreas {
    public static void main(String[] args) {
        
 
        Shape[] shapes = {
            new Square(new Point(0,0), 250),
            new Rectangle(new Point(0,0), 25, 50),
            new Oval(new Point(0,0), 20, 10),
            new Circle(new Point(0,0), 10),
            new RoundedRectangle(new Point(0,0), 25, 50, 10),
            new RightAngledTriangle(new Point(0,0), 100, 50),
            
           
            new EquilateralTriangle(new Point(0,0), 75)
        };

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
          
            System.out.printf("El área de %-20s es %.2f%n",
                              shape.getClass().getSimpleName(),
                              shape.getArea());
        }
    }
}
