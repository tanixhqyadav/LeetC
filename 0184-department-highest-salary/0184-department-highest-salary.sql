select d.name as department, e.name as employee, e.salary as salary
from employee e
join department d 
    on d.id = e.departmentid
where e.salary = (
    select max(salary)
    from employee
    where departmentid = e.departmentid
);
