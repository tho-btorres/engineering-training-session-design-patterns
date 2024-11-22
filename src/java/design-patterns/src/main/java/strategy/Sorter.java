package strategy;

import java.util.Arrays;

public class Sorter {

  public int[] sort(String algorithm, int[] data) {
    switch (algorithm) {
      case "bubbleSort":
        // Bubble Sort algorithm implemented inline
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
          for (int j = 0; j < n - i - 1; j++) {
            if (data[j] > data[j + 1]) {
              // Swap temp and data[j]
              int temp = data[j];
              data[j] = data[j + 1];
              data[j + 1] = temp;
            }
          }
        }
        break;

      case "quickSort":
        // QuickSort algorithm implemented inline
        quickSort(data, 0, data.length - 1);
        break;

      case "mergeSort":
        // MergeSort algorithm implemented inline
        mergeSort(data, 0, data.length - 1);
        break;

      default:
        throw new IllegalArgumentException("Unknown sorting algorithm: " + algorithm);
    }
    return data;
  }

  // Inline QuickSort
  private void quickSort(int[] data, int low, int high) {
    if (low < high) {
      int pivot = data[high];
      int i = low - 1;
      for (int j = low; j < high; j++) {
        if (data[j] <= pivot) {
          i++;
          // Swap
          int temp = data[i];
          data[i] = data[j];
          data[j] = temp;
        }
      }
      // Swap the pivot element with the element at i + 1
      int temp = data[i + 1];
      data[i + 1] = data[high];
      data[high] = temp;

      // Recursively apply quicksort to subarrays
      quickSort(data, low, i);
      quickSort(data, i + 2, high);
    }
  }

  // Inline MergeSort
  private void mergeSort(int[] data, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;

      // Sort left and right halves
      mergeSort(data, left, mid);
      mergeSort(data, mid + 1, right);

      // Merge the sorted halves
      merge(data, left, mid, right);
    }
  }

  // Inline Merge method
  private void merge(int[] data, int left, int mid, int right) {
    int leftSize = mid - left + 1;
    int rightSize = right - mid;

    // Create temporary arrays for left and right halves
    int[] leftArray = new int[leftSize];
    int[] rightArray = new int[rightSize];

    // Copy data into temporary arrays
    for (int i = 0; i < leftSize; i++) {
      leftArray[i] = data[left + i];
    }
    for (int i = 0; i < rightSize; i++) {
      rightArray[i] = data[mid + 1 + i];
    }

    // Merge the arrays
    int i = 0, j = 0, k = left;
    while (i < leftSize && j < rightSize) {
      if (leftArray[i] <= rightArray[j]) {
        data[k] = leftArray[i];
        i++;
      } else {
        data[k] = rightArray[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements from leftArray, if any
    while (i < leftSize) {
      data[k] = leftArray[i];
      i++;
      k++;
    }

    // Copy remaining elements from rightArray, if any
    while (j < rightSize) {
      data[k] = rightArray[j];
      j++;
      k++;
    }
  }

  // Main function for testing
  public static void main(String[] args) {
    Sorter sorter = new Sorter();

    int[] data = {5, 2, 9, 1, 5, 6};

    // Bubble Sort
    int[] bubbleSorted = sorter.sort("bubbleSort", data.clone());
    System.out.println("Bubble Sort: " + Arrays.toString(bubbleSorted));

    // QuickSort
    int[] quickSorted = sorter.sort("quickSort", data.clone());
    System.out.println("QuickSort: " + Arrays.toString(quickSorted));

    // Merge Sort
    int[] mergeSorted = sorter.sort("mergeSort", data.clone());
    System.out.println("Merge Sort: " + Arrays.toString(mergeSorted));
  }
}
