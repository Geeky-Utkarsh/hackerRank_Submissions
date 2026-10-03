# Java Arraylist

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Sometimes it's better to use dynamic size arrays. Java's  [Arraylist](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html) can provide you this feature. Try to solve this problem using Arraylist.<br>

You are given $n$ lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in $y^{th}$ position of $x^{th}$ line. <br>

Take your input from System.in.

**Input Format**<br>
The first line has an integer $n$. In each of the next $n$ lines there will be an integer $d$ denoting number of integers on that line and then there will be $d$ space-separated integers. In the next line there will be an integer $q$ denoting number of queries. Each query will consist of two integers $x$ and $y$.

**Constraints**<br>

* $1<=n<=20000$
* $0<=d<=50000$
* $1<=q<=1000$
* $1<=x<=n$

Each number will fit in signed integer.<br>
Total number of integers in $n$ lines will not cross $10^5$.<br>

**Output Format**<br>
In each line, output the number  located in $y^{th}$ position of $x^{th}$ line. If there is no such position, just print "ERROR!"



**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T12:53:45.305Z  

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
        
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> Lst = new ArrayList<>();  // 2-D ArrayList declaration  
        
        while( n-- > 0 ){  // n line integer 
        
              int d = sc.nextInt(); // d denoting , number of integers on the N-th line 
              
              ArrayList<Integer> L = new ArrayList<>(d);
              
              while( d-- > 0 ){
                  L.add( sc.nextInt() );
              }
              
             //  Lst.add(n , L );  // push the current n-th line into the 2D-Array list;
               Lst.add(L);
        }
        
        int q = sc.nextInt();
        
        while( q-- > 0 ){ // In the next line there will be an integer  denoting number of queries. 
           
                 
           int x = sc.nextInt();
           int y = sc.nextInt();          
           
           try{ 
            int e = Lst.get(x-1).get(y-1);
            
            System.out.println(e);
           }
           catch(IndexOutOfBoundsException e){
             System.out.println("ERROR!");
           }    
        }
        sc.close();
  }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-arraylist/problem)