import java.util.Arrays;

public class FindMax{
  public static void main(String[] args){
    int[] arr1 = new int[10];

    //fill up an array of 10 random values.
    for (int i = 0; i < arr1.length; i++){
      arr1[i] = (int)(Math.random() * 100);
    }

    System.out.println(Arrays.toString(arr1));

    //if there are multiple copies of the largest value, the first occurance is reported.
    System.out.println(indexOfMax(arr1));
    System.out.println(indexOfMaxEnhanced(arr1));
  }

  public static int indexOfMax(int[] arr){
    int currentMaxIndex = -1;
    int currentMax = 0;

    for (int i = 0; i < arr.length; i++){
      if (arr[i] > currentMax){
        currentMaxIndex = i;
        currentMax = arr[i];
      }
    }
    return currentMaxIndex;
  }

  /*
   * it is possible to rewrite the method using an enhanced for loop.
   * a new int variable before the loop would have to be created.
   * its purpose is to track the index value of the number inspected.
   * in the loop that variable is incremented regardless of the conditional's
   * truth value.
   */
  public static int indexOfMaxEnhanced(int[] arr){
    int currentMaxIndex = -1;
    int currentMax = 0;
    int i = 0;
    for (int a : arr){
      if (a > currentMax){
        currentMaxIndex = i;
        currentMax = a;
      }
      i++;
    }
    return currentMaxIndex;
  }
}
