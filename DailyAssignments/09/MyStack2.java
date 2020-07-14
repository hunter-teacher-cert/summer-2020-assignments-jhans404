import java.io.*;
import java.util.*;

public class MyStack2{

  private Stack<String> stk;
  private String word;

  public MyStack2(String s){
    this.word = s;
    this.stk = new Stack<String>();

    int spaceIndex = s.indexOf(" ");
    int begin = 0;

    if(spaceIndex == -1){
      for (int i = 0; i < s.length(); i++){
        stk.push(s.substring(i, i + 1));
      }// end for loop
    }// end if statement
    else{
      while (spaceIndex != -1){
        stk.push(s.substring(begin, spaceIndex));
        begin = spaceIndex + 1;
        spaceIndex = s.indexOf(" ", spaceIndex + 1);
      }//end while loop
      stk.push(s.substring(begin));
    }// end else statement
  }// end constructor method


  public String reverse(){
    String r = "";
    while(this.stk.size() > 1){
      r += this.stk.pop() + " ";
    }//end while loop
    r += this.stk.pop();
    return r;
  }// end reverse method


  public boolean isPalendrome(){
    return this.word.equals(this.reverse());
  }// end isPalendrome method


  public String toString(){
    return this.stk.toString();
  }// end toString method

}// end class
