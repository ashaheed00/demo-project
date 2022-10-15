SELECT * FROM world.city;

SELECT MAX(Population) from world.city;
SELECT MIN(Population) from world.city;
SELECT MAX(Population) AS MAX_POPULATION from world.city;  -- aliasing
SELECT MAX(Population) MAX_POPULATION from world.city;
SELECT MAX(c.Population) from world.city AS c WHERE c.ID > 100;
SELECT MAX(c.Population) from world.city c WHERE c.ID > 100;

SELECT AVG(Population) AS AVG_POPULATION from world.city;
SELECT SUM(Population) AS TOTAL_POPULATION from world.city;

SELECT * FROM world.city WHERE CountryCode IN ('AFG', 'IND');

SELECT * FROM world.city WHERE Name LIKE 'A%';

SELECT * FROM world.city WHERE Name LIKE 'al-%t';


