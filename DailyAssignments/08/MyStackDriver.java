import java.util.*;
import java.io.*;

public class MyStackDriver{
  public static void main(String[] args) {
    MyStack st = new MyStack();
    st.push("Hello");
    System.out.println(st.size());
    st.push("Hi!");

    System.out.println(st.isEmpty());
    System.out.println(st.top());
    System.out.println(st.pop());
    System.out.println(st);
    System.out.println(st.pop());
    System.out.println(st.isEmpty());
  }//end main method

}//end class
