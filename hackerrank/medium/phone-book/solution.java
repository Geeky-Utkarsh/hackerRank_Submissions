//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        
        HashMap<String, Integer>f = new HashMap<>(); // 0. Creating the HashMap 
        
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            
            f.put(name, phone); // 1. Using .put() method of HashMap to insert K:V into the HashMap 
            
			in.nextLine();
		}
        
		while(in.hasNext()) // 2. Here , this .hasNext() methods applied over Scanner Class Object , checks
		{
			String s=in.nextLine();  
            
            // if( f.get(s) == null ){  // 3. if .get() method returns "null" then <=> it means either the value or the key does not exits 
            //   System.out.println("Not found");
            // }
            // else{
                // System.out.println(s + "="+f.get(s));
            // }
            // System.out.println( s + "=" + (f.get(s) == null ? "\nNot found" : f.get(s)));
            System.out.println( f.get(s) == null ? "Not found"  : s +"="+f.get(s) );
		}
	}
}



