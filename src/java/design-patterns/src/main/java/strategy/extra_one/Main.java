package strategy.extra_one;


import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

  public static void main(String[] args) {
    Logger logger = Logger.getLogger(Main.class.getName());
    Scanner scanner = new Scanner(System.in);

    // Get sorting algorithm from the user
    logger.info("Enter the sorting algorithm (bubbleSort, quickSort, mergeSort): ");
    String algorithm = scanner.nextLine();

    // Get array input from the user
    logger.info("Enter the array to sort (comma-separated): ");
    String input = scanner.nextLine();
    int[] data = Arrays.stream(input.split(","))
        .mapToInt(Integer::parseInt)
        .toArray();

    // Sort using the specified algorithm
    SorterExtra sorter = new SorterExtra();
    try {
      int[] sortedData = sorter.sort(algorithm, data);

      // Output the sorted array
      logger.info("Sorted Array: " + Arrays.toString(sortedData));
    } catch (IllegalArgumentException e) {
      logger.info("Error: " + e.getMessage());
    }

    scanner.close();
  }
}
