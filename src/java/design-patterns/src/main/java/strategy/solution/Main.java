package strategy.solution;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // Input data
    int[] data = {38, 27, 43, 3, 9, 82, 10};

    // Strategy pattern setup
    Sorter sorter = new Sorter();

    // Bubble Sort
    int[] bubbleSortedData = sorter.sort("bubbleSort",
        data.clone()); // Use clone to avoid modifying the original data
    System.out.println("Bubble Sort: " + Arrays.toString(bubbleSortedData));

    // Quick Sort
    int[] quickSortedData = sorter.sort("quickSort", data.clone());
    System.out.println("Quick Sort: " + Arrays.toString(quickSortedData));

    // Merge Sort
    int[] mergeSortedData = sorter.sort("mergeSort", data.clone());
    System.out.println("Merge Sort: " + Arrays.toString(mergeSortedData));

    // Invalid scenario
    try {
      sorter.sort("randomSort",data.clone());
    } catch (IllegalStateException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}

