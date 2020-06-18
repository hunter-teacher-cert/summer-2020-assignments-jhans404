public class Time{
  public static void main(String[] args){
    int hour = 18;
    int minute = 00;
    int second = 00;

    System.out.println(secondsElapsed(hour, minute, second) + " seconds have elapsed since midnight.");
    System.out.println(secondsRemaining(hour, minute, second) + " seconds are left in the day.");
    System.out.println(percentPassed(hour, minute, second) + "% of the day has elapsed.");

    int hour2 = 18;
    int minute2 = 01;
    int second2 = 05;

    int numSecondsWorking = secondsWorking(hour, minute, second, hour2, minute2, second2);
    System.out.println(numSecondsWorking + " seconds have elapsed working on this program.");

  }

  static int secondsElapsed(int h, int m, int s){
    return ((h * 3600) + (m * 60) + s);
  }

  static int secondsRemaining(int h, int m, int s){
    return (((23 - h) * 3600) + ((59 - m) * 60) + (60 - s));
  }

  static double percentPassed(int h, int m, int s){
    int totalSeconds = 24 * 60 * 60;
    return ((double)(secondsElapsed(h, m, s)) / totalSeconds) * 100;
  }

  static int secondsWorking(int h, int m, int s, int h2, int m2, int s2){
    return secondsElapsed(h2, m2, s2) - secondsElapsed(h, m, s);
  }
}
