public class PowerOfE {
  public static void main(String[] args) {
    System.out.println(myExp(1, 10));
    System.out.println(myExpOptimized(1, 10));
  }

  public static double myExp(int x, int n) {
    double sum = 0;
    for (int i = 0; i < n; i++){
      double num = Math.pow(x, i);
      int den = factorial(i);
      sum += (num / den);
    }
    return sum;
  }

  public static double myExpOptimized(int x, int n) {
    double result = 1;
    double num = 1;
    int den = 1;
    if (n == 0){
      return result;
    }
    for (int i = 1; i < n; i++){
      num = num * x;
      den = den * i;
      result += (num / den);
    }
    return result;
  }

  public static int factorial(int n) {
    int product = 1;
    for (int i = 2; i <= n; i++) {
      product *= i;
    }
    return product;
  }
}
