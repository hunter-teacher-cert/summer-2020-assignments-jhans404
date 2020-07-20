import java.io.*;
import java.util.*;

public class BSTree {
  /************INSTANCE VARIABLES************/
  private TreeNode root;


  /************CONSTRCTOR************/
  public BSTree() {
    root = null;
  }//end constructor


  /************OTHER METHODS************/
  public void seed() {
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    t = new TreeNode(5);
    root.setLeft(t);
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight(new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);

  }//end seed method


  public int search(int val) {
    TreeNode current = root;

    while (current != null) {
      int currentValue = current.getData();
      if (currentValue == val) {
        return currentValue;
      }//end if-statement

      else if (currentValue < val) {
        current = current.getRight();
      }//end else/if-statement

      else {
        current = current.getLeft();
      }//end else-statement
    }//end while loop

    throw new NullPointerException();
  }//end search method


  public void insert(int val) {
    TreeNode newNode = new TreeNode(val);

    if (root == null) {
      root = newNode;
      return;
    }//end if-statement

    TreeNode front = root;
    TreeNode trailer = null;

    while (front != null) {
      int currentValue = front.getData();
      if (currentValue == val) {
        return;
      }//end if-statement

      else if (currentValue < val) {
        trailer = front;
        front = front.getRight();
      }//end else/if-statement

      else {
        trailer = front;
        front = front.getLeft();
      }//end else-statement
    }//end while loop

    if (trailer.getData() < val) {
      trailer.setRight(newNode);
    }//end if-statement

    else {
      trailer.setLeft(newNode);
    }//end else-statement

  }//end insert method


  private void traverse(TreeNode current) {
    if (current == null) {
      return;
    }//end if-statement

    System.out.print(current.getData() + ", ");

    traverse(current.getLeft());

    traverse(current.getRight());
  }//end overloaded traverse method


  public void traverse() {
    traverse(root);
  }//end traverse method

}//end class
