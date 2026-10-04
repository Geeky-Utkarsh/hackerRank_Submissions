import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        try{
            
          Scanner sc = new Scanner(System.in);
          
          int x = sc.nextInt();
          int y = sc.nextInt();
          
          System.out.println(x/y);
            
        }catch(ArithmeticException | InputMismatchException e){  // We can catch multiple types of expcetions in 1 single catch() function 
         
            // Printing that object of the Expcetion class From catch() printing [Exception class name only];
            // But with e.getMessage() -> [It will print both Exception-class Name + message]; 
            // Pick-One-Of-Them; 
            
            if(e  instanceof InputMismatchException) // Using instance of operator to identify  the type of e in the block and run 2-cases accordingly.
               System.out.println(e.getClass().getName());
            else 
              System.out.println(e);
                                    
        }
        
    }
}
