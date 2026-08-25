# Revising Aggregations - Averages

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Query the average population of all cities in **CITY** where *District* is **California**. 




**Input Format**

The **CITY** table is described as follows:
<img src="https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg" title="CITY.jpg" />

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T18:45:11.515Z  

```sql



select avg(population) from city where district='california';

/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/revising-aggregations-the-average-function/problem)