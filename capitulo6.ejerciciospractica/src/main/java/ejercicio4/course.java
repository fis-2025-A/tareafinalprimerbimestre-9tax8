package ejercicio4;

public class course {

	private String name;
	private int numberOfDays;
	private double pricePerPerson;
	private int maximumParticipants;
	
	//cambios 
	public static final String TRAINING_COMPANY_NAME = "Formación Tech S.A.";
	
	public static double calculateCustomCostPerHead(double flatRate, int numberOfParticipants) {
	   
	    if (numberOfParticipants <= 0) {
	        System.out.println("El número de participantes debe ser mayor que 0.");
	        return 0.0; 
	    }
	    return flatRate / numberOfParticipants;
	}
	
	
	public double discountedCostPerPerson(int percentDiscount) {
	    if (percentDiscount < 0 || percentDiscount > 100) {
	        System.out.println("Invalid discount percentage. Must be between 0 and 100.");
	        return pricePerPerson; // devuelve el precio normal si el descuento es inválido
	    }
	    double discountFactor = (100 - percentDiscount) / 100.0;
	    return pricePerPerson * discountFactor;
	}
	
	public course() {
		this ("Unnamed Course",3,100.0,20);
	}
	/**
	 * @param name
	 * @param numberOfDays
	 * @param pricePerPerson
	 * @param maximumParticipants
	 */
	public course(String name, int numberOfDays, double pricePerPerson, int maximumParticipants) {
		super();
		this.name = name;
		this.numberOfDays = numberOfDays;
		this.pricePerPerson = pricePerPerson;
		this.maximumParticipants = maximumParticipants;
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
	 * @return the numberOfDays
	 */
	public int getNumberOfDays() {
		return numberOfDays;
	}
	/**
	 * @param numberOfDays the numberOfDays to set
	 */
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	/**
	 * @return the pricePerPerson
	 */
	public double getPricePerPerson() {
		return pricePerPerson;
	}
	/**
	 * @param pricePerPerson the pricePerPerson to set
	 */
	public void setPricePerPerson(double pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
	}
	/**
	 * @return the maximumParticipants
	 */
	public int getMaximumParticipants() {
		return maximumParticipants;
	}
	/**
	 * @param maximumParticipants the maximumParticipants to set
	 */
	
	public void setMaximumParticipants(int maximumParticipants) {
		if (maximumParticipants>0) {
		this.maximumParticipants = maximumParticipants;
	}else {
		System.out.println("Número inválido de participantes. Se asigna 1 por defecto.");
		this.maximumParticipants=1;
		}
	}

}
