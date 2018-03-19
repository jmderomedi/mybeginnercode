public class FreeLance
{
  public static void main ( String [ ] args )
  {
    //How many seconds are in one century
    //The long way
    
    /*To use implicit typecasting remove line 12s and 61s comment and make line 11 and 60 a comment
     * To use explicit typecasting remove line 11s and 60s comment and make line 12 and 61 a comment */
    
    int years = 100;
    //long years = 100L
    
    int weeks = 52;
    int days = 7;
    int hours = 24;
    int minutes = 60;
    int seconds = 1;
   
    /* There are 60 seconds in a minute
     * Multiply 1 second by 60
     *To achieve how many seconds in a minute*/
    
    int secInAMin = seconds * minutes;
   //System.out.println ( "There are " +secInAMin +  " seconds in a minute" );
   
   /*There are 60 minutes in a hour
    * Multiply 60 seconds by 60 
    *To achieve how many seconds in a hour*/
    
   int secInAHour = secInAMin * minutes;
   //System.out.println ( "There are " +secInAHour + " seconds in a hour" );
   
   /*There are 24 hours in a day
    * Multiply 3600 seconds by 24 
    *To achieve how many seconds in day*/
   
   int secInADay = secInAHour * hours;
   //System.out.println ( "There are " +secInADay + " seconds in a day" );
   
   /*There are 7 days in a week
    * Multiply 86400 seconds by 7 
    *To achieve how many seconds in a week*/
   
   int secInAWeek = secInADay * days;
   //System.out.println ( "There are " +secInAWeek + " seconds in a week" );
   
   /*There are 52 weeks in a year
    * Multiply 604800 seconds by 52
    * To achieve how many seconds in a year */
   
   int secInAYear = secInAWeek * weeks;
   //System.out.println ( "There are " +secInAYear + " seconds in a year" );

   
   /*There are 100 years in a century
    * Multiply 31449600 by 100
    * To achieve how many seconds in a century */
   
    long secInACentury = (long) secInAYear * years;
    //long secInACentury =  secInAYear * years;
    System.out.println ( "Using the long way, there are " +secInACentury + " seconds in a century" );
   
 
   //How many seconds in a century
   //The shortcut way
   
   /*One century is 100 years
   int sec = 100; */
    
   /*Have to make the it a long becasue the number gets to long for a an int */
   long second = 100L;
   //System.out.println ( +second );
   
   second *= 52;
   //System.out.println ( +second );
   
   second *= 7;
   //System.out.println ( +second );
   
   second *= 24;
   //System.out.println ( +second );
   
   second *= 60;
   //System.out.println ( +second );
   
   second *= 60;
   System.out.println ( "Using the shortcut, there are " +second + " seconds in a century" );


   
   
   
  }
}
    
