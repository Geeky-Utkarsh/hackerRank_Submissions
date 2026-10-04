import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        
        String sb = new StringBuilder(A).reverse().toString();
        
        if( sb.equals(A)  )   // Understand the working .equals() method , Default Object.equals() checks whether two references refer to the same object.
          System.out.print("Yes");
        else 
          System.out.println("No");
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



