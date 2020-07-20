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

}//end class
