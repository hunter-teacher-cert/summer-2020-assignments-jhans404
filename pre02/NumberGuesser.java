import java.util.Scanner;

public class NumberGuesser{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int userGuess = 0;
    int numGuesses = 0;
    int min = 1;
    int initialOff = 0;

    //user declares the setup of the game
    System.out.print("Enter a maximum value: ");
    int max = s.nextInt();

    //get the random number
    int theNumber = (int)(Math.random() * (max) + min);

    //play the game until the guess is correct
    while (userGuess != theNumber){
      //get the user's guess, keep track of how many guesses
      System.out.println("Guess a number from " + min + " - " + max + ", inclusive.");
      userGuess = s.nextInt();
      numGuesses++;

      //calculation for specific output needed for the assignment
      if (numGuesses == 1){
        initialOff = Math.abs(theNumber - userGuess);
      }

      //user is a winner
      if (userGuess == theNumber){
        System.out.println("Congratulations!");
        System.out.println("It took you " +  numGuesses + " guesses to figure it out.");
        System.out.println("Your initial guess was off by " + initialOff + ".");
      }

      //not a winner
      else {
        System.out.println("Incorrect guess!");
        //guess too low; change lower bounds
        if (userGuess < theNumber){
          min = userGuess + 1;
        }
        //guess too high; change upper bounds
        else{
          max = userGuess - 1;
        }
      }
    }
    s.close();
  }
}
