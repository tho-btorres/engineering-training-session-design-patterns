package strategy.extra_two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import strategy.extra_two.SorterExtraTwo;

class SorterExtraTwoTwoTest {

  @Test
  void testBubbleSort() {
    SorterExtraTwo sorter = new SorterExtraTwo();
    int[] data = {5, 2, 9, 1, 5, 6};
    int[] expected = {1, 2, 5, 5, 6, 9};
    assertArrayEquals(expected, sorter.sort("bubbleSort", data));
  }

  @Test
  void testQuickSort() {
    SorterExtraTwo sorter = new SorterExtraTwo();
    int[] data = {3, 7, 8, 5, 2, 1, 9, 5, 4};
    int[] expected = {1, 2, 3, 4, 5, 5, 7, 8, 9};
    assertArrayEquals(expected, sorter.sort("quickSort", data));
  }

  @Test
  void testMergeSort() {
    SorterExtraTwo sorter = new SorterExtraTwo();
    int[] data = {12, 11, 13, 5, 6, 7};
    int[] expected = {5, 6, 7, 11, 12, 13};
    assertArrayEquals(expected, sorter.sort("mergeSort", data));
  }

}
