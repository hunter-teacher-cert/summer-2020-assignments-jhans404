import java.io.*;
import java.util.*;


public class Driver {
  public static void main(String[] args) {
    BSTree t = new BSTree();

    // t.seed();//fills-out the tree
    //
    // int value;
    //
    // value = t.search(10);//exits in tree
    // System.out.println(value);
    //
    // value = t.search(15);//exists in tree
    // System.out.println(value);
    //
    // try {
    //   value = t.search(17);//doesn't exist in tree
    //   System.out.println(value);
    // }//end try
    // catch (NullPointerException e) {
    //   System.out.println("17 not in tree");
    // }//end catch
    //
    // t.insert(17);
    // System.out.println(t.search(17));


    t.insert(10);
    t.insert(20);
    t.insert(5);
    t.insert(7);
    t.insert(8);
    t.insert(3);
  }//end main method
}//end class
