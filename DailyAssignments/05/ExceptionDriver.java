import java.io.*;
import java.util.*;

public class ExceptionDriver {
  public static void main(String[] args) {

    //int[] a = new int[5];
    //a[10] = 100;
    //System.out.println( 4 % 0 );
    //Node n = null;
    //n.setData("hello");


    LList g = new LList();

    try{
      g.addFront(null);
    }//end try
    catch (IllegalArgumentException e){
      System.out.println("Element not added");
    }//end catch

    
    g.addFront("good");
    g.addFront("news");
    g.addFront("everyone!");
    System.out.println(g);

  }//main()
}//class ExceptionDriver
