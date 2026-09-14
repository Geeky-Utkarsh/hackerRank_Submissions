SELECT country.continent, FLOOR(AVG(city.population)) FROM city
 INNER JOIN country ON city.CountryCode=country.Code 
 GROUP BY country.Continent;
