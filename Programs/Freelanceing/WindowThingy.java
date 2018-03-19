public static  double quadraticEquationRoot1(int a, int b, int c) (){

  {

if(Math.sqrt(Math.pow(b, 2) - 4*a*c) == 0)
{
    return -b/(2*a);
} else {
    int root1, root2;
    root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    return Math.max(root1, root2);  
}

}