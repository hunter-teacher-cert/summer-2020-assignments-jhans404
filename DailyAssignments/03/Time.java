import java.io.*;
import java.util.*;

public class Time{
  private int hour;
  private int minute;
  private double second;

  public Time(){
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }

  public Time(int h, int m, int s){
    this.hour = h;
    this.minute = m;
    this.second = s;
  }

  public boolean equals(Time other){
    return (this.hour == other.hour && this.minute == other.minute && this.second == other.second);
  }

  public int getHour(){
    return this.hour;
  }

  public int getMinute(){
    return this.minute;
  }

  public double getSecond(){
    return this.second;
  }

  public void setHour(int h){
    this.hour = h;
  }

  public Time add(Time t2) {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;

    if (sum.second >= 60.0) {
        sum.second -= 60.0;
        sum.minute += 1;
    }
    if (sum.minute >= 60) {
        sum.minute -= 60;
        sum.hour += 1;
    }
    return sum;
  }

  public void increment(double seconds) {
    this.second += seconds;
    while (this.second >= 60.0) {
        this.second -= 60.0;
        this.minute += 1;
    }
    while (this.minute >= 60) {
        this.minute -= 60;
        this.hour += 1;
    }
  }

  public String toString(){
    return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
  }

}
