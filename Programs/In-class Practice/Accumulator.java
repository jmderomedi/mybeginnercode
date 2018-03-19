public class Accumulator {
  
  private int sum;
  private int [] numbers;
  private int lastIndex;
  //default constructor
  public Accumulator () {
    sum = 0;
    numbers = new int [10]; // initialize to size 10 (will resize as necessary)
    lastIndex = -1;
  }
  
  public void add (int n) {
    sum = sum + n;
    lastIndex++;
    if (lastIndex >= numbers.length) { //resizes the array when it hit its limit
      resize();
    }
    numbers [lastIndex] = n; //stores 'n' into the array in the first open position
  }
  
  private void resize () {
    //make a temp array
    int [] temp =  new int [numbers.length + 10];
    for ( int i = 0; i < numbers.length; i++) {
      temp [i] = numbers [i];
    }
    numbers = temp;
    temp = null; // not necessary but very good habit
  }
  
  public int getSum() {
    return sum;
  }
  
  public int getCount () {
    return lastIndex + 1;
  }
  
  public int contains (int n) {
    for (int i = 0; i <= lastIndex; i++) {
      if (numbers[i] == n)
        return i;
    }
    return -1;
  }
  
  public double getAverage() {
    return (double)sum/(lastIndex + 1);
  }
  
  //Sorting an array
  public void sort() {
    int max;
    int maxIndex;
    int temp;
    for (int i=0; i < numbers.length -1; i++) {
      //find max element in subarray
      max = numbers[0];
      maxIndex = 0;
      for (int j = 0; j < lastIndex - i; j++) {
        if (numbers[j] > max) {
          max = numbers[j];
          maxIndex = j;
        }
      }
      //swap max value with element at the end
      temp = numbers[lastIndex - i];
      numbers [lastIndex - i] = max;
      numbers [maxIndex] = temp;
    }
    public String toString() {
      Strinf output = "";
      for (int i = 0; i <=lastIndex; i++) {
        output = output + numbers [i] = " ";
      }
      return output;
  }
}