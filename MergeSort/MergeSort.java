/**
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n)
 */
public class MergeSort {

  private void merge(int[] ary, int left, int middle, int right) {
    int leftLen = middle - left + 1;
    int rightLen = right - middle;

    /**
     * Space Complexity: O(n)
     */
    int[] leftAry = new int[leftLen];
    int[] rightAry = new int[rightLen];

    /**
     * Copy org array to temp array
     */
    for (int i = 0; i < leftLen; i++) {
      leftAry[i] = ary[left + i];
    }
    for (int i = 0; i < rightLen; i++) {
      rightAry[i] = ary[middle + 1 + i];
    }

    /**
     * Compare left sub-array and right sub-array
     */
    int i = 0, j = 0, k = left;
    while (i < leftLen && j < rightLen) {
      if (leftAry[i] < rightAry[j]) {
        ary[k] = leftAry[i];
        i++;
      } else {
        ary[k] = rightAry[j];
        j++;
      }
      k++;
    }

    /**
     * Sometimes, left sub-array does not equal right sub-array.
     * So, we need to complete remain number into org array.
     */
    while (i < leftLen) {
      ary[k] = leftAry[i];
      i++;
      k++;
    }
    while (j < rightLen) {
      ary[k] = rightAry[j];
      j++;
      k++;
    }
  }

  private void sorting(int[] ary, int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;
      sorting(ary, left, middle);
      sorting(ary, middle + 1, right);
      merge(ary, left, middle, right);
    }
  }

  public void sort(int[] ary) {
    sorting(ary, 0, ary.length - 1);
  }

  public void print(int[] ary) {
    System.out.print("[");
    for (int i = 0; i < ary.length; i++) {
      System.out.print(ary[i]);
      if (i != ary.length - 1) {
        System.out.print(", ");
      } else {
        System.out.println("]");
      }
    }
  }
}