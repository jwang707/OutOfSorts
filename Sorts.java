import java.util.Arrays;

public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean sorted = false;
    int unsorted = (data.length-1);

    while (!sorted) {

      for (int i = 0; i < unsorted; i ++) { // runs through the code a pair at a time
      //  System.out.println("a full pass");
      //  System.out.println();
        if (data[i] > data[i+1]) { // if it's out of order
          sorted = false;
          int yeet = data[i];
          data[i] = data[i+1];
          data[i+1] = yeet;
        //  System.out.println(Arrays.toString(data));
      //    System.out.println(unsorted + "Something was sorted");
          }
        else {
          i++;
    //      System.out.println(Arrays.toString(data));
      //    System.out.println(unsorted + "progress as normal");
        }
      }

      for (int i = unsorted; i > 0; i--) { //checks if end values have been sorted if so makes int unsorted smaller by 2
        if (data[i] > data[i-1])  { //the good situation
          unsorted --;
          i--;
          }
        }

      if (unsorted <= 0) { // go through one more loop before making sorted true
        boolean allGood = true;
        for (int i = 0; i < data.length-1; i++) {
    //      System.out.println("scanning for completion");
          if (data[i] > data[i+1]){
            allGood = false;

      //      System.out.println("not done yet");
          }
        }
        sorted = allGood;
      }
    }
  }
}
