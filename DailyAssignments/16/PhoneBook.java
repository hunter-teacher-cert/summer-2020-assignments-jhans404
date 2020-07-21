import java.io.*;
import java.util.*;

public class PhoneBook {

  /************INSTANCE VARIABLES************/
  private HashMap<Integer, LinkedList<Person>> book = new HashMap<Integer, LinkedList<Person>>();


  /************CONSTRUCTOR************/
  public PhoneBook() {

  }//end constructor method

  /************OTHER METHODS************/
  public void addToBook(Person p) {
    int key = p.reducePhoneNumber();

    LinkedList<Person> numbers = book.get(key);
    if (numbers == null) {
      numbers = new LinkedList<Person>();
      numbers.add(p);
      book.put(key, numbers);
    }//end if-statement

    else {
      numbers.add(p);
    }//end else-statement
  }//end add method

  public void test() {
    System.out.println("key: 3, value: " + book.get(3));
  }//end test method

  public String toString() {
    String toReturn = "";

    for (Integer i : book.keySet()) {
      toReturn += i;
      toReturn += ": ";
      LinkedList<Person> p = book.get(i);

      for (int j = 0; j < p.size(); j++) {
        toReturn += p.get(j);
        toReturn += ", ";
      }//end for loop

      toReturn += "\n";
    }//end for:each

    return toReturn;
  }//end toString method

}//end class
