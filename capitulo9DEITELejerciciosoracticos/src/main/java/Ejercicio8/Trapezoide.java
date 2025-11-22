package Ejercicio8;
public class Trapezoide extends Cuadrilatero{
	//Atributos
    private int baseMayor;
    private int baseMenor;
    private int altura;

    //Generar getters y setters

    public int getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    //Generar el constructor


    public Trapezoide(int[] x, int[] y, int baseMayor,int baseMenor, int altura) {
        super(x, y);
        this.baseMayor= baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;;
    }
    //metodo para calcular el area
    public int calcularArea(){
        return ((baseMayor+ baseMenor)*altura)/2;
    }
}