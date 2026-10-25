import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int sz = sc.nextInt(); // 0. Taking input for [the initial number of elements in L];
        sc.nextLine(); 
        ArrayList<Integer> L=  new ArrayList<>(sz);
        
        while( sz-- > 0){ // N space-separated integers describing L.
            int N = sc.nextInt();
            L.add(N);
        }
        int Q = sc.nextInt(); // Contains Q(the number of queries).
        
        while( Q-- > 0){
            sc.nextLine(); // consume "\n" from buffer left by nextInt() earlier as it reads token only.
             
            String QL = sc.nextLine(); // 1st line of query contains the String Insert
            
            if (QL.equals("Insert")){ // if 1st String contains "Insert"
            
               int x, y; // 2nd line contains 2 space separated integers x, y
               x = sc.nextInt();
               y = sc.nextInt();
               
               // the value of u must be inserted into L at index x.
               L.add(x,y); 
            }
            else {
                int x = sc.nextInt(); // here x = index , where the value must be deleted from ArrayList L
                L.remove(x);
            }   
        }
        for(int e : L){
            System.out.print(e+" ");
        }
        
        
    }
}
