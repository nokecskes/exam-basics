package oddavg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Connor on 2017.04.18..
 */
public class OddAvg {

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases

    ArrayList<Integer> numberList = new ArrayList<>();
    numberList = fillList(numberList);
    double oddAverage = oddAverage(numberList);
    System.out.println("The average of the odd numbers is: " + oddAverage);
  }

  public static ArrayList<Integer> fillList(ArrayList<Integer> numberList) {
    System.out.println("How many numbers do you want to store?");
    Scanner scanner = new Scanner(System.in);
    int listLength = scanner.nextInt();
    for (int i = 0; i < listLength; i++) {
      System.out.println("Give me number " + (i + 1) + ":");
      numberList.add(scanner.nextInt());
    }
    return numberList;
  }

  public static double oddAverage(ArrayList<Integer> numberList) {
    int sum = 0;
    int counter = 0;
    double average = 0;
    for (int number : numberList) {
      if (number % 2 == 1) {
        sum += number;
        counter++;
      }
    }
    if (sum == 0) {
      return 0;
    } else {
      average = (double) sum / (double) counter;
      return average;
    }
  }


}
