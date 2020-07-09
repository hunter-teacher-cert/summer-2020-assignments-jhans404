public class SuperArray{
  private int[] arr;
  private int numElements = 0;

  public SuperArray(int n){
    this.arr = new int[n];
  }//end constructor method

  /*
  public SuperArray(){
    this.arr = new int[10];
  }//end constructor method
  */

  //shortcut call
  public SuperArray(){
    this(10);
  }

  public void add(int val){
    if (this.numElements < this.arr.length){
      this.arr[this.numElements] = val;
      numElements++;
    }//end if-statment
    else{
      grow(1);
      add(val);
    }//end else
  }//end add method

  public void add(int index, int val){
    if (index == numElements){
      grow(1);
    }//end if-statment

    for (int i = this.numElements; i > index; i--){
      this.arr[i] = this.arr[i - 1];
    }//end for loop (i)

    this.arr[index] = val;
    this.numElements++;

  }//end add method

  public void set(int i, int val){
    this.arr[i] = val;
  }//end set method

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

  public void grow(int n){ //private?
    int [] largerArray = new int[this.arr.length + n];
    for (int i = 0; i < this.numElements; i++){
      largerArray[i] = this.arr[i];
    }//end for loop (i)
    this.arr = largerArray;
  }//end grow method

  public void remove(int index){
    for (int i = index; i < this.numElements; i++){
      this.arr[i] = this.arr[i + 1];
    }//end for loop (i)
    //this.arr[numElements] = 0;
    numElements--;
  }//end remove method

  public String toString(){
    String output = "";
    for (int i = 0; i < this.numElements; i++){
      output += (this.arr[i] + " ");
    }//end for loop (i)
    return output;
  }//end toString method

}//end class
