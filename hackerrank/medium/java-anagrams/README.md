# Java String Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Two strings, $a$ and $b$, are called anagrams if they contain all the same characters in the same frequencies.  For this challenge, the test is not case-sensitive. For example, the anagrams of `CAT` are `CAT`, `ACT`, `tac`, `TCA`, `aTC`, and `CtA`.

**Function Description**    

Complete the *isAnagram* function in the editor.   

*isAnagram* has the following parameters:  

- *string a:* the first string   
- *string b:* the second string   

**Returns**   

- *boolean:* If $a$ and $b$ are case-insensitive anagrams, return true.  Otherwise, return false.   

**Input Format**

The first line contains a string $a$.		
The second line contains a string $b$.

**Constraints**

- $1 \le length(a), length(b) \le 50$
- Strings $a$ and $b$ consist of English alphabetic characters.
- The comparison should NOT be case sensitive. 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T06:50:34.211Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        
        String sb = new StringBuilder(A).reverse().toString();
        
        if( sb.equals(A)  )        // Understand the working .equals() method , Default Object.equals() checks whether two references refer to the same object.
          System.out.print("Yes"); // But the String class overrides the .equals() method to compare the content , not the reference of the object.
        else 
          System.out.println("No");
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-anagrams/problem)