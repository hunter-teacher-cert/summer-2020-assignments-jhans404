import java.util.*;
import java.io.*;

public class StackApp{
    private ArrayList<Character> arr;
    private String word;


    public StackApp(String s){
      this.word = s;
      this.arr = new ArrayList<Character>();
      for (int i = 0; i < s.length(); i++){
        this.arr.add(s.charAt(i));
      }//end for loop
    }//end constructor method


    public String reverse(){
      String s = "";
      for (int i = this.arr.size() - 1; i >= 0; i--){
        s += this.arr.get(i) + "";
      }//end for loop
      return s;
    }//end reverse method


    public boolean isPalendrome(){
      return this.word.equals(this.reverse());
    }//end isPalendrome method
}//end class
