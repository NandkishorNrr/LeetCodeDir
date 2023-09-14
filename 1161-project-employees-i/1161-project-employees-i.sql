# Write your MySQL query statement below
SELECT project_id, ROUND(avg(experience_years), 2) AS average_years
FROM project p
JOIN employee e
WHERE p.employee_id = e.employee_id
GROUP BY project_id;
