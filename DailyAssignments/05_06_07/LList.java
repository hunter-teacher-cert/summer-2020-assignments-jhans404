import java.io.*;
import java.util.*;

public class LList{
  private Node head;
  private int length;

  public LList(){
    this.head = null; //empty linked list
    this.length = 0;
  }//end constructor method


  public void addFront(String value){
    if (value == null){//exception
      throw new IllegalArgumentException();
    }//end if-statement

    Node newnode = new Node(value);
    newnode.setNext(head); // first point the new node to the beginning
    this.head = newnode; // point head to the new node
    this.length++;
  }//end add method


  public String get(int index){
    if (index < 0 || index > this.length){//exception
      throw new IndexOutOfBoundsException();
    }//end if-statement

    Node currentNode = this.head;
    if (index < this.length){
      for (int i = 0; i < index; i++){
        currentNode = currentNode.getNext();
      }//end for loop
      return currentNode.getData();
    }//end if-statement
    return null;
  }//end get method

  // private Node nodeAtIndex(int index) {
	// 	int i = 0;
	// 	Node ptr = head;
	// 	while ((ptr != null) && (i < index)) {
	// 		ptr = ptr.getNext();
	// 		i++;
	// 	}
	// 	return ptr;
	// }

  public void set(int index, String value){
    if (index < 0 || index > this.length){//exception
      throw new IndexOutOfBoundsException();
    }//end if-statement

    if (value == null){//exception
      throw new IllegalArgumentException();
    }//end if-statement

    Node currentNode = this.head;
    if (index < this.length){
      for (int i = 0; i < index; i++){
        currentNode = currentNode.getNext();
      }//end for loop
      currentNode.setData(value);
    }//end if-statement
    return;
  }//end set method


  public void insert(int index, String value){
    if (index < 0 || index > this.length){//exception
      throw new IndexOutOfBoundsException();
    }//end if-statement

    if (value == null){//exception
      throw new IllegalArgumentException();
    }//end if-statement

    if (index == 0){
      addFront(value);
    }//end if-statement
    else{
      Node currentNode = this.head;
      for (int i = 0; i < index - 1; i++){
        currentNode = currentNode.getNext();
        if (currentNode == null){
          return;
        }//end if-statement
      }//end for loop
      Node newNode = currentNode.getNext();
      currentNode.setNext(new Node(value, newNode));
      length++;
    }//end else-statement
  }//end insert method


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


  public void remove(int index){
    if (index < 0 || index > this.length){//exception
      throw new IndexOutOfBoundsException();
    }//end if-statement

    if (index == 0){
      this.head = this.head.getNext();
    }//end if-statement
    else{
      Node currentNode = this.head;
      for (int i = 0; i < index - 1; i++){
        currentNode = currentNode.getNext();
        if (currentNode == null){
          return;
        }//end if-statement
      }//end for loop
      currentNode.setNext(currentNode.getNext().getNext());
    }//end else-statement
    this.length--;
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
