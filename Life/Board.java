public class Board {
  //fields
  private Cell[][] world;
  private int generation;
  private int numAlive;

  //constructor
  public Board(int r, int c){
    this.generation = 1;
    world = new Cell[r][c];
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        world[i][j] = new Cell(10); //argument determines % chance of being alive at start
        if (world[i][j].getState()){
          this.numAlive++;
        }//end conditional
      }//end inner for loop (j)
    }//end outer for loop (i)
  }//end constructor method

  //other methods
  public void printBoard(){
    System.out.print("\033[1;0H\n"); //print output at top of terminal window
    for (int i = 0; i < this.world.length; i++){
      for (int j = 0; j < this.world[i].length; j++){
        if (this.world[i][j].getState()){ //if 'alive' display with an 'X'
          System.out.printf("\u001B[42m%c\u001B[0m ", 'X');
        }//end conditional
        else{ //'dead' just print empty space
          System.out.print("  ");
        }
      }//end inner for loop (j)
      System.out.println();
    }//end outer for loop (i)

    //print a line under board based on size of board row
    String line = "";
    for (int i = 0; i < this.world[0].length; i++){
      line += "- ";
    }//end loop
    System.out.println("\n" + line + "\n");
    System.out.printf("Generation: %d, Number Alive: %d\n", getGeneration(), getNumAlive());
  }//end printBoard method

  public void updateBoard(){
    this.generation++; //update tracker variable for generation number
    this.numAlive = 0; //reset tracker for number of cells alive in the generation

    //create a new 2D array to store boolean values of next generation's cells
    boolean[][] newBoard = new boolean[this.world.length][this.world[0].length];
    for (int i = 0; i < this.world.length; i++){
      for (int j = 0; j < this.world[i].length; j++){
        newBoard[i][j] = this.world[i][j].nextGen(countNeighbors(i, j));
      }//end inner loop (j)
    }//end outer loop (i)

    //transfer next generation's data to each cell object
    for (int i = 0; i < this.world.length; i++){
      for (int j = 0; j < this.world[i].length; j++){
        this.world[i][j].setState(newBoard[i][j]);
        if (world[i][j].getState()){
          this.numAlive++;
        }//end conditional
      }//end inner loop (j)
    }//end outer loop (i)
  }//end updateBoard method

  public int countNeighbors(int r, int c){
    int count = 0;
    for (int i = -1; i <= 1; i++){
      for (int j = -1; j <= 1; j++){
        //find a 'live' neightbor
        int col = (r + i + this.world[0].length) % this.world[0].length;
        int row = (c + j + this.world.length) % this.world.length;
        if (getStateLoc(col, row)){
          count++;
        }//end conditional
      }//end inner loop (j)
    }//end outer loop (i)

    //remove yourself from the count if you're 'alive'
    if (getStateLoc(r, c)){
      return (count - 1);
    }//end if
    return count;
  }//end countNeighbors method

  public boolean getStateLoc(int r, int c){
    return this.world[r][c].getState();
  }//getStateLoc method

  public int getNumAlive(){
    return this.numAlive;
  }//end getNumAlive method

  public int getGeneration(){
    return this.generation;
  }//end getGeneration method

}//end class
