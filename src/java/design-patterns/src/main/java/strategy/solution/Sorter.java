package strategy.solution;

import java.util.HashMap;
import java.util.Map;

public class Sorter {

  private final Map<String, SortingStrategy> strategies = new HashMap<>();

  public Sorter() {
    strategies.put("bubbleSort", new BubbleSortStrategy());
    strategies.put("quickSort", new QuickSortStrategy());
    strategies.put("mergeSort", new MergeSortStrategy());
  }

  public int[] sort(String algorithm, int[] data) {
    SortingStrategy strategy = strategies.get(algorithm);

    if (strategy == null) {
      throw new IllegalArgumentException("Unknown sorting algorithm: " + algorithm);
    }

    return strategy.sort(data);
  }
}
