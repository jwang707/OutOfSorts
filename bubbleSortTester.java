import java.util.Arrays;

public class bubbleSortTester{
  public static void main(String[] args){
    int[] casper = new int[]{5, 4, 3, 1, 2};
/*
    System.out.println(casper.length);
    System.out.println(Arrays.toString(casper));
    Sorts.bubbleSort(casper);
    System.out.println(Arrays.toString(casper)); // basic checks */

    int[] efficiency = new int[]{2, 1, 3, 4, 5};
    System.out.println(Arrays.toString(efficiency));
    Sorts.bubbleSort(efficiency);
    System.out.println(Arrays.toString(efficiency));

  }
}
