# Classes With at Least 5 Students

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Courses`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| student     | varchar |
| class       | varchar |
+-------------+---------+
(student, class) is the primary key (combination of columns with unique values) for this table.
Each row of this table indicates the name of a student and the class in which they are enrolled.

```

 

Write a solution to find all the classes that have  **at least five students**.

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Courses table:
+---------+----------+
| student | class    |
+---------+----------+
| A       | Math     |
| B       | English  |
| C       | Math     |
| D       | Biology  |
| E       | Math     |
| F       | Computer |
| G       | Math     |
| H       | Math     |
| I       | Math     |
+---------+----------+
Output: 
+---------+
| class   |
+---------+
| Math    |
+---------+
Explanation: 
- Math has 6 students, so we include it.
- English has 1 student, so we do not include it.
- Biology has 1 student, so we do not include it.
- Computer has 1 student, so we do not include it.

```

## Solution

**Language:** SQL  
**Runtime:** 350 ms (beats 62.89%)  
**Memory:** 0B (beats 100.00%)  
**Submitted:** 2026-09-15T21:16:47.724Z  

```sql
# Write your MySQL query statement below

-- Solution -> 1 [GROUP BY + Aggregate Function]
-- SELECT class /* COUNT(class) */ FROM Courses WHERE COUNT(class)>5 GROUP BY class ORDER BY class DESC LIMIT 1; 




-- Solution--> 1 [GROUP BY + Aggregate Fn] based approach  
-- SELECT class FROM Courses GROUP BY class HAVING COUNT(class)>=5 ORDER BY COUNT(class); 


-- Solution--> 2 [cte based approach]
-- with cte_name AS (
--    SELECT class FROM Courses GROUP BY class HAVING COUNT(class)>=5 ORDER BY COUNT(class) 
-- )
-- SELECT class FROM cte_name;


-- Solution --> 3 [SubQuery Based Approach]
SELECT DISTINCT class FROM Courses WHERE class IN ( SELECT class FROM Courses GROUP BY class HAVING COUNT(class)>=5 ORDER BY COUNT(class) );


-- SELECT /distinct/ class FROM Courses WHERE class IN ( SELECT class FROM Courses GROUP BY class HAVING COUNT(class)>=5 ORDER BY COUNT(class) );
```

---

[View on LeetCode](https://leetcode.com/problems/classes-with-at-least-5-students/)