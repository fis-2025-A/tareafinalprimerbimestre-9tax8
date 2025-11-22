package Ejercicio9;

@FunctionalInterface
public interface IAverage {
    // Método abstracto único (Single Abstract Method - SAM)
    double getAverage(double[] numbers);
    
    // Método privado para calcular la media (mean)
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
    
    // Método default que llama al método privado (opcional)
    default double calculateMeanDefault(double[] numbers) {
        return calculateMean(numbers);
    }
}
