package mathfunc;

import java.util.ArrayList;

public class Variance {
    public static void getVariance(ArrayList<Double> doubleArrayList) {
        double sum = 0;
        double n = doubleArrayList.size();

        for (Double i : doubleArrayList) {
            sum += i;
        }

        double mean = (double) sum / n;
        double sumOfSquaredDifferences = 0;

        for (Double i : doubleArrayList) {
            double difference = i - mean;
            sumOfSquaredDifferences += difference * difference;
        }

        double variance = sumOfSquaredDifferences / n;
        System.out.println("Variance: " + Math.round( variance));
    }
}