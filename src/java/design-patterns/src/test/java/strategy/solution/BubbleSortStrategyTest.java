package strategy.solution;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import strategy.solution.BubbleSortStrategy;
import strategy.solution.SortingStrategy;

public class BubbleSortStrategyTest {

  @Test
  public void testBubbleSort() {
    SortingStrategy bubbleSort = new BubbleSortStrategy();
    int[] data = {5, 3, 8, 4, 2};
    int[] expected = {2, 3, 4, 5, 8};

    assertArrayEquals(expected, bubbleSort.sort(data));
  }
}
