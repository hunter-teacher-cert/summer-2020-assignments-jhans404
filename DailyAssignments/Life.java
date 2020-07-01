public class Life{
  public static void main(String[] args) {
    char[][] board;
    int numRows = 30;
    int numCols = 30;

    board = createNewBoard(numRows, numCols);
    printBoard(board);

    for (int plays = 0; plays < 100; plays++){
      board = generateNextBoard(board);
      printBoard(board);
    }

  }//end main method

  public static char[][] createNewBoard(int rows, int cols){
    char board[][] = new char[rows][cols];
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++){
        int rand = (int)(Math.random() * 10);
        if (rand < 3){
          board[r][c] = 'X';
        }//end if
        else{
          board[r][c] = ' ';
        }//end else
        //board[r][c] = ' ';
      }//end inner for loop (c)
    }//end outer for loop (r)

    // //make glider
    // board[5][5] = 'X';
    // board[6][6] = 'X';
    // board[7][4] = 'X';
    // board[7][5] = 'X';
    // board[7][6] = 'X';
    return board;
  }

  public static void printBoard(char[][] board){
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++){
        System.out.printf("%c ", board[r][c]);
      }//end inner for loop (c)
      System.out.println();
    }//end outer for loop (r);
    String line = "";
    for (int i = 0; i < board[0].length; i++){
      line += "- ";
    }
    System.out.println("\n" + line + "\n");
  }//end printBoard method


  public static void setCell(char[][] board, int r, int c, char value){
    if (r >= 0 && r < board.length && c >= 0 && c < board[r].length){
      board[r][c] = value;
    }//end conditional
  }//end setCell method


  public static char nextGenCell(char[][] board, int r, int c){
    char currentState = board[r][c];
    int aliveNeighbors = countNeighbors(board, r, c);
    if (currentState == ' ' && aliveNeighbors == 3){
      return 'X';
    }//end if
    else if (currentState == 'X' && (aliveNeighbors < 2 || aliveNeighbors > 3)){
      return ' ';
    }//end else if
    else{
      return currentState;
    }//end else
  }//end nextGenCell method

  public static int countNeighbors(char[][] board, int r, int c){
    int count = 0;

    for (int i = -1; i <= 1; i++){
      for (int j = -1; j <= 1; j++){
        //find a 'live' neightbor
        int col = (r + i + board[0].length) % board[0].length;
        int row = (c + j + board.length) % board.length;
        if (board[col][row] == 'X'){
          count++;
        }//end conditional
      }//end inner loop (j)
    }//end outer loop (i)

    //remove yourself from the count if you're 'alive'
    if (board[r][c] == 'X'){
      return (count - 1);
    }//end if
    return count;
  }//end countNeighbors method

  public static char[][] generateNextBoard(char[][] board){
    char[][] newBoard = new char[board.length][board[0].length];
    for (int row = 0; row < board.length; row++){
      for (int col = 0; col < board[row].length; col++){
        setCell(newBoard, row, col, nextGenCell(board, row, col));
      }
    }
    return newBoard;
  }//end generateNextBoard method
}//end class
