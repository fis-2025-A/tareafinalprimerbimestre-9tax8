package Ejercicio9;

import java.util.Arrays;

public class LambdaAverageCalculator {
    public static void main(String[] args) {
        
   
        double[] numbers = {10.5, 20.3, 15.7, 8.2, 25.1};
        double[] sortedNumbers = {5.0, 8.0, 12.0, 15.0, 20.0, 25.0, 30.0}; 
        
        System.out.println("Array original: " + Arrays.toString(numbers));
        System.out.println("Array ordenado: " + Arrays.toString(sortedNumbers));
        System.out.println();

  
        IAverage meanCalculator = (double[] nums) -> {
            if (nums == null || nums.length == 0) {
                return 0.0;
            }
            
            double sum = 0.0;
            for (double num : nums) {
                sum += num;
            }
            return sum / nums.length;
        };
        
    
        IAverage medianCalculator = (double[] nums) -> {
            if (nums == null || nums.length == 0) {
                return 0.0;
            }
            
    
            int length = nums.length;
            if (length % 2 == 0) {
              
                double middle1 = nums[length / 2 - 1];
                double middle2 = nums[length / 2];
                return (middle1 + middle2) / 2.0;
            } else {
              
                return nums[length / 2];
            }
        };
        
      
        double meanResult = meanCalculator.getAverage(numbers);
        double medianResult = medianCalculator.getAverage(sortedNumbers);
        
        System.out.println("=== RESULTADOS ===");
        System.out.println("Media del array original: " + meanResult);
        System.out.println("Mediana del array ordenado: " + medianResult);
     
        System.out.println("\n=== PRUEBAS ADICIONALES ===");
        
    
        double[] evenArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        System.out.println("Array par ordenado: " + Arrays.toString(evenArray));
        System.out.println("Media: " + meanCalculator.getAverage(evenArray));
        System.out.println("Mediana: " + medianCalculator.getAverage(evenArray));
   
        double[] oddArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("\nArray impar ordenado: " + Arrays.toString(oddArray));
        System.out.println("Media: " + meanCalculator.getAverage(oddArray));
        System.out.println("Mediana: " + medianCalculator.getAverage(oddArray));

        double[] emptyArray = {};
        System.out.println("\nArray vacío: " + Arrays.toString(emptyArray));
        System.out.println("Media: " + meanCalculator.getAverage(emptyArray));
        System.out.println("Mediana: " + medianCalculator.getAverage(emptyArray));
        
      
        System.out.println("\n=== USANDO LAMBDAS COMO PARÁMETROS ===");
        displayAverage("Media calculada", numbers, meanCalculator);
        displayAverage("Mediana calculada", sortedNumbers, medianCalculator);
    }

    public static void displayAverage(String description, double[] numbers, IAverage calculator) {
        double result = calculator.getAverage(numbers);
        System.out.println(description + ": " + result);
    }
}