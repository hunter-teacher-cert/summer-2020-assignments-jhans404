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
      String top = this.arr.get(this.arr.size() - 1);
      this.arr.remove(this.arr.size() - 1);
      return top;
    }//end pop method

    public String top(){
        return this.arr.get(this.arr.size() - 1);
    }

    public boolean isEmpty(){
      return this.arr.size() == 0;
    }//end isEmpty method

    public int size(){
        return this.arr.size();
    }//end size method

    public String toString(){
      String s = "";
      for (int i = this.arr.size() - 1; i >= 0; i--){
        s += this.arr.get(i) + " ";
      }//end for loop
      return s;
    }//end toString method

}//end class
