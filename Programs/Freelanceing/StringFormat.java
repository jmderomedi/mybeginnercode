public class StringFormat
{
public static void main ( String [] args ) {
  
  String heading1 = "Exam_Name ";
  String heading2 = "Exam_Grade" ;
  String divider = "--------------------------------------------------";
  
  String course1 = "Java" ; String grade1 = "A";
  String course2 = "PHP" ; String grade2 = "B" ;
  String course3 = "VB NET" ; String grade3 = "A";
  

  System.out.printf ( "%-30s%s%n", heading1, heading2 );
  System.out.println (divider );
  
  System.out.printf ("%-15s%12s%n" , course1, grade1 );
  System.out.printf ("%-15s%11s%n", course2, grade2 );
  System.out.printf ("%-15s%7s%n", course3, grade3 );
  
  System.out.println (divider);

}
}