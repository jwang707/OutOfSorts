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
  }
