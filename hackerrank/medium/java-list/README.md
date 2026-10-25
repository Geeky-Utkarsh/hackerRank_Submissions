# Java List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

For this problem, we have $2$ types of queries you can perform on a [List](https://docs.oracle.com/javase/7/docs/api/java/util/List.html):

1. Insert $y$ at index $x$:<br>
	<pre>Insert
    x y</pre>
    
2. Delete the element at index $x$:<br>
	<pre>Delete
    x</pre>

Given a list, $L$, of $N$ integers, perform $Q$ queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers. 

 

**Input Format**

The first line contains an integer, $N$ (the initial number of elements in $L$).	
The second line contains $N$ space-separated integers describing $L$.	
The third line contains an integer, $Q$ (the number of queries).	
The $2Q$ subsequent lines describe the queries, and each query is described over two lines:	

* If the first line of a query contains the String **Insert**, then the second line contains two space separated integers $x \ y$, and the value $y$ must be inserted into $L$ at index $x$. 	
* If the first line of a query contains the String **Delete**, then the second line contains index $x$, whose element must be deleted from $L$.           
         
**Constraints**  

- $ 1 \le N \le 4000 $<br>
- $ 1 \le Q \le 4000 $<br>
- Each element in  is a *32-bit integer*.

         

**Output Format**

Print the updated list $L$ as a single line of space-separated integers.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T12:30:13.436Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-list/problem)