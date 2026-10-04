import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Read some unknown n lines of input from stdin until you reach EOF
        Scanner sc = new Scanner(System.in);
        // String n = sc.nextLine();
        
        
        // System.out.println("1 Hello World");
        int idx = 1;
        
        
        while( sc.hasNext() ){ // here .hashNext() method in java , is used to open consistent persistent/continous input stream on the console.
        // 
        // This .hasNext() function is similar to getline(cin, source) function of CPP , both of these are used-inside-while-loop [to make the input-stream-persistent]  
             String curr = sc.nextLine();
             
             System.out.println(idx + " " + curr );
             
             idx++;
        }
        
    }
}
