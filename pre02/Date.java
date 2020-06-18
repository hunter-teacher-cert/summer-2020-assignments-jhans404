public class Date{
  public static void main(String[] args){
    String day = "Friday";
    int date = 16;
    String month = "July";
    int year = 2015;

    americanFormat(day, date, month, year);
    europeanFormat(day, date, month, year);
  }

  static void americanFormat(String day, int date, String m, int y){
    System.out.println("American Format:");
    System.out.println(day + ", " + m + " " + date + ", " + y);
  }

  static void europeanFormat(String day, int date, String m, int y){
    System.out.println("European Format:");
    System.out.println(day + " " + date + " " + m + " " + y);
  }

}
