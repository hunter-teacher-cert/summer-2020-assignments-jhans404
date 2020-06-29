public class Recursion {
  public static void main(String[] args){
    System.out.println(factorial(2));
    System.out.println(factorial(6));

    System.out.println(fibonacci(2));
    System.out.println(fibonacci(6));

    int[] testArr = {1, 2, 3, 4};
    System.out.println(recursiveSum(testArr, testArr.length));
  }

  public static int factorial(int n){
    if (n == 1){
      return 1;
    }
    else {
      return n * factorial(n - 1);
    }
  }

  public static int fibonacci(int n){
    if (n <= 2){
      return 1;
    }
    else{
      return fibonacci(n - 2) + fibonacci(n - 1);
    }
  }

  public static int recursiveSum(int[] arr, int n){
    if (n == 0){
      return 0;
    }
    else{
      return (recursiveSum(arr, n - 1) + arr[n - 1]);
    }
  }
}
