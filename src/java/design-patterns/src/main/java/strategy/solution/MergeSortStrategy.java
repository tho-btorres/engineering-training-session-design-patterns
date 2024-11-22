package strategy.solution;

public class MergeSortStrategy implements SortingStrategy {
  @Override
  public int[] sort(int[] data) {
    mergeSort(data, 0, data.length - 1);
    return data;
  }

  private void mergeSort(int[] data, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;

      mergeSort(data, left, mid);
      mergeSort(data, mid + 1, right);

      merge(data, left, mid, right);
    }
  }

  private void merge(int[] data, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    System.arraycopy(data, left, L, 0, n1);
    System.arraycopy(data, mid + 1, R, 0, n2);

    int i = 0, j = 0;
    int k = left;

    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        data[k++] = L[i++];
      } else {
        data[k++] = R[j++];
      }
    }

    while (i < n1) {
      data[k++] = L[i++];
    }

    while (j < n2) {
      data[k++] = R[j++];
    }
  }
}