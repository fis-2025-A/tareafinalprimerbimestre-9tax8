package Ejercicio2;

public class Prospecto {

	    private String nombre;
	    private Course[] courses; 
	    private int courseCount; 
	    private static final int MAX_COURSES = 20; 
	
	    public Prospecto(String nombre) {
	        this.nombre = nombre;
	        this.courses = new Course[MAX_COURSES];
	        this.courseCount = 0;
	    }

	    public void addCourse(Course newCourse) {
	        if (courseCount < MAX_COURSES) {
	            courses[courseCount] = newCourse;
	            courseCount++;
	        } else {
	            System.out.println("No se pueden agregar más cursos al prospecto.");
	        }
	    }


	    /**
	     * @return El nombre del prospecto.
	     */
	    public String getNombre() {
	        return nombre;
	    }

	    /**
	     * @return El array completo de objetos Course.
	     */
	    public Course[] getCourses() {
	        return courses;
	    }

	    /**
	     * @return El número de cursos que se han añadido.
	     */
	    public int getCourseCount() {
	        return courseCount;
	    }
	
}
