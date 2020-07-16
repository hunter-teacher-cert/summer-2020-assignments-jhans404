import java.util.*;
import java.io.*;

public class Test{
  public static ArrayList<Integer> slice(ArrayList<Integer> al, int lo, int hi) {
    ArrayList<Integer> sub = new ArrayList<Integer>();

    for (; lo < hi; lo++) {
      sub.add( al.get(lo) );
    }//copy
    return sub;
  }//end slice

  public static ArrayList<Integer> prestoArrayListo(int numItems, int lo, int hi){
    ArrayList<Integer> retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }//end for loop
    return retArr;
  }//end prestoArrayListo()

  public static void main( String[] args ){

      // int smallIndex;
      // System.out.println("Testing findSmallest");
      ArrayList<Integer>  slist = prestoArrayListo(16,0,200);
      // smallIndex = findSmallest(slist,0,slist.size());
      System.out.println(slist);
      // System.out.printf("Smallest is at slist[%d] and is %d\n",smallIndex,slist.get(smallIndex));
      System.out.println(slice(slist, 0, 4));
  }// end main

}//end class
