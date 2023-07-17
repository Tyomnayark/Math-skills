package mathfunc;

import java.util.ArrayList;

public class Median {
    public static void getMedian(ArrayList<Double> doubleArrayList) {
        doubleArrayList.sort((n1, n2) -> (int) (n1 - n2));
        System.out.print("Median: ");
        if (doubleArrayList.size() % 2 == 0) {
            double median = (doubleArrayList.get(doubleArrayList.size() / 2 - 1) + doubleArrayList.get(doubleArrayList.size() / 2)) / 2;
            System.out.println(Math.round(median));
        } else {
            System.out.println((int) Math.round(doubleArrayList.get(doubleArrayList.size() / 2)));
        }
    }
}
