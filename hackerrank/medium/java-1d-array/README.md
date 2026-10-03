# Java Arraylist

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Let's play a game on an array! You're standing at index $0$ of an $n$-element array named $game$. From some index $i$ (where $0 \le i \lt n$), you can perform one of the following moves:

* *Move Backward:* If cell $i - 1$ exists *and* contains a $0$, you can walk back to cell $i - 1$.
* *Move Forward:* 
	- If cell $i + 1$ contains a zero, you can walk to cell $i + 1$.
    - If cell $i + leap$ contains a zero, you can jump to cell $i + leap$.
    - If you're standing in cell $n - 1$ or the value of $i + leap \ge n$, you can walk or jump off the end of the array and win the game.

In other words, you can move from index $i$ to index $i+1$, $i-1$, or $i + leap$ as long as the destination index is a cell containing a $0$. If the destination index is greater than $n-1$, you win the game.

**Function Description**   

Complete the *canWin* function in the editor below.   

*canWin* has the following parameters:   

- *int leap:* the size of the leap   
- *int game[n]:* the array to traverse   

**Returns**   

- *boolean:* true if the game can be won, otherwise false   

**Input Format**

The first line contains an integer, $q$, denoting the number of queries (i.e., function calls). 	
The $2 \cdot q$ subsequent lines describe each query over two lines:

1. The first line contains two space-separated integers describing the respective values of $n$ and $leap$.
2. The second line contains $n$ space-separated binary integers (i.e., zeroes and ones) describing the respective values of $game_0, game_1, \ldots, game_{n-1}$.

**Constraints**

* $1 \le q \le 5000$
* $2 \le n \le 100$
* $0 \le leap \le 100$
* It is guaranteed that the value of $game[0]$ is always $0$.

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T12:53:49.020Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/java-1d-array/problem)