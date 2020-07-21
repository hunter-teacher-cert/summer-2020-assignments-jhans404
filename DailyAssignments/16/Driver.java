import java.io.*;
import java.util.*;

public class Driver {
  public static void main(String[] args) {

    PhoneBook bk = new PhoneBook();
    Person me = new Person("Joshua", "Hans", "7185552021");
    Person p2 = new Person("Pedro", "Martinez", "1234567890");
    Person p3 = new Person("Pete", "Alonso", "1110000000");
    Person p4 = new Person("Noah", "Syndergaard", "7182345129");
    //System.out.println(me);
    bk.addToBook(me);
    bk.addToBook(p2);
    bk.addToBook(p3);
    bk.addToBook(p4);
    System.out.println(bk);

  }//end main method

}//end class
