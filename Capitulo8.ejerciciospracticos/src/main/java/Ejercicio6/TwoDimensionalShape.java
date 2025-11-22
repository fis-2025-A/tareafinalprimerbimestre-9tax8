package Ejercicio6;
import java.awt.Point;

// 1. AÑADIMOS "implements Transformable"
public abstract class TwoDimensionalShape extends Shape implements Transformable {

	    public TwoDimensionalShape(Point location, int dimension1, int dimension2) {
	        super(location);
	      
	        int[] tempArray = {dimension1, dimension2};
	        setDimensions(tempArray);
	    }

	    public int getHeight() {
	        return dimensions[0]; // Devuelve alto
	    }

	    public int getWidth() {
	        return dimensions[1]; // Devuelve ancho
	    }

	  
	    public void setDimensions(int[] dim) {
	        if (dim.length == 2) {
	            super.setDimensions(dim);
	        }
	    }
	    
	  
	    @Override
	    public void switchDimensions() {
	        int temp = dimensions[0];      
	        dimensions[0] = dimensions[1]; 
	        dimensions[1] = temp;         
	    }
}
