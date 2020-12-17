import java.util.Arrays;

public class bubbleSortTester{
  public static void main(String[] args){
    int[] casper = new int[]{5, 4, 3, 1, 2};

    System.out.println("testing casper");
    System.out.println(Arrays.toString(casper));
    Sorts.bubbleSort(casper);
    System.out.println(Arrays.toString(casper)); // basic checks

    int[] efficiency = new int[]{2, 1, 3, 4, 5};
    System.out.println();

    System.out.println("testing efficiency");
    System.out.println(Arrays.toString(efficiency));
    Sorts.bubbleSort(efficiency);
    System.out.println(Arrays.toString(efficiency));

    int[] perf = new int[]{1, 2, 3, 4, 5};
    System.out.println();

    System.out.println("testing pre-sorted");
    System.out.println(Arrays.toString(perf));
    Sorts.bubbleSort(perf);
    System.out.println(Arrays.toString(perf));

/*
        int[] empty = new int[]{};
        System.out.println();

        System.out.println("testing empty");
        System.out.println(Arrays.toString(empty));
        Sorts.bubbleSort(empty);
        System.out.println(Arrays.toString(empty)); */ // empty
  }
}
