package strategy.extra_two;

import java.util.HashMap;
import java.util.Map;
import strategy.solution.BubbleSortStrategy;
import strategy.solution.MergeSortStrategy;
import strategy.solution.QuickSortStrategy;
import strategy.solution.SortingStrategy;

public class SortStrategyFactory {

  SortStrategyFactory() {
  }

  private static final Map<String, SortingStrategy> STRATEGY_MAP = new HashMap<>();

  static {
    STRATEGY_MAP.put("bubbleSort", new BubbleSortStrategy());
    STRATEGY_MAP.put("quickSort", new QuickSortStrategy());
    STRATEGY_MAP.put("mergeSort", new MergeSortStrategy());
  }

  public static SortingStrategy getStrategy(String algorithm) {
    SortingStrategy strategy = STRATEGY_MAP.get(algorithm);

    if (strategy == null) {
      throw new IllegalArgumentException("Unknown sorting algorithm: " + algorithm);
    }

    return strategy;
  }
}

