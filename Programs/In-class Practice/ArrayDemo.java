/**
 * Array Demo
 * 3/29/16
 * MCS 141
 * */
 
public class ArrayDemo {
  public static void main( String [] args) {
     
    //declare an array
    String names [];
     
    //instantiate
    names = new String [5]; // has elements 0 to 4
    //currently, all elements are "null"
     
    //fill array element by element (inefficient)
    names[0] = "Alfred";
    names[1] = "Bob";
    names[2] = "Carl";
    names[3] = "Dana";
    //deliberately not setting names[4]
     
    System.out.println("names[0] is " + names[0]);
    System.out.println("names[4] is " + names[4]);
     
    //declaring a new array with instantiation
    int [] numbers = new int [10];
    //currently all set to 0
     
    //fill with a loop
    for (int i = 0; i<10 ; i++) {
      numbers[i] = i*i;
    }
     
    //output numbers[]
    for (int i = 0; i <= 9 ; i++) {
      System.out.println("numbers["+i+"] is "+ numbers[i]);
    }
     
    //another array (instantiate in-line)
    String [] names2 = {"Zelda", "Link", "Neo"};
     
    //find length
    System.out.println("names2 has length " + names2.length );
     
    //find the length of element at position 0
    System.out.println("length of element at position 0 is " + names2[0].length() );
     
    //accessing out-of-bounds elements
    //System.out.println( names2[3] );  //will cause an error
    //System.out.println( names2[-1] );  //will cause an error
    //System.out.println( names2[1000] );  //will cause an error
     
    //Changing the size of an array
    //Change the size of names2 to 6
    names2 = new String [6];
     
    //look inside:
    for (int i =0 ; i < names2.length ; i++) {
      System.out.println( names2[i] );
    }
    //we see that that all elements are now null
     
    //example of resizing an array (copying the array in the process)
    //Step 1:  make a temporary array to hold data
    int temp [] = new int [10];
    //Step 2:  copy elements over one by one
    for (int i = 0; i < numbers.length ; i++) {
      temp[i]=numbers[i];
    }
    //Step 3:  resize original array
    numbers = new int[11];
    //Step 4:  copy values back to resized array
    for (int i = 0; i < temp.length ; i++) {
      numbers[i]=temp[i];
    }
     
    //look inside
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
       
    numbers[10] = 100;
     
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
     
  }
}
