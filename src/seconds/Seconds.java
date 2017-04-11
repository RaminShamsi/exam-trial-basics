package seconds;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HP on 4/11/2017.
 */
public class Seconds {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many number do you have?");
    int numberOfInput = scanner.nextInt();
    System.out.println("Enter a list of numbers, I will bring back the new list with each second element.");
    int[] input = new int[numberOfInput];
    for (int i = 0; i < input.length; i++) {
      System.out.println("Your number : ");
      input[i] = scanner.nextInt();
    }
    second(numberOfInput, input);
  }

  public static void second(int numberOfInput, int[] input) {
    int[] result = new int[numberOfInput / 2];
    for (int i = 0; i < numberOfInput / 2; i++) {
      result[i] = input[2 * i + 1];
    }
    System.out.println("Original List: " + Arrays.toString(input));
    System.out.println("Modified List: " + Arrays.toString(result));
  }
}
