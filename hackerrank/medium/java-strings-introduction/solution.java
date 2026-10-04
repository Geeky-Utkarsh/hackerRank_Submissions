import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int n = A.length() + B.length();
        System.out.println(n);
        
        
        int diff  = A.compareTo(B); // compare 2 String lexicographically 
        // Super=Important to remember --> .compareTo(); method does not necessarily return  +1.-1 and 0 , [compareTo() = negative / zero / positive, not necessarily -1 / 0 / +1.] 
        
        
        if( diff > 0)  //  String A > String B
             System.out.println("Yes");
        else 
          System.out.println("No");
        
        String naya = Character.toUpperCase(A.charAt(0))+A.substring(1 , A.length()) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1, B.length());
        // TakeAway from this question was ==> Strings in Java are immutable , So everyTime if you want to do something over a string , you have to create a new string unlikely cpp
        
        // Also 
         // Character is a built-in wrapper class for the primitive char. 
         // Character provides utility methods for working with individual characters.
         
        
        System.out.println(naya);
        
           
    }
}



