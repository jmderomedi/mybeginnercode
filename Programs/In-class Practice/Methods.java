public class Methods
{
  public static void main ( String [] args );
  {
    SimpleDate independenceDay = new SimpleDate ( 7, 4, 1776 );
    int independenceMonth = independenceDay.getMonth ( );
    System.out.println ( "Independence day is in the month " + independenceMonth );
  }
}