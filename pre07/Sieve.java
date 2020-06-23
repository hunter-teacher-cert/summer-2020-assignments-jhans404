import java.util.Arrays;

public class Sieve{
  public static void main(String[] args){
    boolean[] testArr = sieve(100);

    for (int i = 2; i < testArr.length; i++){
      if (testArr[i] == true){
        System.out.println(i + " is prime.");
      }
    }

  }

  public static boolean[] sieve(int n){
    boolean[] arr = new boolean[n];

    for (int i = 0; i < n; i++){
      arr[i] = true;
    }

    for (int i = 2; i < Math.sqrt(n); i++){
      if (arr[i] == true){
        for (int j = (i * i); j < n; j = j + i){
          arr[j] = false;
        }
      }
    }
    return arr;
  }
}
