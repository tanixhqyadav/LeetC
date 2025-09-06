# Write your MySQL query statement below
select   
    if (
        (select distinct salary from employee Order by salary Desc limit 1 offset 1)is not null,
        (select distinct salary from employee Order by salary Desc limit 1 offset 1),
        null) 
    as SecondHighestSalary;
