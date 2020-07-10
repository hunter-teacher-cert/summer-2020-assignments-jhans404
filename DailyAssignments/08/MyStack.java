import java.util.*;
import java.io.*;

public class MyStack{
    private ArrayList<String> arr;


    public MyStack(){
      this.arr = new ArrayList<String>();
    }//end constructor method


    public void push(String data){
        this.arr.add(data);
    }//end push method


    public String pop(){
      if (!this.isEmpty()){
        String top = this.arr.get(this.arr.size() - 1);
        this.arr.remove(this.arr.size() - 1);
        return top;
      }//end if statment
      throw new EmptyStackException();
    }//end pop method


    public String top(){
      if (!this.isEmpty()){
        return this.arr.get(this.arr.size() - 1);
      }//end if statment
      throw new EmptyStackException();
    }//end top class


    public boolean isEmpty(){
      return this.arr.size() == 0;
    }//end isEmpty method


    public int size(){
        return this.arr.size();
    }//end size method


    public int search(String value){
      for (int i = this.size() - 1; i >= 0; i--){
        if (this.arr.get(i).equals(value)){
          return this.size() - 1 - i;
        }//end if-statement
      }//end for loop
      return -1;
    }//end search method


    public void clear(){
      if (!this.isEmpty()){
        for (int i = this.size() - 1; i >= 0; i--){
          this.arr.remove(i);
        }//end for loop
      }//end if-statement
      throw new EmptyStackException();
    }//end clear method


    public String toString(){
      String s = "";
      for (String elem : this.arr){
        s += elem + " ";
      }//end for loop
      return s;
    }//end toString method

}//end class
