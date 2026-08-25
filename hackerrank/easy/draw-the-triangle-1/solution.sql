

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



