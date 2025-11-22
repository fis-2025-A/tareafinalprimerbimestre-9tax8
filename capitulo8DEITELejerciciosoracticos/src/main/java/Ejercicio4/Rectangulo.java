package Ejercicio4;

public class Rectangulo {
	private double longitud=1.0; 
	private double anchura=1.0;
	
	
	//constructor por defecto
	public Rectangulo() {
	}
	
	public double getLongitud() {
		return longitud;
	}

	public double getAnchura() {
		return anchura;
	}

	//constructor con párametros
	public Rectangulo(double longitud, double anchura) {
			setLongitud(longitud); 
	        setAnchura(anchura);
		}
	
	//metodos
	public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }
		
	public double calcularArea() {
        return longitud * anchura;
    }
	
	public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            System.out.println("Error: La longitud debe ser mayor a 0.0 y menor a 20.0");
        }
    }
    
    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        } else {
            System.out.println("Error: La anchura debe ser mayor a 0.0 y menor a 20.0");
        }
    }
	
	
}
