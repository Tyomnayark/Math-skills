import mathfunc.Average;
import mathfunc.Median;
import mathfunc.StandardDeviation;
import mathfunc.Variance;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;


public class MathSkillsDemo {
    public static void main(String[] args) {
        String fileName = args[0];
       try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            if (!fileName.endsWith(".txt")){
                throw new FileNotFoundException();
           }

            ArrayList<Double> doubleArrayList = new ArrayList<>();
            String buffer = null;

           while(bufferedReader.ready()){
               buffer = bufferedReader.readLine();
               if (buffer.length()!=0 ) {

                   doubleArrayList.add(Double.parseDouble(buffer));
               }
           }
           if (doubleArrayList.size()==0){
               System.out.println("FILE IS EMPTY\nPLEASE FILL THE FILE");
               throw  new IOException();
           }
            Average.getAverage(doubleArrayList);
           Median.getMedian(doubleArrayList);
           Variance.getVariance(doubleArrayList);
           StandardDeviation.getStandardDeviation(doubleArrayList);

       }catch (NumberFormatException exc){
           System.out.println("THE FILE CONTAINS ILLEGAL SYMBOLS");
       }
       catch (ArrayIndexOutOfBoundsException exc){
           System.out.println("PLEASE ENTER THE FILE NAME LIKE \"data.txt\"");
       }catch (FileNotFoundException e) {
           if (!args[0].endsWith(".txt")){
               System.out.println("WRONG FORMAT - "+ fileName.substring(fileName.indexOf("."),fileName.length()));
           }
           System.out.println("FILE \"" + args[0] + "\" NOT FOUND");

       } catch (IOException e) {
           System.out.println();
       }
    }
}