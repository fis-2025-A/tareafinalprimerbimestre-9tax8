package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        
        AverageCalculator calculator = new AverageCalculator();
     
        double[] numbers = {10.5, 20.3, 15.7, 8.2, 25.1};
     
        calculator.displayArray(numbers);
     
        double mean = ((IAverage) calculator).calculateMeanDefault(numbers);
        
        System.out.println("La media del array es: " + mean);
     
        double[] moreNumbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        calculator.displayArray(moreNumbers);
        double mean2 = ((IAverage) calculator).calculateMeanDefault(moreNumbers);
        System.out.println("La media del segundo array es: " + mean2);
        
        double[] emptyArray = {};
        calculator.displayArray(emptyArray);
        double mean3 = ((IAverage) calculator).calculateMeanDefault(emptyArray);
        System.out.println("La media del array vacío es: " + mean3);
    }
}