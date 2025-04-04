# Write your MySQL query statement below
select p.product_id, round(ifnull(sum(price * units) / sum(units), 0), 2) as average_price
from Prices p
left join UnitsSold u on p.product_id = u.product_id
and purchase_date between start_date and end_date
group by 1