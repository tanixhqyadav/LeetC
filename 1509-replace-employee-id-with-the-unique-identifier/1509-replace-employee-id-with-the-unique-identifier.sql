# Write your MySQL query statement below
select eu.unique_id,em.name from employees em left join employeeuni eu on eu.id=em.id;