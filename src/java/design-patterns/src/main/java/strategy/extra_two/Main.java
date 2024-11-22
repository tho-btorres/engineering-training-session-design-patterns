package strategy.extra_two;


import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

  public static void main(String[] args) {
    Logger myLogger = Logger.getLogger(Main.class.getName());
    Scanner scanner = new Scanner(System.in);

    // Get sorting algorithm from the user
    myLogger.info("Enter the sorting algorithm (bubbleSort, quickSort, mergeSort): ");
    String algorithm = scanner.nextLine();

    // Get array input from the user
    myLogger.info("Enter the array to sort (comma-separated): ");
    String input = scanner.nextLine();
    int[] data = Arrays.stream(input.split(","))
        .mapToInt(Integer::parseInt)
        .toArray();

    // Sort using the specified algorithm
    SorterExtraTwo sorter = new SorterExtraTwo();
    try {
      int[] sortedData = sorter.sort(algorithm, data);

      // Output the sorted array
      myLogger.info("Sorted Array: " + Arrays.toString(sortedData));
    } catch (IllegalArgumentException e) {
      myLogger.info("Error: " + e.getMessage());
    }

    scanner.close();
  }
}
