package mathfunc;

import java.util.ArrayList;

public class StandardDeviation {
    public static void getStandardDeviation(ArrayList<Double> doubleArrayList) {
        double average = doubleArrayList.stream()
                .mapToInt(Double::intValue)
                .average()
                .orElse(0.0);

        double n = doubleArrayList.size();
        double sumOfSquaredDifferences = 0;

        for (Double i : doubleArrayList) {
            double difference = i - average;
            sumOfSquaredDifferences += difference * difference;
        }

        double variance = sumOfSquaredDifferences / n;
        System.out.print("Standard Deviation: ");
        System.out.println(Math.round(Math.sqrt(variance)));
    }
}