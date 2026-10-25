# Java List

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
**Submitted:** 2026-10-25T12:30:28.878Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/java-stack/problem)