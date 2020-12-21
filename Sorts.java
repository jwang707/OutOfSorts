import java.util.Arrays;

public class Sorts{
  public static void bubbleSort(int[] data){
    boolean sorted = false;
    int unsorted = (data.length-1);
    int countSorts = 0;

    for (int j = 0; j < data.length; j++) {
      for (int i = 0; i < unsorted; i++) { // runs through the code a pair at a time
      //  System.out.println("a full pass");
      //  System.out.println();
        if (data[i] > data[i+1]) { // if it's out of order
          int yeet = data[i+1];
          data[i+1] = data[i];
          data[i] = yeet;
          countSorts++;
      //  System.out.println(Arrays.toString(data));
      //  System.out.println(unsorted + "Something was sorted");
          }
      }
      if (countSorts == 0) {
        j = data.length;
      }
      }
    }

    /**selection sort of an int array.
*@postcondition The array will be modified such that the elements will be in increasing order.
*@param data - the elements to be sorted.
*/
 public static void selectionSort(int[] data){
   for (int j = 0; j < data.length-1; j++) {
     int min = data[j];
     for (int i = j; i < data.length; i++) {
       if (min > data[i]) {
         int yeet = min;
         min = data[i];
         data[i] = yeet;
       }
     }
     data[j] = min;
   }
 }

 /**insertion sort of an int array.
*@postcondition The array will be modified such that the elements will be in increasing order.
*@param data - the elements to be sorted.
*/
 public static void insertionSort(int[] data){
   for (int i = 1; i < data.length; i++) {
     int grab = data[i];
     for (int j = i-1; j >= 0; j--) {
       if (grab < data[j]) {
         data[j+1] = data[j];
         data[j] = grab;
       }
     }
   }
 }
}
