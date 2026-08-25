# Draw The Triangle 1

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_P(R)_ represents a pattern drawn by Julia in _R_ rows. The following pattern represents _P(5)_:


    * * * * * 
    * * * * 
    * * * 
    * * 
    *

Write a query to print the pattern _P(20)_.


**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T18:27:19.180Z  

```sql


/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/


 
DECLARE @Counter INT =20;
-- @Counter=5

WHILE(@Counter!=0)
BEGIN
    PRINT REPLICATE('* ',@Counter);
    SET @Counter=@Counter-1;
  
END




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/draw-the-triangle-1/problem)