/*English-Pig Latin
 * 6/24/2016 */
import java.util.*;
import java.util.regex.*;

public class EngPig {
  public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    ArrayList <String> inputArray = new ArrayList();
    Pattern pat = Pattern.compile ("\\w+");
    Matcher mat;
    
    System.out.println("English to Pig Latin (Type 1), Pig Latin to English (Type 2).");
    while (!scan.hasNextInt()) {
      System.err.println("Not a number!");
      System.out.println("English to Pig Latin (Type 1), Pig Latin to English (Type 2).");
      scan.next();
    }
    
    int num = scan.nextInt();
    while (num >=3 || num <=0){
      while (num >= 3) {
        System.err.println ("Typed greater than 2");
        System.out.println("English to Pig Latin (Type 1), Pig Latin to English (Type 2).");
        while (!scan.hasNextInt()) {
          System.err.println("Not a number!");
          System.out.println("English to Pig Latin (Type 1), Pig Latin to English (Type 2).");
          scan.next();
        }
        num = scan.nextInt();
      }
      
      while (num <= 0) {
        System.err.println ("Typed less than 0");
        System.out.println("English to Pig Latin (Type 1), Pig Latin to English (Type 2).");
        while (!scan.hasNextInt()) {
          System.err.println("Not a number!");
          System.out.println("English to Pig Latin (Type 1), Pig Latin to English (Type 2).");
          scan.next();
        }
        num = scan.nextInt();
      }
    }
    
    
    String input;
    if (num == 1){
      String garbage = scan.nextLine();
      System.out.println("English to Pig Latin\n");
      System.out.println("Please enter your sentence.");
      while(scan.hasNextInt()){
        System.err.println("Not a sentence!");
        System.out.println("Please enter your sentence");
        scan.nextLine();
      }
      input = scan.nextLine();
      input = input.toLowerCase();
      mat = pat.matcher(input);
      while (mat.find()) {
        inputArray.add(mat.group());
      }
      
      for (int i = 0; i < inputArray.size(); i++) {
        String output = inputArray.get(i);
        
        if ((output.charAt(0)=='a'|| output.charAt(0)=='e' || output.charAt(0)== 'i' || output.charAt(0)== 'o')) {
          output = output + "yay";
          System.out.print(output + " ");
        }
        
        else if (output.startsWith("ch") || output.startsWith("th") || output.startsWith("qu")) {
          String firstTwo = output.substring(0,2);
          output = output.substring(2);
          output = output + firstTwo + "ay";
          System.out.print(output + " ");
        }
        else {
          char first = output.charAt(0);
          output = output.substring(1);
          output = output+first+"ay";
          System.out.print(output + " ");
        }
      }
    }
    
    if (num == 2) {
      //System.out.println("Typed 2");
      String garbage = scan.nextLine();
      System.out.println("Pig Latin to English\n");
      System.out.println("Please enter your sentence.");
      while(scan.hasNextInt()){
        System.err.println("Not a sentence!");
        System.out.println("Please enter your sentence");
        scan.nextLine();
      }
      input = scan.nextLine();
      input = input.toLowerCase();
      mat = pat.matcher(input);
      while (mat.find()) {
        inputArray.add(mat.group());
      }
      for (int i = 0; i < inputArray.size(); i++) {
        String output = inputArray.get(i);
        
        if (output.endsWith("yay")) {
          String last = output.substring(output.length()-3,output.length());
          output = output.replace(last,"");
          System.out.print(output + " ");
          last = output.substring(output.length()-3,output.length());
          
        }
        
        else if (output.endsWith("ay")) {
          String last = output.substring(output.length()-2,output.length());
          output = output.replace(last,"");
          String firstLast = output.substring(output.length()-1);
          output = "" + firstLast + output;
          output= output.substring(0, output.length()-1);
          System.out.print(output + " ");
        }
      }
    }
    
  } //END
} //END