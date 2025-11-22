package Ejercicio2;

public class ProspectoTest {
	public static void main(String[] args) {
        
     
        Course c1 = new Course("Fundamentos de Java", 40, 1000);
        Course c2 = new Course("Testing Avanzado", 20, 1500);
        Course c3 = new Course("Bases de Datos", 30, 1200);

  
        Prospecto myProspecto = new Prospecto("Plan de Estudios - Ingeniería de Software");

  
        myProspecto.addCourse(c1);
        myProspecto.addCourse(c2);
        myProspecto.addCourse(c3);

        System.out.println("Cursos en el prospecto: " + myProspecto.getNombre());
        System.out.println("----------------------------------------------");

  
        Course[] cursosDelProspecto = myProspecto.getCourses();
        int totalCursos = myProspecto.getCourseCount();

        for (int i = 0; i < totalCursos; i++) {
         
            System.out.println(" - " + cursosDelProspecto[i].getName());
        }

        System.out.println("\nTotal de cursos en el prospecto: " + totalCursos);
    }
}
