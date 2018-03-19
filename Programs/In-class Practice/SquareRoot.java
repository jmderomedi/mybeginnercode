/* SquareRoot Class
 * MCS 141
 * 3/10/16
 * */

public class SquareRoot {
  
  private int coef; //coefficient
  private int rad; //radicand
  
  //default constructor
  public SquareRoot() {
    coef = 1;
    rad = 0;
  }
  
  //overloaded constructor
  public SquareRoot( int newRad ) {
    this();//calls default constructor
    //rad = newRad; // Revise this once a set method is available (needs data validation)
    setRad(newRad);
  }
  
  //overloaded constructor
  public SquareRoot( int newCoef, int newRad) {
    this(newRad);
    coef = newCoef;
  }
  
  //Accessor methods not required.  User doesn't need access to individual parameters
  
  //Mutator methods do not need to be public
  //setRad method verifies that rad >= 0
  private void setRad ( int newRad ) {
    if (newRad >= 0)
      rad = newRad;
    else
      System.err.println( "Cannot set radicand to a negative value.  Radicand unchanged.");
  }
  
  /* multiply radicals
   * Takes a parameter of a SquareRoot objects
   * returns a SquareRoot object equal to the product of this object and the parameter
   * */
  public SquareRoot multiply(SquareRoot sr) {
    int newCoef = this.coef * sr.coef ;
    int newRad = this.rad * sr.rad;
    SquareRoot temp = new SquareRoot (newCoef, newRad);
    temp = temp.reduce();
    return temp;
  }
  /* cant add radicals and return a radical */
  public SquareRoot add (SquareRoot sr)
  {
    SquareRoot temp1 = new SquareRoot (this.coef, this.rad);
    SquareRoot temp2 = new SquareRoot (sr.coef, sr.rad);
    temp1 = temp1.reduce();
    temp2 = temp2.reduce();
    if (temp1.rad == temp2.rad)
    {//if we can add them
      int newCoef = temp1.coef+temp2.coef;
      int newRad= temp1.rad;
      return new SquareRoot(newCoef,newRad);
    }
    //if cannot be added
    System.err.println("Add method called on radicals with unlike radicands" );
    return new SquareRoot (0,0);
  }
  /*Subtract mehtod is just like subtract method */
  public SquareRoot subtract(SquareRoot sr)
  {
    SquareRoot temp = new SquareRoot(-1*sr.coef,sr.rad);
    return this.add(temp);
  }
  
  /* reduce a radical
   * returns a SquareRoot object that is the simplified form of this object */
  public SquareRoot reduce ()
  {
    int nCoef = this.coef; // make copies of the variables so the original object is unmodifidied
    int nRad = this.rad;
    int largestSquare =1;
    for (int i = 1; i <=Math.sqrt(nRad)+1; i++) 
    {
      if (nRad % (i*i) == 0)
        largestSquare = i;
    }
    nRad = nRad/(largestSquare * largestSquare);
    nCoef = nCoef*largestSquare;
    return new SquareRoot (nCoef, nRad);
  }
  //override the toString() method
  public String toString() {
    if (coef == 0 || rad == 0)
      return "" + 0;
    if (rad == 1)
      return "" + coef;
    if (coef == 1)
      return "\u221A" + rad;
    return "" + coef + "\u221A" + rad;
    
  }
  /* Override the equals(Object o) method */
  public boolean equals (Object o) //method header MUST be this
  {
    if (!(o instanceof SquareRoot))
      return false;
    else 
    {
      SquareRoot temp = (SquareRoot) o; //Typecasting o into a SquareRoot
      temp = temp.reduce(); //reducing the object temp
      SquareRoot temp2 = this.reduce(); //Making an copy and reducing the calling object
      if (temp.coef == temp2.coef
            && temp.rad == temp2.rad)
        return true;
      else
        return false;
    }
  }
  
}
