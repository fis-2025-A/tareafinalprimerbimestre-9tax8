package Ejercicio9;

public class Fecha {
	private int mes; // 1-12
	private int dia; // 1-31 con base en el mes
	private int anio; // cualquier año

	// constructor: llama a comprobarMes para confirmar el valor apropiado para el mes;
	// llama a comprobarDia para confirmar el valor apropiado para el día
	public Fecha( int elMes, int elDia, int elAnio ) {
		mes = comprobarMes( elMes ); // valida el mes
		anio = elAnio; // pudo validar el año
		dia = comprobarDia( elDia ); // valida el día

		System.out.printf("Constructor de objeto Fecha para la fecha %s\n", this );
	} // fin del constructor de Fecha

	// método utilitario para confirmar el valor apropiado del mes
	private int comprobarMes( int mesPrueba ) {
		if ( mesPrueba > 0 && mesPrueba <= 12 ) // valida el mes
			return mesPrueba;
		else // mes es inválido
		{
			System.out.printf("Mes invalido (%d) se establecio en 1.", mesPrueba );
			return 1; // mantiene el objeto en estado consistente
		} // fin de else
	} // fin del método comprobarMes

	// método utilitario para confirmar el valor apropiado del día, con base en el mes y el año
	private int comprobarDia( int diaPrueba ) {
		int diasPorMes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// comprueba si el día está dentro del rango para el mes
		if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
			return diaPrueba;

		// comprueba si es año bisiesto
		if ( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 ||
				( anio % 4 == 0 && anio % 100 != 0 ) ) )
			return diaPrueba;

		System.out.printf( "Dia invalido (%d) se establecio en 1.", diaPrueba );
		return 1; // mantiene el objeto en estado consistente
	} // fin del método comprobarDia

	// devuelve un objeto String de la forma mes/dia/anio
	public String toString() {
		return String.format( "%d/%d/%d", mes, dia, anio );
	} // fin del método toString

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
} // fin de la clase Fecha