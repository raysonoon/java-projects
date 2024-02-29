/**
 * The Time class models a time instance with second, minute and hour.
 * This class does not perform input validation for second, minute and hour.
 */
public class Time {
    // The private instance variables
    private int hour, minute, second;
 
    // The constructors (overloaded)
    /** Constructs a Time instance with the given second, minute and hour. No input validation */
    public Time(int hour, int minute, int second) {
       this.hour = hour;
       this.minute = minute;
       this.second = second;
    }
 
    // The public getters/setters for the private variables.
    /** Returns the second */
    public int getSecond() {
       return this.second;
    }
    /** Returns the minute */
    public int getMinute() {
       return this.minute;
    }
    /** Returns the hour */
    public int getHour() {
       return this.hour;
    }
    /** Sets the second. No input validation */
    public void setSecond(int second) {
       this.second = second;
    }
    /** Sets the minute. No input validation */
    public void setMinute(int minute) {
       this.minute = minute;
    }
    /** Sets the hour. No input validation */
    public void setHour(int hour) {
       this.hour = hour;
    }
 
    /** Returns a self-descriptive string in the form of  "hh:mm:ss" with leading zeros */
    public String toString() {
         // Use built-in function String.format() to form a formatted String
         return String.format("%02d:%02d:%02d", hour, minute, second);
               // Specifier "0" to print leading zeros, if available.
    }
 
    /** Sets second, minute and hour to the given values */
    public void setTime(int hour, int minute, int second) {
       // No input validation
       this.second = second;
       this.minute = minute;
       this.hour = hour;
    }
 
    /** Advances this Time instance by one second, and returns this instance to support chaining */
    public Time nextSecond() {
       ++second;
       if (second == 60) {
          second = 0;
          ++minute;
          if (minute == 60) {
             minute = 0;
             ++hour;
             if (hour == 24) {
                hour = 0;
             }
          }
       }
       return this;   // Return "this" instance, to support chaining operations
                      // e.g., t1.nextSecond().nextSecond()
    }

   /** Decreases this Time instance by one second, and returns this instance to support chaining */
   public Time previousSecond() {
    --second;
    if (second == -1) {
       second = 59;
       --minute;
       if (minute == -1) {
          minute = 59;
          --hour;
          if (hour == -1) {
             hour = 23;
          }
       }
    }
    return this;   // Return "this" instance, to support chaining operations
                   // e.g., t1.nextSecond().nextSecond()
 }
 }