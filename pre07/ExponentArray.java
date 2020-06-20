import java.util.Arrays;

public class ExponentArray{
  public static void main(String[] args){
    double[] arr1 = {1.0, 2.0, 3.0, 4.0, 5.0};
    double[] arr2 = {10, 20, 30};

    System.out.println(Arrays.toString(powArray(arr1, 2)));
    System.out.println(Arrays.toString(powArray(arr2, 3)));
  }

  public static double[] powArray(double a[], int power){
    double[] resultArray = new double[a.length];
    int i = 0;

    for (double num : a){
      resultArray[i] = Math.pow(num, power);
      i++;
    }
    return resultArray;
  }
}
