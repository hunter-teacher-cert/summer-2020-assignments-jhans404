public class Recursion {
  public static void main(String[] args){
    System.out.println(factorial(2));
    System.out.println(factorial(6));

    System.out.println(fibonacci(2));
    System.out.println(fibonacci(6));

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
}
