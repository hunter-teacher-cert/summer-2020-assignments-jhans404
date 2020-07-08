import java.io.*;
import java.util.*;


public class LList{
  private Node head;

  public LList(){
    head = null;
  }//end constructor method

  public void addFront(String data){
    Node newnode = new Node(data);
    newnode.setNext(head); // first point the new node to the beginning
    head = newnode; // point head to the new node
  }//end add method


  public String get(int index){
    Node currentNode = this.head;
    String theData = "";
    int i = 0;
    while (i < index){
      if (currentNode.getNext() != null){
        currentNode = currentNode.getNext();
        i++;
      }//end if-statement
      else{
        return null;
      }//end else-statement
    }//end while loop
    return currentNode.getData();
  }//end get method

  public void set(int index, String value){
    Node currentNode = this.head;
    int i = 0;
    while (i < index){
      if (currentNode.getNext() != null){
        currentNode = currentNode.getNext();
        i++;
      }//end if-statement
      else{
        return;
      }//end else-statement
    }//end while loop
    currentNode.setData(value);
  }//end set method

  public void insert(int index, String value){
    if (index == 0){
      addFront(value);
    }//end if-statement
    else{
      Node currentNode = this.head;
      int i = 0;
      while (i < index - 1){
        if (currentNode.getNext() != null){
          currentNode = currentNode.getNext();
          i++;
        }//end if-statement
        else{
          return;
        }
      }//end while loop
      Node newNode = new Node(value);
      newNode.setNext(currentNode.getNext());
      currentNode.setNext(newNode);
    }//end else-statement
  }//end insert method

  public int search(String key){
    Node currentNode = this.head;
    int index = 0;
    if (currentNode.getData().equals(key)){
      return index;
    }//end if-statement
    while (currentNode.getNext() != null){
      index++;
      currentNode = currentNode.getNext();
      if (currentNode.getData().equals(key)){
        return index;
      }//end if-statement
    }//end while loop
    return -1;
  }//end search method

  public void remove(int index){
    
  }//end remove method

  public boolean isEmpty(){
    return (this.head == null);
  }//end isEmpty method

  public String toString(){
    String s = "";

    Node tmp;
    tmp = head;
    while (tmp != null){
      s = s + tmp.getData()+"-->";
      // how can we now move tmp to the next node
      // this is the magic linked list idiom!!!!
      // this moves a pointer to the next node!!!
      // It's analagous to i=i+1 for an array (for loop)
      tmp = tmp.getNext();
    }//end while loop
    s = s + "null";
    return s;
  }//end toString method

}//end class
