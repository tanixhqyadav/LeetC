-- # Write your MySQL query statement below
-- select vi.customer_id , count(t.transaction_id) as count_no_trans from transactions t right join visits vi on vi.visit_id=t.visit_id group by vi.customer_id 
-- having  count(t.transaction_id)=0;
SELECT customer_id, COUNT(*) AS count_no_trans
FROM (
    SELECT vi.visit_id, vi.customer_id
    FROM visits vi
    LEFT JOIN transactions t 
        ON vi.visit_id = t.visit_id
    GROUP BY vi.visit_id, vi.customer_id
    HAVING COUNT(t.transaction_id) = 0
) AS no_trans
GROUP BY customer_id;
