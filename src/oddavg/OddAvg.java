package oddavg;

import java.util.ArrayList;

/**
 * Created by Connor on 2017.04.18..
 */
public class OddAvg {

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases

    ArrayList<Integer> numberList = new ArrayList<>();
    for (int i = 0; i < 10 ; i++) {
      numberList.add(i + 1);
    }
    int oddAverage = oddAverage(numberList);
    System.out.println(oddAverage);
  }

  public static int oddAverage(ArrayList<Integer> numberList) {
    int sum = 0;
    int average = 0;
    int counter = 0;
    for (int number : numberList) {
      if(number % 2 == 1) {
        sum += number;
        counter++;
      }
    }
    average = sum / counter;
    return average;
  }



}
