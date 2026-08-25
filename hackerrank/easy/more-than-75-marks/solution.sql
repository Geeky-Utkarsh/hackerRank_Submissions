

/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

-- select marks,name from STUDENTS where marks>75 AND Right(name,3), ordered by id asc;   

-- select marks,name from STUDENTS where marks>75 AND RIGHT(name, 3) = 'son' order by id asc;  

SELECT Name
FROM STUDENTS
WHERE Marks > 75
ORDER BY RIGHT(Name, 3), ID ASC; 

