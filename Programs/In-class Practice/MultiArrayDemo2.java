/*Multi-Dimensional Array Demo 2
 * MCS 141
 * 4/19/16 */

public class MultiArrayDemo2 {
  public static void main (String [] args ) {
    int array [][] = { {1,3,5,7}, {2,4,6,8,10}, {10,20,30} };
    
    System.out.println(array.length);
    for (int i = 0; i<array.length; i++ ) {
      System.out.println(array[i].length);
    }
    
    //sum of the second row(index 1)
    int sum =0;
    for (int column = 0; column <array[1].length; column++) {
      sum += array[1][column];
    }
    System.out.println(sum);
    
    //Sum of the third column
    sum =0;
    for (int row = 0; row < array.length; row++) {
      sum += array[row][2];
    }
    System.out.println(sum);
    
    //summ of all elements
    sum = 0;
    //loop rows, the columns
    for (int row = 0; row <array.length; row++) {
      for (int column = 0; column <array[row].length; column++) {
        sum += array[row][column];
      }
    }
    System.out.println(sum);
  }
}
