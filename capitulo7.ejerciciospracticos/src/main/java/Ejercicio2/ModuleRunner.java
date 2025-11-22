package Ejercicio2;

public class ModuleRunner {

	public static void main(String[] args) {
		 
		 Course myCourse = new Course("Software testing", 5, 2000);
		 Module module1 = new Module("Unit testing", 10, "Practicum");
		 Module module2 = new Module("Acceptance testing", 20, "Coursework");
		 Module module3 = new Module("Boundary Values", 10, "none");
		
		 
		 // add the modules to the course
		 myCourse.addModule(module1);
		 myCourse.addModule(module2);
		 myCourse.addModule(module3);
		 
		 
		 // display the course details
		 System.out.println(myCourse.getName()+ " contains the following modules:");
		 System.out.println("Module name \t credit points \t assessment");
		 
		 for (int i = 0; i < myCourse.getModuleCount(); i++) {
		 System.out.println(myCourse.getModules()[i].getName() + '\t' 
				 + myCourse.getModules()[i].getCreditPoints() + 
				'\t' + myCourse.getModules()[i].getAssessment());
				 }
		 System.out.println("Total credits = " +myCourse.getTotalCredits());
				 }
}
