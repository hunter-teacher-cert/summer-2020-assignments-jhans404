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
  }//end main
}//end class
