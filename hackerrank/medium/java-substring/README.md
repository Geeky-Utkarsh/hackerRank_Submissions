# Java Strings Introduction

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string, $s$, and two indices, $start$ and $end$, print a [substring](https://en.wikipedia.org/wiki/Substring) consisting of all characters in the inclusive range from $start$ to $end-1$. You'll find the *String* class' [substring method](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-) helpful in completing this challenge. 

**Input Format**

The first line contains a single string denoting $s$.		
The second line contains two space-separated integers denoting the respective values of $start$ and $end$.

**Constraints**

* $1 \le |s| \le 100$
* $0 \le start \lt end \le n$
- String $s$ consists of English alphabetic letters (i.e., $[a-zA-Z]$) only.

**Output Format**

Print the substring in the inclusive range from $start$ to $end-1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T04:43:12.754Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int n = A.length() + B.length();
        System.out.println(n);
        
        
        int diff  = A.compareTo(B); // compare 2 String lexicographically 
        // Super=Important to remember --> .compareTo(); method does not necessarily return  +1.-1 and 0 , [compareTo() = negative / zero / positive, not necessarily -1 / 0 / +1.] 
        
        
        if( diff > 0)  //  String A > String B
             System.out.println("Yes");
        else 
          System.out.println("No");
        
        String naya = Character.toUpperCase(A.charAt(0))+A.substring(1 , A.length()) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1, B.length());
        // TakeAway from this question was ==> Strings in Java are immutable , So everyTime if you want to do something over a string , you have to create a new string unlikely cpp
        
        // Also 
         // Character is a built-in wrapper class for the primitive char. 
         // Character provides utility methods for working with individual characters.
         
        
        System.out.println(naya);
        
           
    }
}




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-substring/problem)