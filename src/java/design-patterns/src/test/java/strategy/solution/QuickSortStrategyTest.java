package strategy.solution;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import strategy.solution.QuickSortStrategy;

public class QuickSortStrategyTest {

  @Test
  public void testQuickSort() {
    QuickSortStrategy quickSort = new QuickSortStrategy();
    int[] data = {10, 7, 8, 9, 1, 5};
    int[] sortedData = quickSort.sort(data);
    assertArrayEquals(new int[]{1, 5, 7, 8, 9, 10}, sortedData);
  }
}
