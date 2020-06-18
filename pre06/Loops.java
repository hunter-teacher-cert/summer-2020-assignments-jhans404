public class Loops{
  public static void main(String[] args){
    System.out.println(power(2, 3));
    System.out.println(power(3, 2));

    System.out.println(factorial(1));
    System.out.println(factorial(4));
  }

  public static int power(int a, int b){
    int product = 1;
    for (int i = 0; i < b; i++){
      product *= a;
    }
    return product;
  }

  public static int factorial(int n){
    if (n == 0){
      return 1;
    }
    else{
      for (int i = n - 1; i > 1; i--){
        n *= i;
      }
      return n;
    }
  }
}
