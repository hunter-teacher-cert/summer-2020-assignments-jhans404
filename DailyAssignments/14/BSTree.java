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


  private void preorderTraverse(TreeNode current) {
    if (current == null) {
      return;
    }//end if-statement

    System.out.print(current.getData() + ", ");

    preorderTraverse(current.getLeft());

    preorderTraverse(current.getRight());
  }//end overloaded preorderTraverse method


  public void preorderTraverse() {
    preorderTraverse(root);
    System.out.println();
  }//end preorderTraverse method


  private void inorderTraverse(TreeNode current) {
    if (current == null) {
      return;
    }//end if-statement

    inorderTraverse(current.getLeft());

    System.out.print(current.getData() + ", ");

    inorderTraverse(current.getRight());
  }//end overloaded inorderTraverse method


  public void inorderTraverse() {
    inorderTraverse(root);
    System.out.println();
  }//end inorderTraverse method


  private void postorderTraverse(TreeNode current) {
    if (current == null) {
      return;
    }//end if-statement

    postorderTraverse(current.getLeft());

    postorderTraverse(current.getRight());

    System.out.print(current.getData() + ", ");
  }//end overloaded postorderTraverse method


  public void postorderTraverse() {
    postorderTraverse(root);
    System.out.println();
  }//end postorderTraverse method


  public void delete(int key){
    // if the tree is empty, nothing to delete
    if (root==null) {
      return;
    }//end if-statement


    // find the node that we want to delete
    // and the node above it using piggybacking
    TreeNode front = root;
    TreeNode trailer = root;

    // do the piggyback loop
    // until we either find the node or null
    // if the key isn't present
    while (front != null && front.getData() != key) {
      if (front.getData() < key) {
        trailer = front;
        front = front.getRight();
      }//end if-statement

      else {
        trailer = front;
        front = front.getLeft();
      }//end else-statement
    }//end while loop

    // if the key wasn't in the tree
    if (front == null) {
      return;
    }

    // if we get here
    // front points to the node we want to delete
    // and trailer points to the one above it

    // case 1 -- the node we want to delete is a leaf
    if (front.getLeft() == null && front.getRight() == null) {
      // repoint front's parent to null
      if (trailer.getLeft() != null) {
        trailer.setLeft(null);
      }//end if-statement

      else {
        trailer.setRight(null);
      }//end else-statement
    }//end if-statment (case 1)

    // case 2
    else if (true /* check to see if front has one child */) {
      // repoint front's parent to front's child
    }

    else {
      // front has two children
      //
      // find the node with the largest value
      // on fronts left subtree
      // and replace front with it.
    }//end else-statement

  }//end delete method

}//end class
