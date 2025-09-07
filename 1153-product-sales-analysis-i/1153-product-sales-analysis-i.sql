# Write your MySQL query statement below
select pr.product_name, sl.year ,sl.price from sales sl left join product pr 
on sl.product_id=pr.product_id;