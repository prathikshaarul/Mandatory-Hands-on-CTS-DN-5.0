public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return calculateFutureValue(currentValue, growthRate, years - 1)
                * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.08; // 8% growth rate
        int years = 5;

        double futureValue = calculateFutureValue(currentValue, growthRate, years);

        System.out.println("Current Value: Rs. " + currentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Number of Years: " + years);
        System.out.printf("Predicted Future Value: Rs. %.2f%n", futureValue);
    }
}