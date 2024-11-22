package strategy.solution;

public class SwitchSorter {

  public int[] sort(String algorithm, int[] data) {
    SortingStrategy strategy;

    switch (algorithm) {
      case "bubbleSort":
        strategy = new BubbleSortStrategy();
        break;
      case "quickSort":
        strategy = new QuickSortStrategy();
        break;
      case "mergeSort":
        strategy = new MergeSortStrategy();
        break;
      default:
        throw new IllegalArgumentException("Unknown sorting algorithm: " + algorithm);
    }

    return strategy.sort(data);
  }
}
