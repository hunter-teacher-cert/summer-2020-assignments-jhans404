public class Life{
  public static void main(String[] args) {
    char[][] board;
    board = createNewBoard(25, 25);
    printBoard(board);

    setCell(board, 3, 3, 'O');
    printBoard(board);
  }//end main method

  public static char[][] createNewBoard(int rows, int cols){
    char board[][] = new char[rows][cols];
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++){
        board[r][c] = 'X';
      }//end inner for loop (c)
    }//end outer for loop (r)
    return board;
  }


  public static void printBoard(char[][] board){
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++){
        System.out.printf("%c ", board[r][c]);
      }//end inner for loop (c)
      System.out.println();
    }//end outer for loop (r);
    System.out.println("\n------------------\n");
  }//end printBoard method


  public static void setCell(char[][] board, int r, int c, char value){
    if (r >= 0 && r < board.length && c >= 0 && c < board[r].length){
      board[r][c] = value;
    }//end conditional
  }//end setCell method


  public static char nextGenCell(char[][] board, int r, int c){

    return ' ';
  }//end nextGenCell method

  public static int countNeighbors(char[][] board, int r, int c){
    int count = 0;

    return count;
  }

  public static board[][] generateNextBoard(char[][] board){
    char newBoard = char[25][25];

    return newBoard;

  }//end generateNextBoard method
}//end class
