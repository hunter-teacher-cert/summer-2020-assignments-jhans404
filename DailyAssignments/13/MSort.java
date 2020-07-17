/**
**/

import java.io.*;
import java.util.*;

public class MSort {


  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList<Integer> prestoArrayListo(int numItems, int lo, int hi) {
    ArrayList<Integer> retArr = new ArrayList<Integer>();

    for(int i=0; i<numItems; i++) {
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()

  // find and return the index of the smallest value in the
  // ArrayList al from index lo to index hi inclusive
  public static int findSmallest(ArrayList<Integer> al, int lo, int hi){
    int maxIndexSoFar = lo;
    for (int i = lo; i <=hi; i++) {
      if (al.get(i) < al.get(maxIndexSoFar)) {
        maxIndexSoFar = i;
      }
    }
    return maxIndexSoFar;
  }

  public static void selectionSort(ArrayList<Integer> al) {

    int lo = 0;
    int temp;

    for (int i=0; i < al.size() - 1; i++) {
      lo = findSmallest(al, i, al.size()-1);
      temp = al.get(i);
      al.set(i, al.get(lo));
      al.set(lo, temp);
    }

  }//selectionSort

  //returns a sublist of al containing the elements at indices in the range [lo, hi)
  public static ArrayList<Integer> slice(ArrayList<Integer> al, int lo, int hi) {

    ArrayList<Integer> sub = new ArrayList<Integer>();
    for (; lo < hi; lo++) {
      sub.add( al.get(lo) );
    }//copy
    return sub;
  }//slice


  //Input: 2 SORTED ArrayLists
   //returns 1 new SORTED ArrayList containing all the elements from lists a and b
  public static ArrayList<Integer> merge(ArrayList<Integer> a,
                                         ArrayList<Integer> b) {
    //setup variables
    //   make a new ArrayList
    //   indices for each input
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int indexA = 0;
    int indexB = 0;

    //while both indices are less than their respective lengths
    while (indexA < a.size() && indexB < b.size()) {
      //compare current index elements of each input list
      //add the smaller value to the new list
      //update index we took the value from
      if (a.get(indexA) < b.get(indexB)) {
        arr.add(a.get(indexA));
        indexA++;
      }//end if-statement
      else{
        arr.add(b.get(indexB));
        indexB++;
      }//end else-statement
    }//end while loop

    //loop ends: one index is past the end of the list
    //copy the values from the reamining list over
    while (indexB < b.size()) {
      arr.add(b.get(indexB));
      indexB++;
    }//end while-loop

    while (indexA < a.size()) {
      arr.add(a.get(indexA));
      indexA++;
    }//end for-loop

    //return the new list
    return arr;
  }//merge


  public static ArrayList<Integer> mergeSort(ArrayList<Integer> al) {
    if (al.size() <= 1) {
      return al;
    }//end if-statement

    //slice ArrayList into 2 ArrayLists of roughly equal size
    int mid = al.size() / 2;
    ArrayList<Integer> bottomHalf = slice(al, 0, mid);
    ArrayList<Integer> topHalf = slice(al, mid, al.size());

    return merge(mergeSort(bottomHalf), mergeSort(topHalf));
  }//end mergeSort method


  public static void main( String[] args ) {
    // ArrayList<Integer> rando = prestoArrayListo(10, 0, 100);
    // ArrayList<Integer> calrissian = prestoArrayListo(10, 0, 100);
    //
    // selectionSort(rando);
    // selectionSort(calrissian);
    //
    // System.out.printf("rando: %s\n", rando);
    // System.out.printf("calrissian: %s\n", calrissian);
    //
    // ArrayList<Integer> randoCalrissian = merge(rando, calrissian);
    // System.out.printf("randoCalrissian: %s\n", randoCalrissian);
    // System.out.println(randoCalrissian.size()); //check all elements made it in

    ArrayList<Integer> test = prestoArrayListo(100, 0, 100);
    ArrayList<Integer> sorted = mergeSort(test);
    System.out.println(test);
    System.out.println(sorted);

  }//end main

}//end class
