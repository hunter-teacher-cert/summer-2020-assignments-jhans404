public class Driver{
  public static void main(String[] args) {
    SuperArray arr1 = new SuperArray();
    SuperArray arr2 = new SuperArray(2);

    arr2.add(4);
    System.out.println(arr1.isEmpty());

    arr2.add(3);
    arr2.add(5);
    arr2.add(10);
    System.out.println(arr2);

    arr2.grow(2);
    arr2.add(6);

    System.out.println(arr2);

    arr2.remove(2);
    System.out.println(arr2);

    arr2.add(1, 10);
    System.out.println(arr2);
  }//end main
}//end class
