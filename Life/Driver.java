import java.util.Scanner;

public class Driver {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean play = true;

    Board simulation = new Board(25, 25); //pass in the size of the board
    simulation.printBoard();


    while (play){
      simulation.updateBoard();
      simulation.printBoard();

      String next = s.nextLine();
      if (next.equals("q")){
        play = false; //sentinel loop escape
      }//end conditional
    }//end game loop
  }
}
