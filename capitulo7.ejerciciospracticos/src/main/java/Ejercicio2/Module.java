package Ejercicio2;

public class Module {

	 private String name;
	 private int creditPoints;
	 private String assessment;
	 
	 public Module(String name, int points, String assess)
	 {
		 setName(name);
		 setCreditPoints(points);
		 setAssessment(assess);
	}

	 /**
 	 * @return the name
 	 */
	 public String getName() {
		 return name;
	 }

	 /**
 	 * @param name the name to set
 	 */
	 public void setName(String name) {
		 this.name = name;
	 }

	 /**
 	 * @return the creditPoints
 	 */
	 public int getCreditPoints() {
		 return creditPoints;
	 }

	 /**
 	 * @param creditPoints the creditPoints to set
 	 */
	 public void setCreditPoints(int creditPoints) {
		 this.creditPoints = creditPoints;
	 }

	 /**
 	 * @return the assessment
 	 */
	 public String getAssessment() {
		 return assessment;
	 }

	 /**
 	 * @param assessment the assessment to set
 	 */
	 public void setAssessment(String assessment) {
		 this.assessment = assessment;
	 }
 
}
