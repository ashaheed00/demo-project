SELECT c.Name FROM world.city c 
INNER JOIN world.country ct ON c.CountryCode = ct.Code;

-- RIGHT JOIN
-- LEFT JOIN
-- FULL OUTER JOIN


SELECT Name, 
CASE
WHEN Population > 10000 THEN 'OVER Populated'
WHEN Population > 1000 THEN 'Moderate Populated'
WHEN Population < 100 THEN 'Under Populated'
ELSE 'Normal Population'
END AS Population_Density, CountryCode
FROM world.city;

