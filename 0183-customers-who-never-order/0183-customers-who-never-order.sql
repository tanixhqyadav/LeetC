# Write your MySQL query statement below
select nm.name as 
                    Customers from  customers nm 
                left Join 
                    Orders od On nm.id=od.customerId 
                where 
                    od.customerId is null;