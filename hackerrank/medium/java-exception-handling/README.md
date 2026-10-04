# Java Exception Handling (Try-catch)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are required to compute the power of a number by implementing a calculator. Create a class *MyCalculator* which consists of a single method `long power(int, int)`. This method takes two integers, $n$ and $p$, as parameters and finds $n^p$. If either $n$ or $p$ is negative, then the method must throw an exception which says "$\texttt{n or p should not be negative}$". Also, if both $n$ and $p$ are zero, then the method must throw an exception which says "$\texttt{n and p should not be zero.}$"

For example, *-4* and *-5* would result in $\texttt{java.lang.Exception: n or p should not be negative}$.

Complete the function `power` in class *MyCalculator* and return the appropriate result after the power operation or an appropriate exception as detailed above. 

**Input Format**

Each line of the input contains two integers, $n$ and $p$. The locked stub code in the editor reads the input and sends the values to the method as parameters.

**Constraints**

- $-10 \le n \le 10$
- $-10 \le p \le 10$

**Output Format**

Each line of the output contains the result $n^p$, if both $n$ and $p$ are positive. If either $n$ or $p$ is negative, the output contains "n and p should be non-negative". If 
both $n$ and $p$ are zero, the output contains "n and p should not be zero.". This is printed by the locked stub code in the editor.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T06:09:13.395Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        try{
            
          Scanner sc = new Scanner(System.in);
          
          int x = sc.nextInt();
          int y = sc.nextInt();
          
          System.out.println(x/y);
            
        }catch(ArithmeticException | InputMismatchException e){  // We can catch multiple types of expcetions in 1 single catch() function 
         
            // Printing that object of the Expcetion class From catch() printing [Exception class name only];
            // But with e.getMessage() -> [It will print both Exception-class Name + message]; 
            // Pick-One-Of-Them; 
            
            if(e  instanceof InputMismatchException) // Using instance of operator to identify  the type of e in the block and run 2-cases accordingly.
               System.out.println(e.getClass().getName());
            else 
              System.out.println(e);
                                    
        }
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-exception-handling/problem)