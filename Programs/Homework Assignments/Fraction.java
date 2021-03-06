/*MCS 141
 * 5/4/16 May the 4th be with you
 * Fraction Class
 * James Deromedi */

public class Fraction {
  
  private int num;
  private int den;
  
  /*---------------------------------------*/
  public Fraction() {
    num = 1;
    den = 1;
  }
  
  /*---------------------------------------*/
  public Fraction(int num) {
    this.num = num;
    den = 1;
  }
  
  /*---------------------------------------*/
  public Fraction(int num, int den) {
    this();
    this.num = num;
    setden(den);
  }
  
  /*---------------------------------------*/
  private void setden (int den) {
    if ( den == 0)
      System.err.println( "Making the denominator zero is invalid and dangerous");
    else
      this.den = den;
  }
  
  /*---------------------------------------*/
  public int getnum() {
    return num; 
  }
  
  /*---------------------------------------*/
  public int getden() {
    return den; 
  }
  
  /*---------------------------------------*/
  public String toString() {
    if (num == 0){
      return "" + 0;
    }
    if (den == 1) {
      return "" + num;
    }
    return "" + num + "/" + den;
  }
  
  /*---------------------------------------*/
  public Fraction reduce() {
    int nNum = this.num;
    int nDen = this.den;
    int GCF = 1;
    if (nNum > 0 && nDen < 0){
      nDen *= -1;
      nNum *= -1;
    }
    if (nNum < 0 && nDen < 0){
      nNum *= -1;
      nDen *= -1;
    }
    for (int i = 1; i<(Math.abs(nNum)+nDen); i++) {
      if((nDen % i) == 0 &&(nNum % i)==0){
        GCF = i;
      }
    }
    return new Fraction (nNum/= GCF, nDen/= GCF);
  }
  
  /*---------------------------------------*/
  public Fraction multiply(Fraction f) {
    return new Fraction (this.num * f.num, this.den*f.den).reduce();
  }
  
  /*---------------------------------------*/
  public Fraction divide(Fraction f) {
    return new Fraction ((this.getnum() * f.getden()), (this.getden()*f.getnum())).reduce();
  }
  
  /*---------------------------------------*/
  public Fraction add (Fraction f) {
    if (this.den == f.den){
      int newNum = this.num + f.num;
      return new Fraction (newNum, this.den).reduce();
    }
    else { 
      return new Fraction ((this.num *f.den) + (f.num *this.den), this.den *f.den).reduce();
    }
  }
  
  /*---------------------------------------*/
  public Fraction subtract (Fraction f) {
    if (this.den == f.den){
      return new Fraction (this.num - f.num, this.den).reduce();
    }
    else { 
      return new Fraction ((this.num *f.den) - (f.num *this.den), this.den *f.den).reduce();
    }
  }
  
  /*---------------------------------------*/
  public double valueOf(){
    Fraction temp = new Fraction (this.num, this.den).reduce();
    return (double)temp.num / temp.den;
  }
  
  /*---------------------------------------*/
  public boolean equals (Object o) {
    if (!(o instanceof Fraction))
      return false;
    else
    {
      Fraction temp1 = ((Fraction)o).reduce();
      Fraction temp2 = this.reduce();
      if(temp1.num == temp2.num && temp1.den == temp2.den){
        return true;
      }
      else
        return false;
    }
  }
}//END