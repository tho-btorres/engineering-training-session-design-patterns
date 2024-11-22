package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SorterTest {

  @Test
  public void testBubbleSort() {
    Sorter sorter = new Sorter();

    int[] data = {5, 2, 9, 1, 5, 6};
    int[] expected = {1, 2, 5, 5, 6, 9};

    int[] result = sorter.sort("bubbleSort", data);

    // Assert the result is correctly sorted
    assertArrayEquals(expected, result, "Bubble Sort did not work as expected");
  }

  @Test
  public void testQuickSort() {
    Sorter sorter = new Sorter();

    int[] data = {5, 2, 9, 1, 5, 6};
    int[] expected = {1, 2, 5, 5, 6, 9};

    int[] result = sorter.sort("quickSort", data);

    // Assert the result is correctly sorted
    assertArrayEquals(expected, result, "QuickSort did not work as expected");
  }

  @Test
  public void testMergeSort() {
    Sorter sorter = new Sorter();

    int[] data = {5, 2, 9, 1, 5, 6};
    int[] expected = {1, 2, 5, 5, 6, 9};

    int[] result = sorter.sort("mergeSort", data);

    // Assert the result is correctly sorted
    assertArrayEquals(expected, result, "MergeSort did not work as expected");
  }

  @Test
  public void testEmptyArray() {
    Sorter sorter = new Sorter();

    int[] data = {};
    int[] expected = {};

    int[] result = sorter.sort("bubbleSort", data);

    // Assert that an empty array remains empty
    assertArrayEquals(expected, result, "Sorting an empty array should return an empty array");
  }

  @Test
  public void testSingleElementArray() {
    Sorter sorter = new Sorter();

    int[] data = {42};
    int[] expected = {42};

    int[] result = sorter.sort("bubbleSort", data);

    // Assert that a single element array remains unchanged
    assertArrayEquals(expected, result, "Sorting a single-element array should return the same array");
  }

  @Test
  public void testAlreadySortedArray() {
    Sorter sorter = new Sorter();

    int[] data = {1, 2, 3, 4, 5, 6};
    int[] expected = {1, 2, 3, 4, 5, 6};

    int[] result = sorter.sort("quickSort", data);

    // Assert that the array remains unchanged if already sorted
    assertArrayEquals(expected, result, "Sorting an already sorted array should return the same array");
  }

  @Test
  public void testInvalidSortAlgorithm() {
    Sorter sorter = new Sorter();

    int[] data = {5, 2, 9, 1, 5, 6};

    // Assert that an exception is thrown for an invalid algorithm
    assertThrows(IllegalArgumentException.class, () -> {
      sorter.sort("invalidSort", data);
    }, "Expected IllegalArgumentException for invalid sorting algorithm");
  }
}
