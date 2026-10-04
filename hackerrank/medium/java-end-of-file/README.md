# Java End-of-file

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

> "In computing, *End Of File* (commonly abbreviated *EOF*) is a condition in a computer operating system where no more data can be read from a data source."
&mdash; <cite>([Wikipedia: End-of-file](https://en.wikipedia.org/wiki/End-of-file))</cite>
    
The challenge here is to read $n$ lines of input until you reach *EOF*, then number and print all $n$ lines of content.

**Hint:** Java's *Scanner.hasNext()* method is helpful for this problem.


**Input Format**

Read some unknown $n$ lines of input from *stdin(System.in)* until you reach *EOF*; each line of input contains a non-empty *String*.

**Constraints**

 

**Output Format**

For each line, print the line number, followed by a single space, and then the line content received as input.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T05:16:20.245Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Read some unknown n lines of input from stdin until you reach EOF
        Scanner sc = new Scanner(System.in);
        // String n = sc.nextLine();
        
        
        // System.out.println("1 Hello World");
        int idx = 1;
        
        
        while( sc.hasNext() ){ // here .hashNext() method in java , is used to open consistent persistent/continous input stream on the console.
        // 
        // This .hasNext() function is similar to getline(cin, source) function of CPP , both of these are used-inside-while-loop [to make the input-stream-persistent]  
             String curr = sc.nextLine();
             
             System.out.println(idx + " " + curr );
             
             idx++;
        }
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-end-of-file/problem)