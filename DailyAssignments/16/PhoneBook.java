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


  public String lookup(String n) {
    String name = "";
    Integer key = reducePhoneNumber(n);

    LinkedList<Person> p = book.get(key);
    for (int i = 0; i < p.size(); i++) {
      if (p.get(i).getPhoneNumber().equals(n)) {
        name += (p.get(i).getFirstName() + " " + p.get(i).getLastName());
        return name;
      }//end if statement
    }//end for loop

    throw new NoSuchElementException();
  }//end lookup method


  private Integer reducePhoneNumber(String n) {
    Integer total = 0;

    for (int i = 0; i < n.length() - 1; i++) {
      total += Integer.parseInt(n.substring(i, i + 1));
    }
    total += Integer.parseInt(n.substring(n.length() - 1));
    return total % 11;
  }//end reducePhoneNumber method


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
