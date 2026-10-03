import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> Lst = new ArrayList<>();  // 2-D ArrayList declaration  
        
        while( n-- > 0 ){  // n line integer 
        
              int d = sc.nextInt(); // d denoting , number of integers on the N-th line 
              
              ArrayList<Integer> L = new ArrayList<>(d);
              
              while( d-- > 0 ){
                  L.add( sc.nextInt() );
              }
              
             //  Lst.add(n , L );  // push the current n-th line into the 2D-Array list;
               Lst.add(L);
        }
        
        int q = sc.nextInt();
        
        while( q-- > 0 ){ // In the next line there will be an integer  denoting number of queries. 
           
                 
           int x = sc.nextInt();
           int y = sc.nextInt();          
           
           try{ 
            int e = Lst.get(x-1).get(y-1);
            
            System.out.println(e);
           }
           catch(IndexOutOfBoundsException e){
             System.out.println("ERROR!");
           }    
        }
        sc.close();
  }
}
