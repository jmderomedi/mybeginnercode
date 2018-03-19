/* Conversion Demo 
 * MCS 141
 * 1/28/16 */

public class ConversionDemo
{
  public static void main ( String [] args )
  {
    //Convert 6 cm to inches
    //Declare known values
    final double INCH_TO_CM =2.54;
    int cm = 6;
    double inch;
    
    inch = cm /INCH_TO_CM;
    
    //System.out.println ("Conversion of 6 cm to inches is " +inch + ".");
    
    //Converting back
    double cm2 =inch*INCH_TO_CM;
    //System.out.println ("Conversion of " +inch + "inches is " + cm2 + ".");
     
     //Convert minutes to hours and mintues
     int minutes = 430;
     int hours;
     int remaining;
     
     hours = minutes/60;
     remaining = 430 % 60;
     System.out.println (minutes + " minutes is " + hours 
                           + " hours and " + remaining + " minutes");
     
  }
}
    