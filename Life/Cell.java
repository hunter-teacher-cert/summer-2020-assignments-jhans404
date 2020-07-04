public class Cell {
  //fields
  private boolean state;

  //constructor
  public Cell(int chance){
    int rand = (int)(Math.random() * 100);
    if (rand < chance){
      this.state = true;
    }//end conditional
    else{
      this.state = false;
    }//end else
  }//end constructor method

  //other methods
  public boolean getState(){
    return this.state;
  }//end getState method

  public boolean nextGen(int n){
    if (!this.state && n == 3){ //dead to become alive
      return true;
    }//end if
    else if (this.state && (n == 2 || n == 3)){ //alive and staying alive
      return true;
    }//end else if
    else{ //will be dead 
      return false;
    }//end else
  }//end setState method\

  public void setState(boolean newState){
    this.state = newState;
  }//end setState method

}//end class
