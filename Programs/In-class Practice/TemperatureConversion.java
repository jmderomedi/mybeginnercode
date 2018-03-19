/* Temperature Conversion
   Deromedi, James
   MCS 141 */
 
public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
     int fer = 32;
     double cel;
     double fer2;
     double celEquation =(5.0/9)*(fer-32);
     double ferEquation = ((9.0/5)*celEquation) + 32;
    
             
      //***** 2.  declare temperature in Fahrenheit as an int 
             
      //***** 3. calculate equivalent Celsius temperature  
       cel= celEquation;

             
      //***** 4. output the temperature in Celsius
        System.out.println (fer +" degrees in Fahreneit is " + cel +" in Celsius");
                                                   
      //***** 5. convert Celsius temperature back to Fahrenheit
         fer2= ferEquation;
                 
      //***** 6. output Fahrenheit temperature to check correctness 
         System.out.println (cel + " degrees in Celsius is " +fer + " in Fahrenheit");
                 
   }
}
 