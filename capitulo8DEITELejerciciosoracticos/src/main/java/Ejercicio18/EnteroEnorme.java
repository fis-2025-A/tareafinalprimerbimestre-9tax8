package Ejercicio18;

public class EnteroEnorme {
private int[] digitos;  
    
   
    public EnteroEnorme() {
        digitos = new int[40];
    }


    public void parse(String numero) {
  
        if (numero.length() > 40) {
            throw new IllegalArgumentException("El número no puede tener más de 40 dígitos.");
        }

        for (int i = 0; i < numero.length(); i++) {
            digitos[39 - i] = numero.charAt(numero.length() - 1 - i) - '0';
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        
        for (int i = 0; i < 40; i++) {
            if (digitos[i] != 0 || !leadingZero) {
                sb.append(digitos[i]);
                leadingZero = false;
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString();  
    }


    public EnteroEnorme sumar(EnteroEnorme otro) {
        EnteroEnorme resultado = new EnteroEnorme();
        int carry = 0;

        for (int i = 39; i >= 0; i--) {
            int suma = this.digitos[i] + otro.digitos[i] + carry;
            resultado.digitos[i] = suma % 10;
            carry = suma / 10;
        }

        return resultado;
    }

    public EnteroEnorme restar(EnteroEnorme otro) {
        EnteroEnorme resultado = new EnteroEnorme();
        int borrow = 0;

   
        for (int i = 39; i >= 0; i--) {
            int resta = this.digitos[i] - otro.digitos[i] - borrow;
            if (resta < 0) {
                resta += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            resultado.digitos[i] = resta;
        }

        return resultado;
    }

    public EnteroEnorme multiplicar(EnteroEnorme otro) {
        EnteroEnorme resultado = new EnteroEnorme();

        // Multiplicación de cada dígito
        for (int i = 39; i >= 0; i--) {
            int carry = 0;
            for (int j = 39; j >= 0; j--) {
                int producto = this.digitos[i] * otro.digitos[j] + resultado.digitos[i + j - 39] + carry;
                resultado.digitos[i + j - 39] = producto % 10;
                carry = producto / 10;
            }
        }

        return resultado;
    }

 
    public EnteroEnorme dividir(EnteroEnorme otro) {
   
        EnteroEnorme resultado = new EnteroEnorme();
   
        return resultado;
    }


    public EnteroEnorme residuo(EnteroEnorme otro) {
        
        EnteroEnorme resultado = new EnteroEnorme();
 
        return resultado;
    }


    public boolean esIgualA(EnteroEnorme otro) {
        for (int i = 0; i < 40; i++) {
            if (this.digitos[i] != otro.digitos[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean noEsIgualA(EnteroEnorme otro) {
        return !esIgualA(otro);
    }

    public boolean esMayorQue(EnteroEnorme otro) {
        for (int i = 0; i < 40; i++) {
            if (this.digitos[i] > otro.digitos[i]) {
                return true;
            } else if (this.digitos[i] < otro.digitos[i]) {
                return false;
            }
        }
        return false;  
    }

    public boolean esMenorQue(EnteroEnorme otro) {
        return !esMayorQue(otro) && !esIgualA(otro);
    }

    public boolean esMayorOIgualA(EnteroEnorme otro) {
        return esMayorQue(otro) || esIgualA(otro);
    }

    public boolean esMenorOIgualA(EnteroEnorme otro) {
        return esMenorQue(otro) || esIgualA(otro);
    }

    public boolean esCero() {
        for (int i = 0; i < 40; i++) {
            if (digitos[i] != 0) {
                return false;
            }
        }
        return true;
    }
}