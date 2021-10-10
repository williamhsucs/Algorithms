public class QuickSort {
  private static void swap(int[] ary, int i, int j) {
    int temp = ary[i];
    ary[i] = ary[j];
    ary[j] = temp;
  }

  private static int partition(int[] ary, int low, int high) {
    int pivot = ary[high];
    /**
     * Variable i is responsible for storing values smaller than the pivot value
     */
    int i = low;

    /**
     * Time Complexity: O(n)
     */
     for (int j = low; j < high; j++) {
       /**
        * If a smaller value is found, swap the larger value indicated by the variable i.
        */
       if (ary[j] < pivot) {
         swap(ary, i++, j);
       }
     }
     /**
      * After all, swap the pivot value to the end of the sorted small value sequence.
      */
      swap(ary, i, high);
      return i;
  }

  private static void sorting(int[] ary, int low, int high) {
    if (low < high) {
      /**
       * Partition the values smaller and greater than pivot value (Use highest value)
       * After partition, we will get 2 non-sorted sequence that 1 is smaller and 1 is greater than pivot value.
       * For example,
       */
      int node = partition(ary, low, high);
      /**
       * Keep sorting small sequence
       */
      sorting(ary, low, node - 1);
      /**
       * Keep sorting large sequence
       */
      sorting(ary, node + 1, high);
    }
  }

  public static void sort(int[] ary) {
    sorting(ary, 0, ary.length - 1);
  }

  public static void print(int[] ary) {
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
