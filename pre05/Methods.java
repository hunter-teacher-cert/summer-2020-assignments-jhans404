public class Methods{
  public static void main (String[] args){
    //test cases for first method
    System.out.println(isDivisible(4, 2));
    System.out.println(isDivisible(5, 2));

    //test cases for second method
    System.out.println(isTriangle(5, 5, 5));
    System.out.println(isTriangle(3, 4, 5));
    System.out.println(isTriangle(1, 1, 5));

    //test cases for third method
    System.out.println(ack(1, 1));
    System.out.println(ack(1, 2));
  }

  public static boolean isDivisible(int n, int m){
    return (n % m == 0);
  }

  public static boolean isTriangle(int a, int b, int c){
    return (!((a > b + c) || (b > a + c) || (c > a + b)));
  }

  public static int ack(int m, int n){
    if (m == 0){
      return (n + 1);
    }

    else if (m > 0 && n == 0){
      return ack(m - 1, 1);
    }

    else{
      return ack(m - 1, ack(m, n - 1));
    }
  }
}
