SELECT SUM(city.population) FROM city
 INNER JOIN country ON city.CountryCode=country.Code 
 GROUP BY country.Continent HAVING continent='Asia';
