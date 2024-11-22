package strategy.extra_one;

import strategy.solution.SortingStrategy;

public class SorterExtra {

  public int[] sort(String algorithm, int[] data) {
    SortingStrategy strategy = SortStrategyFactory.getStrategy(algorithm);
    return strategy.sort(data);
  }
}
