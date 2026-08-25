# Japan Population

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Query the sum of the populations for all Japanese cities in **CITY**. The *COUNTRYCODE* for Japan is **JPN**.


**Input Format**

The **CITY** table is described as follows:
<img src="https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg" title="CITY.jpg" />

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T18:29:01.068Z  

```sql


/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

Select sum(population) from city where countrycode='jpn';


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/japan-population/problem)