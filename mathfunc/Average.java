package mathfunc;

import java.util.ArrayList;

public class Average {
    public static void getAverage(ArrayList<Double> integerArrayList){
        double average =  integerArrayList.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.print("Average: ");
        System.out.println(Math.round(average));
    }
}
