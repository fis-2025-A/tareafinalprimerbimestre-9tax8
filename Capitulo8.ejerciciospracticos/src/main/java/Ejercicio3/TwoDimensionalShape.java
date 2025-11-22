package Ejercicio3;
import java.awt.Point;
public abstract class TwoDimensionalShape extends Shape {

	    public TwoDimensionalShape(Point location, int dimension1, int dimension2) {
	        super(location);
	        int[] tempArray = {dimension1, dimension2};
	        setDimensions(tempArray);
	    }

	    public int getHeight() {
	        return dimensions[0];
	    }

	    public int getWidth() {
	        return dimensions[1];
	    }

	    @Override
	    public void setDimensions(int[] dim) {
	        if (dim.length == 2) {
	            super.setDimensions(dim);
	        }
	    }

}
