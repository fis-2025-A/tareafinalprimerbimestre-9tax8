package Ejercicio8;

public class AverageCalculator implements IAverage {
    
  
    public void displayArray(double[] numbers) {
        System.out.print("Array: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

	@Override
	public double getMean(double[] numbers) {
		// TODO Auto-generated method stub
		return 0;
	}
}