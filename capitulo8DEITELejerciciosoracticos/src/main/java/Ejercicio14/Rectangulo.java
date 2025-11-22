package Ejercicio14;

public class Rectangulo {
    private double x1, y1; 
    private double x2, y2; 
    
 
    public Rectangulo() {
        establecerCoordenadas(0.0, 0.0, 1.0, 1.0);
    }

    public Rectangulo(double x1, double y1, double x2, double y2) {
        establecerCoordenadas(x1, y1, x2, y2);
    }
    
    public void establecerCoordenadas(double x1, double y1, double x2, double y2) {
        // Verificar que todas las coordenadas estén en el primer cuadrante (0-20.0)
        if (!estaEnPrimerCuadrante(x1, y1) || !estaEnPrimerCuadrante(x2, y2)) {
            throw new IllegalArgumentException("Todas las coordenadas deben estar en el primer cuadrante (0.0 - 20.0)");
        }
 
        if (x1 >= x2 || y1 >= y2) {
            throw new IllegalArgumentException("Las coordenadas no forman un rectángulo válido. x1 < x2 y y1 < y2");
        }
        
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
   
    private boolean estaEnPrimerCuadrante(double x, double y) {
        return x >= 0.0 && x <= 20.0 && y >= 0.0 && y <= 20.0;
    }
    

    public double calcularLongitud() {
        double base = x2 - x1;
        double altura = y2 - y1;
        return Math.max(base, altura);
    }
    

    public double calcularAnchura() {
        double base = x2 - x1;
        double altura = y2 - y1;
        return Math.min(base, altura);
    }
    

    public double calcularPerimetro() {
        double base = x2 - x1;
        double altura = y2 - y1;
        return 2 * (base + altura);
    }

    public double calcularArea() {
        double base = x2 - x1;
        double altura = y2 - y1;
        return base * altura;
    }
    

    public boolean esCuadrado() {
        double base = x2 - x1;
        double altura = y2 - y1;
        return Math.abs(base - altura) < 0.0001; // Usamos tolerancia para comparación de doubles
    }
    

    public double getX1() { return x1; }
    public double getY1() { return y1; }
    public double getX2() { return x2; }
    public double getY2() { return y2; }
    

    public String toString() {
        return String.format("Rectángulo[(%.1f,%.1f)-(%.1f,%.1f)]", x1, y1, x2, y2);
    }
}