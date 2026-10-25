import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                // 0. Byte dataType has a limit of -128 to 127 
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                //Complete the code
                // 1. Short dataType has a limit of -32,768 to 32,767 
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                 System.out.println("* short");
                 // 2. Integer dataType has a limit of -2^31 to 2^31 -1 
                if( x>=Integer.MIN_VALUE && x <= Integer.MAX_VALUE )
                 System.out.println("* int");
                 // 3. Long dataType has a limit of -2^63 to 2^63 -1
                if( x >= Long.MIN_VALUE && x <= Long.MAX_VALUE ) 
                 System.out.println("* long");
                                
                
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



