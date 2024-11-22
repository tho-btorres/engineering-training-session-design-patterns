package strategy.extra_one;

import strategy.solution.BubbleSortStrategy;
import strategy.solution.MergeSortStrategy;
import strategy.solution.QuickSortStrategy;
import strategy.solution.SortingStrategy;

public class SortStrategyFactory {

  private SortStrategyFactory() {
  }

  public static SortingStrategy getStrategy(String algorithm) {
    switch (algorithm) {
      case "bubbleSort":
        return new BubbleSortStrategy();
      case "quickSort":
        return new QuickSortStrategy();
      case "mergeSort":
        return new MergeSortStrategy();
      default:
        throw new IllegalArgumentException("Unknown sorting algorithm: " + algorithm);
    }
  }
}

