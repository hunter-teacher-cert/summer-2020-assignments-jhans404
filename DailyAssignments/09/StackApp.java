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


    private char pop(){
      char c = this.arr.get(this.arr.size() - 1);
      this.arr.remove(this.arr.size() - 1);
      return c;
    }//end pop method


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


    public boolean parenCheck(){
      int count = 0;
      for (int i = 0; i < this.word.length(); i++){
        char popped = this.pop();
        if (popped == '('){
          count++;
        }//end if-statement
        else if (popped == ')'){
          count--;
        }//end else if-statement
      }//end for loop
      return (count == 0);
    }//end parenCheck method

}//end class
