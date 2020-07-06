public class ArrExample{
  public static void main(String[] args){
    int[][] arr = new int[10][10];

    // rowPop(arr, 2, 10);
    // colPop(arr, 3, 255);
    // invert(arr);
    // diagonal(arr, 8, 3, 0, 111);
    // diagonal(arr, 0, 5, 1, 222);
    // diagonal(arr, 6, 6, 2, 333);
    // diagonal(arr, 0, 0, 3, 444);

    print2d(arr);

  }//end main method

  public static void print2d(int[][] a){
    for (int r = 0; r < a.length; r++){
      for (int c = 0; c < a[r].length; c++){
        System.out.printf("%03d ", a[r][c]);
      }//end inner for loop (row)
      System.out.println();
    }//end outer for loop (column)
  }//end printArray

  //Populates row r in d2 with value
  public static void rowPop(int[][] d2, int r, int value){
    for (int c = 0; c < d2[r].length; c++){
      d2[r][c] = value;
    }//end for loop
  }//end rowPop method

  //Populates column c in d2 with value
  public static void colPop(int[][] d2, int c, int value){
    for (int r = 0; r < d2.length; r++){
      d2[r][c] = value;
    }//end for loop
  }//end colPop method

  /*
   * Goes through d2 and modifies each element like so:
   * All 0s should become 255
   * Any non-0 value should become 0
   */
  public static void invert(int[][] d2){
    for (int r = 0; r < d2.length; r++){
      for (int c = 0; c < d2[r].length; c++){
        if (d2[r][c] == 0){
          d2[r][c] = 255;
        }//end if
        else if (d2[r][c] == 255){
          d2[r][c] = 0;
        }//end else if
      }//end innter for loop (columns)
    }//end outer for loop (rows)
  }//end invert method

  /*
   * 0: go up and to the left
   * 1: go up and to the right
   * 2: go down and to the left
   * 3: go down and to the right
   */
  public static void diagonal(int[][]d2, int r, int c, int direction, int value){
    switch (direction){
      case 0: //up and left
        while (r >= 0 && c >= 0){
          d2[r][c] = value;
          r--;
          c--;
        }//end while loop
        break;

      case 1: //up and right
        while (r >= 0 && c < d2[r].length){
          d2[r][c] = value;
          r--;
          c++;
        }//end while loop
        break;

      case 2: //down and left
        while (r < d2.length && c >= 0){
          d2[r][c] = value;
          r++;
          c--;
        }//end while loop
        break;

      case 3: //down and right
        while (r < d2.length && c < d2[r].length){
          d2[r][c] = value;
          r++;
          c++;
        }//end while loop
        break;

    }//end switch statement
  }//end diagonal method

}//end class
