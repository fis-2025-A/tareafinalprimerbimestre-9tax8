package Ejercicio13;

public class Tiempo22 {
	private int segundosDesdeMedianoche;  
	public Tiempo22() {
		this (0 , 0 , 0 );
	}
	
	public Tiempo22(int hora) {
		this (hora, 0 , 0 ); 
	}

	public Tiempo22(int hora, int minuto) {
		this ( hora, minuto, 0 ); 
	}

	public Tiempo22(int hora, int minuto, int segundo) {
		if(hora < 0 || hora >= 24) {
			throw new IllegalArgumentException("hora debe estar entre 0 y 23");
		}
		if(minuto < 0 || minuto >= 60) {
			throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
		}
		if(segundo < 0 || segundo >= 60) {
			throw new IllegalArgumentException("segundo debe estar entre 0 u 59");
		}

      segundosDesdeMedianoche = hora * 3600 + minuto * 60 + segundo;
	}

	public Tiempo22(Tiempo22 tiempo) {
		// invoca al constructor con tres argumentos 
		this (tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
	}
	
	
	public void establecerTiempo(int hora, int minuto, int segundo) {
		if (hora < 0 || hora >= 24) {
			throw new IllegalArgumentException ("hora debe estar entre 0 y 23");
		}
		if (minuto < 0 || minuto >= 60) {
			throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
		}
		if (segundo < 0 || segundo >= 60) {
			throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
		}

      segundosDesdeMedianoche = hora * 3600 + minuto * 60 + segundo;
	}

	public void establecerHora(int hora) {
		if(hora < 0 || hora >= 24) {
			throw new IllegalArgumentException ("hora debe estar entre 0 y 23");
		}
	
      segundosDesdeMedianoche = (hora * 3600) + (obtenerMinuto() * 60) + obtenerSegundo();
	}

	public void establecerMinuto(int minuto) {
		if(minuto < 0 && minuto >= 60) {
			throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
		}

      segundosDesdeMedianoche = (obtenerHora() * 3600) + (minuto * 60) + obtenerSegundo();
	}
	
	public void establecerSegundo(int segundo) {
		if(segundo >= 0 && segundo < 60) {
			throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
		}
		
      segundosDesdeMedianoche = (obtenerHora() * 3600) + (obtenerMinuto() * 60) + segundo;
	}
	


  public int obtenerHora() {
      return segundosDesdeMedianoche / 3600;  
  }

  public int obtenerMinuto() {
      return (segundosDesdeMedianoche % 3600) / 60;  
  }

  public int obtenerSegundo() {
      return segundosDesdeMedianoche % 60; 
  }
	

	public String aStringUniversal() {
		return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
	}
	

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12), obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
	}

  public void tictac() {
      segundosDesdeMedianoche++; 
      if (segundosDesdeMedianoche >= 86400) {
          segundosDesdeMedianoche = 0; 
      }
  }


  public void incrementarMinuto() {
      segundosDesdeMedianoche += 60;  

      if (segundosDesdeMedianoche >= 86400) {
          segundosDesdeMedianoche = 0;  
      }
  }


  public void incrementarHora() {
      segundosDesdeMedianoche += 3600;  
      if (segundosDesdeMedianoche >= 86400) {
          segundosDesdeMedianoche = 0;  
      }
  }
}
