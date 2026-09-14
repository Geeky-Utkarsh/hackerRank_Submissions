
SELECT city.name FROM city
 INNER JOIN country ON city.CountryCode=country.Code WHERE country.continent='Africa';
