public class Driver{
  public static void main(String[] args) {
    SuperArray arr1 = new SuperArray();
    SuperArray arr2 = new SuperArray(2);

    arr2.add(4);
    System.out.println(arr1.isEmpty());

    arr2.add(3);
    arr2.add(5);
    System.out.println(arr2.toString());


  }//end main
}//end class
