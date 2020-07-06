
import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    Time t = new Time(10, 20, 35);
    System.out.println(t);

    System.out.println(t);

    Time t2 = new Time();
    System.out.println(t2);
    t2.setHour(11);
    System.out.println(t2);

    System.out.println(t2.getHour());

    System.out.println(t.equals(t2));
  }
}
