public class SuperArray{
  private int[] arr;
  private int numElements = 0;

  public SuperArray(int n){
    this.arr = new int[n];
  }//end constructor method

  public SuperArray(){
    this.arr = new int[10];
  }//end constructor method

  public void add(int val){
    if (this.numElements < this.arr.length){
      this.arr[this.numElements] = val;
      numElements++;
    }//end if-statment
  }//end add method

  public int get(int i){
    if (i < this.numElements){
      return this.arr[i];
    }//end if-statment
    else{
      return -1;
    }//end else-statement
  }//end get method

  public boolean isEmpty(){
    return this.numElements == 0;
  }//end isEmpty method

  public String toString(){
    String output = "";
    for (int i = 0; i < this.numElements; i++){
      output += (this.arr[i] + " ");
    }//end for loop (i)
    return output;
  }//end toString method

}//end class
