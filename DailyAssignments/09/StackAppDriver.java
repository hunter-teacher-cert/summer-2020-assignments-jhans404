public class StackAppDriver{
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "racecar";

    System.out.println("Test 1:");
    StackApp stack1 = new StackApp(s1);
    System.out.println(s1);
    System.out.println(stack1.reverse());
    System.out.println(stack1.isPalendrome());

    System.out.println("\nTest 2:");
    System.out.println(s2);
    StackApp stack2 = new StackApp(s2);
    System.out.println(stack2.reverse());
    System.out.println(stack2.isPalendrome());

    String expression1 = "(a + b) * c";
    String expression2 = "(a + b * c";
    StackApp stack3 = new StackApp(expression1);
    StackApp stack4 = new StackApp(expression2);
    System.out.println("\nTest 3:");
    System.out.println(stack3.parenCheck());
    System.out.println(stack4.parenCheck());

  }//end main
}//end class
