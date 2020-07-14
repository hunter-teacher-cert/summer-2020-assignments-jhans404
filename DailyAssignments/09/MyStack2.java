import java.io.*;
import java.util.*;

public class MyStack2{

  private Stack<String> stk;
  private String word;

  public MyStack2(String s){
    this.word = s;
    this.stk = new Stack<String>();

    int spaceIndex = s.indexOf(" "); // check to see if there is a space in the word
    int begin = 0;

    if(spaceIndex == -1){ // if there isn't a space, go character by character
      for (int i = 0; i < s.length(); i++){
        stk.push(s.substring(i, i + 1));
      }// end for loop
    }// end if statement
    else{ // split by word case
      while (spaceIndex != -1){ // while there are still spaces to go through
        stk.push(s.substring(begin, spaceIndex)); //grab a substring from begin to one index before where the space is
        begin = spaceIndex + 1; // reassign begin to just after the space found
        spaceIndex = s.indexOf(" ", spaceIndex + 1); // find the next existance of a space in the String
      }//end while loop
      stk.push(s.substring(begin)); // add the last word in the String
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
