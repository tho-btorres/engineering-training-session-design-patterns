package strategy.extra_two;

import strategy.solution.SortingStrategy;

public class SorterExtraTwo {

  public int[] sort(String algorithm, int[] data) {
    SortingStrategy strategy = SortStrategyFactory.getStrategy(algorithm);
    return strategy.sort(data);
  }
}
