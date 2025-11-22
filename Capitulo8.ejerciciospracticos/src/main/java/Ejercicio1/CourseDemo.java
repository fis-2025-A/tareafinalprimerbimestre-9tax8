package Ejercicio1;


public class CourseDemo {
    public static void main(String[] args) {
	      
	        Course course1 = new Course("Computer Science", 3, 15000.0);
	        course1.addModule(new Module("Programming", 5));
	        course1.addModule(new Module("Data Structures", 4));
	        course1.addModule(new Module("Algorithms", 6));

	 
	        Course course2 = new Course("Computer Science", 3, 15000.0);
	        course2.addModule(new Module("Programming", 5));
	        course2.addModule(new Module("Data Structures", 4));
	        course2.addModule(new Module("Algorithms", 6));

	        Course course3 = new Course("Mathematics", 4, 12000.0);
	        course3.addModule(new Module("Calculus", 5));
	        course3.addModule(new Module("Algebra", 4));


	        System.out.println("=== toString() Demonstration ===");
	        System.out.println("Course 1: " + course1.toString());
	        System.out.println("Course 2: " + course2.toString());
	        System.out.println("Course 3: " + course3.toString());
	        System.out.println();

	        System.out.println("=== equals() Demonstration ===");
	        System.out.println("course1.equals(course2): " + course1.equals(course2));
	        System.out.println("course1.equals(course3): " + course1.equals(course3));
	        System.out.println("course1.equals(null): " + course1.equals(null));
	        System.out.println("course1.equals(\"Not a course\"): " + course1.equals("Not a course"));
	        System.out.println();


	        System.out.println("=== hashCode() Demonstration ===");
	        System.out.println("course1.hashCode(): " + course1.hashCode());
	        System.out.println("course2.hashCode(): " + course2.hashCode());
	        System.out.println("course3.hashCode(): " + course3.hashCode());
	        System.out.println();
	        System.out.println("=== hashCode() Consistency Check ===");
	        System.out.println("course1.hashCode() == course2.hashCode(): " + 
	                          (course1.hashCode() == course2.hashCode()));
	        System.out.println("If course1.equals(course2) is true, then their hashCodes should be equal: " + 
	                          (course1.equals(course2) == (course1.hashCode() == course2.hashCode())));
	    }
}

