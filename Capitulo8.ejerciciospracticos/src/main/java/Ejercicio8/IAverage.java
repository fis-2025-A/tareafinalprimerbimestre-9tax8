package Ejercicio8;

public interface IAverage {
	double getMean(double[]numbers);
	
	private double calculateMean(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    default double calculateMeanDefault(double[] numbers) {
        return calculateMean(numbers);
    }
}
