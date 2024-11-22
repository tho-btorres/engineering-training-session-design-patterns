package strategy.solution;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import strategy.solution.SwitchSorter;

public class SwitchSorterTest {

  @Test
  public void testBubbleSortUsingSwitchSorter() {
    SwitchSorter sorter = new SwitchSorter();
    int[] data = {4, 2, 9, 7, 3};
    int[] sortedData = sorter.sort("bubbleSort", data);
    assertArrayEquals(new int[]{2, 3, 4, 7, 9}, sortedData);
  }

  @Test
  public void testQuickSortUsingSwitchSorter() {
    SwitchSorter sorter = new SwitchSorter();
    int[] data = {3, 6, 8, 10, 1, 2, 1};
    int[] sortedData = sorter.sort("quickSort", data);
    assertArrayEquals(new int[]{1, 1, 2, 3, 6, 8, 10}, sortedData);
  }

  @Test
  public void testMergeSortUsingSwitchSorter() {
    SwitchSorter sorter = new SwitchSorter();
    int[] data = {38, 27, 43, 3, 9, 82, 10};
    int[] sortedData = sorter.sort("mergeSort", data);
    assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, sortedData);
  }

  @Test
  public void testUnknownAlgorithmThrowsException() {
    SwitchSorter sorter = new SwitchSorter();
    int[] data = {1, 2, 3};
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      sorter.sort("unknownSort", data);
    });
    assertEquals("Unknown sorting algorithm: unknownSort", exception.getMessage());
  }
}
