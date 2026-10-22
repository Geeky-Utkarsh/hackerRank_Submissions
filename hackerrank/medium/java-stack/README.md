# Java Map

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)


A string containing only parentheses is balanced if the following is true:
1. if it is an empty string
2. if A and B are correct, AB is correct,
3. if A is correct, (A) and {A} and [A] are also correct.


Examples of some correctly balanced strings are: "{}()",  "[{()}]",  "({()})" <br>

Examples of some unbalanced strings are: "{}(",  "({)}",  "[[",  "}{" etc.<br>

 
Given a string, determine if it is balanced or not. 




**Input Format**

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

**Output Format**

For each case, print 'true' if the string is balanced, 'false' otherwise.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T02:24:58.751Z  

```java
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




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-stack/problem)