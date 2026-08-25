# Revising Aggregations - The Count Function

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Query a *count* of the number of cities in **CITY** having a *Population* larger than $100,000$. 

**Input Format**

The **CITY** table is described as follows:
<img src="https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg" title="CITY.jpg" />

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T18:30:01.810Z  

```sql


/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

Select count(population) from city where population>100000;


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/revising-aggregations-the-count-function/problem)