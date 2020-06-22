import java.util.Scanner;

public class Craps{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("How many rounds would you like to play? ");
    int numRounds = s.nextInt();

    for (int i = 0; i < numRounds; i++){
      System.out.println("ROUND " + (i + 1));
      if (round()){
        System.out.println("Player Wins!");
    }
      else{
        System.out.println("Player Loses!");
      }
      System.out.println();
    }
  }

  public static int roll(int a){
    return (int)(Math.random() * a + 1);
  }

  public static int shoot(int numDice, int max){
    int sum = 0;
    for (int i = 0; i < numDice; i++){
      sum += roll(max);
    }
    return sum;
  }

  public static boolean round(){
    int point = shoot(2, 6);
    System.out.println("Player rolled a " + point);
    if (point == 2 || point == 3 || point == 12){
      System.out.println("Craps!");
      return false;
    }

    else if (point == 7 || point == 11){
      System.out.println("Natural!");
      return true;
    }

    else{
      int nextRoll = 0;
      while (nextRoll != point && nextRoll != 7){
        nextRoll = shoot(2, 6);
        System.out.println("Player then rolled a " + nextRoll);
      }

      if (nextRoll == 7){
        return false;
      }
      else{
        return true;
      }
    }
  }
}
