import java.util.Arrays;

public class Histogram{
  public static void main(String[] args){

    //create sample array for testing purposes.
    int[] testArr = new int[10];
    for (int i = 0; i < testArr.length; i++){
      testArr[i] = (int)(Math.random() * 10);
    }

    //print sample array and results from invoking the method.
    System.out.println(Arrays.toString(testArr));
    System.out.println(Arrays.toString(makeHistogram(testArr, 10)));
  }

  public static int[] makeHistogram(int[] arr, int counters){
    int[] tally = new int[counters];
    for (int val : arr){
      tally[val]++;
    }
    return tally;
  }
}
