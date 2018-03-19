/* Accumulator class version 2 (Uses Arrays class to implement the sort)
 * Computes the sum of all numbers entered (and keeps track of all numbers entered)
 * MCS 141
 * 4/12/16
 * */
 
import java.util.*;
public class Accumulator2 {
   
  private int sum; // total of all values entered
  private int [] numbers; // array to track all individual values entered
  private int lastIndex; //track the last index used
   
  //default constructor
  public Accumulator2() {
    sum = 0;
    numbers = new int [10]; //initialize to size 10 (will resize as necessary)
    lastIndex = -1;
  }
   
  //method to add values to sum & array
  public void add(int n) {
    sum = sum + n;
    lastIndex++;
    if (lastIndex >= numbers.length) // resize array before trying to add an element outside the bounds
      resize();
    numbers[lastIndex] = n; //stores "n" into the array in the first open position
  }
   
  //method to increase the size of the array by 10
  private void resize() {
    //make temp array
    int [] temp = new int [numbers.length + 10];
    for (int i = 0; i < numbers.length; i++ ) {
      temp[i] = numbers[i];
    }
    numbers = temp;
    temp = null; //optional since temp will go away at method close
  }
   
  //returns sum of values
  public int getSum() {
    return sum;
  }
   
  //returns number of values
  public int getCount() {
    return lastIndex + 1;
  }
   
  //returns the array of integers
  public int[] getNumbers() {
    int temp [] = new int [numbers.length];
    for (int i = 0; i < numbers.length; i++ ) {
      temp[i] = numbers[i];
    }
    return temp;  //returns a copy of the array, not the array reference itself
  }
   
  //determines if a certain number is in the array
  public int contains(int n) {
    for (int i = 0; i <= lastIndex; i++) {
      if (numbers[i] == n)
        return i; // returns the index at which the element was found
    }
    //value not found
    return -1; //return -1 if value not found
  }
   
  public double getAverage() {
    return (double)sum/(lastIndex + 1);
  }
   
  //selection sort
  public void sort() {
    Arrays.sort(numbers, 0, lastIndex + 1); // call the version of sort for a subarray
  }
   
  public String toString() {
    String output = "";
    for (int i = 0; i <= lastIndex; i++) {
      output = output + numbers[i] + " ";
    }
    return output;
  }
   
   
}
     
    
