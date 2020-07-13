import java.util.*;
import java.io.*;

public class StackApp extends MyStack{
    private String word;


    public StackApp(String s){
      this.word = s;
      super.arr = new ArrayList<Character>();
      for (int i = 0; i < s.length(); i++){
        super.arr.add(s.charAt(i));
      }// end for loop
    }// end constructor method

    // don't need anymore; now inherited
    // private char pop(){
    //   char c = this.arr.get(this.arr.size() - 1);
    //   this.arr.remove(this.arr.size() - 1);
    //   return c;
    // }// end pop method

    // can use inherited toString method now
    public String reverse(){
      return super.toString();
    }// end reverse method


    public boolean isPalendrome(){
      return this.word.equals(this.reverse());
    }// end isPalendrome method


    public boolean parenCheck(){
      int count = 0;
      for (int i = 0; i < this.word.length(); i++){
        char popped = this.pop();
        if (popped == '('){
          count++;
        }// end if-statement
        else if (popped == ')'){
          count--;
        }// end else if-statement
      }// end for loop
      return (count == 0);
    }// end parenCheck method

}// end class
