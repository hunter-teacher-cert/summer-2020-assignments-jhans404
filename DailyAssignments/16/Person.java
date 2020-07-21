import java.io.*;
import java.util.*;

public class Person {

  /************INSTANCE VARIABLES************/
  private String firstName;
  private String lastName;
  private String phoneNumber;


  /************CONSTRUCTOR************/
  public Person(String f, String l, String n) {
    this.firstName = f;
    this.lastName = l;
    this.phoneNumber = n;
  }//end constructor method


  /************OTHER METHODS************/
  public String getFirstName() {
    return this.firstName;
  }//end getFirstName method


  public String getLastName() {
    return this.lastName;
  }//end getLastName method


  public String getPhoneNumber() {
    return this.phoneNumber;
  }//end getPhoneNumber method

  public void setFirstName(String f) {
    this.firstName = f;
  }//end setFirstName method


  public void setLastName(String l) {
    this.lastName = l;
  }//end setLastName method


  public void setPhoneNumber(String n) {
    this.phoneNumber = n;
  }//end setPhoneNumber method


  public int reducePhoneNumber() {
    int total = 0;

    for (int i = 0; i < this.phoneNumber.length() - 1; i++) {
      total += Integer.parseInt(this.phoneNumber.substring(i, i + 1));
    }
    total += Integer.parseInt(this.phoneNumber.substring(this.phoneNumber.length() - 1));
    return total % 11;
  }


  public String toString() {
    String toReturn = "";
    toReturn += this.firstName.substring(0, 1);
    toReturn += ". ";
    toReturn += this.lastName;
    toReturn += ": ";
    toReturn += "(" + this.phoneNumber.substring(0, 3) + ")";
    toReturn += this.phoneNumber.substring(3, 6);
    toReturn += "-";
    toReturn += this.phoneNumber.substring(6);

    return toReturn;
  }//end toString method


}//end class
