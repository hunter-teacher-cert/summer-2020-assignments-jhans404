public class TreeNode {
  /************INSTANCE VARIABLES************/
  int data;
  TreeNode left;
  TreeNode right;


  /************CONSTRCTORS************/
  public TreeNode() {
    this.data = 0;
    this.left = null;
    this.right = null;
  }//end constructor


  public TreeNode(int n) {
    this.data = n;
    this.left = null;
    this.right = null;
  }//end constructor


  /************OTHER METHODS************/
  public int getData() {
    return this.data;
  }//end getData


  public TreeNode getLeft() {
    return this.left;
  }//end getLeft


  public TreeNode getRight() {
    return this.right;
  }//end getRight


  public void setData(int n) {
    this.data = n;
  }//end setData


  public void setLeft(TreeNode l) {
    this.left = l;
  }//end setLeft


  public void setRight(TreeNode r) {
    this.right = r;
  }//end setRight

}//end class
