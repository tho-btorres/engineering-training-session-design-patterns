package strategy.solution;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import strategy.solution.MergeSortStrategy;

public class MergeSortStrategyTest {

  @Test
  public void testMergeSort() {
    MergeSortStrategy mergeSort = new MergeSortStrategy();
    int[] data = {12, 11, 13, 5, 6, 7};
    int[] sortedData = mergeSort.sort(data);
    assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, sortedData);
  }
}
