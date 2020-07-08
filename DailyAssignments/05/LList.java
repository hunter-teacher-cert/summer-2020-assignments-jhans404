import java.io.*;
import java.util.*;

public class LList{
  private Node head;
  private int length;

  public LList(){
    this.head = null; //empty linked list
    this.length = 0;
  }//end constructor method

  public void addFront(String data){
    Node newnode = new Node(data);
    newnode.setNext(head); // first point the new node to the beginning
    this.head = newnode; // point head to the new node
    this.length++;
  }//end add method

  public String get(int index){
    Node currentNode = this.head;
    if (index < this.length){
      for (int i = 0; i < index; i++){
        currentNode = currentNode.getNext();
      }//end for loop
      return currentNode.getData();
    }//end if-statement
    return null;
  }//end get method

  //without the instance variable implemented
    // while (i < index){
    //   if (currentNode.getNext() != null){
    //     currentNode = currentNode.getNext();
    //     i++;
    //   }//end if-statement
    //   else{
    //     return null;
    //   }//end else-statement
    // }//end while loop
    // return currentNode.getData();

  public void set(int index, String value){
    Node currentNode = this.head;
    if (index < this.length){
      for (int i = 0; i < index; i++){
        currentNode = currentNode.getNext();
      }//end for loop
      currentNode.setData(value);
    }//end if-statement
    return;
  }//end set method

  //without the instance variable implemented
    // while (i < index){
    //   if (currentNode.getNext() != null){
    //     currentNode = currentNode.getNext();
    //     i++;
    //   }//end if-statement
    //   else{
    //     return;
    //   }//end else-statement
    // }//end while loop
    // currentNode.setData(value);

  public void insert(int index, String value){
    if (index == 0){
      addFront(value);
    }//end if-statement
    else{
      Node currentNode = this.head;
      int i = 1;
      while (i < index){
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
      this.length++;
    }//end else-statement
  }//end insert method

  public int search(String key){
    Node currentNode = this.head;
    for (int i = 0; i < length; i++){
      if (currentNode.getData().equals(key)){
        return i;
      }//end if-statement
      currentNode = currentNode.getNext();
    }//end for loop
    return -1;
  }//end search method

  //without the instance variable implemented
    // Node currentNode = this.head;
    // int index = 0;
    // if (currentNode.getData().equals(key)){
    //   return index;
    // }//end if-statement
    // while (currentNode.getNext() != null){
    //   index++;
    //   currentNode = currentNode.getNext();
    //   if (currentNode.getData().equals(key)){
    //     return index;
    //   }//end if-statement
    // }//end while loop
    // return -1;


  public void remove(int index){
    if (index == 0){
      this.head = this.head.getNext();
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
      currentNode.setNext(currentNode.getNext().getNext());
      this.length--;
    }//end else-statement
  }//end remove method

  public boolean isEmpty(){
    return (this.head == null);
  }//end isEmpty method

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
