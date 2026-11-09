import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
         // 1. Creating a BigInteger class object named "BD" passing String n in the constructor of this class.
        BigInteger BI = new BigInteger(n);
        
        // 2. Passing the 10 as the certainity parameter in the method isProbablePrime();
        if(BI.isProbablePrime(100))
         System.out.println("prime");    
        else 
         System.out.println("not prime");    
        
        bufferedReader.close();
    }
}
