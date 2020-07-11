import java.io.*;
import java.util.*;

public class LListStack{
  private Node head;
  private int length;

  public LListStack(){
    this.head = null; //empty linked list
    this.length = 0;
  }//end constructor method


  public void push(String value){
    if (value == null){//exception
      throw new IllegalArgumentException();
    }//end if-statement

    Node newnode = new Node(value);
    newnode.setNext(head); // first point the new node to the beginning
    this.head = newnode; // point head to the new node
    this.length++;
  }//end push method


  public String top(int index){
    if (index < 0 || index > this.length){//exception
      throw new EmptyStackException();
    }//end if-statement
    else{
      return this.head.getData();
    }//end else-statement
  }//end top method


  public String pop(int index){
    if (index < 0 || index > this.length){//exception
      throw new EmptyStackException();
    }//end if-statement
    else{
      return this.head.getData();
      this.head = this.head.getNext();
      this.length--;
    }//end else-statement
  }//end pop method


  public int search(String key){
    if (key == null){//exception
      throw new IllegalArgumentException();
    }//end if-statement

    Node currentNode = this.head;
    for (int i = 0; i < length; i++){
      if (currentNode.getData().equals(key)){
        return i;
      }//end if-statement
      currentNode = currentNode.getNext();
    }//end for loop
    throw new NoSuchElementException();
  }//end search method


  public boolean isEmpty(){
    return (this.head == null);
  }//end isEmpty method


  public int size(){
    return this.length;
  }//end size method


  public String toString(){
    String s = "< ";

    Node tmp;
    tmp = head;
    while (tmp != null){
      s = s + tmp.getData()+ " ";
      // how can we now move tmp to the next node
      // this is the magic linked list idiom!!!!
      // this moves a pointer to the next node!!!
      // It's analagous to i=i+1 for an array (for loop)
      tmp = tmp.getNext();
    }//end while loop
    s = s + ">";
    return s;
  }//end toString method

}//end class
