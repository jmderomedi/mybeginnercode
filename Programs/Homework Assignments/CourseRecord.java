public class CourseRecord
{
  private String courseNumber;
  private String courseName;
  private int credits; 
  private char grade;
  
  //Default constructor
  public CourseRecord() {
    courseNumber = "AAA000";
    courseName = "default";
    credits = 0;
    grade = 'F';
  }
  
  //Overloaded constructor 
  public CourseRecord (String startcourseNumber , String startcourseName,
                         int startcredits , char startgrade) { 
    this();
    setCourseNumber( startcourseNumber);
    setCourseName( startcourseName);
    setCredits( startcredits);
    setGrade( startgrade);
    
  }
      
  public void setCourseNumber ( String newCourseNumber)
  {
    courseNumber = newCourseNumber ;
  }
    
  public String getCourseNumber() {
    return courseNumber;
  }
  
  public void setCourseName (String newCourseName)
  {
    courseName = newCourseName;
  }
  
  public String getCourseName() {
    return courseName;
  }
  
  public void setCredits (int newCredits)
  {
    if (newCredits >= 1 && newCredits <= 5)
    credits = newCredits;
    
    else 
      System.err.println( "Invalid credit" );
  }
   
  public int getCredits() {
    return credits;
  }
   
    
   public void setGrade (char newGrade)
   { 
     if (newGrade == 'A' || newGrade == 'B' || newGrade == 'C' || newGrade == 'D'|| newGrade == 'F')
     grade = newGrade;
     
     
     else 
     System.err.println( "Invalid Grade" );
   }
   
   
   public char getGrade() {
     return grade;
   }  
    
   public int getGradePoints ()
   {
     if (grade == 'A') 
    return 4 * credits;
   
   else if (grade == 'B')
     return 3 * credits;
   
   else if (grade == 'C')
     return 2 * credits;
   
   else if (grade == 'D')
     return 1 * credits;
   
    else return 0;
   }
  }