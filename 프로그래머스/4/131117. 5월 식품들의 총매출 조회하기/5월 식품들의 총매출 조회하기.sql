-- 코드를 입력하세요
SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.price * sum(o.amount) as TOTAL_SALES 
from food_product p 
join food_order o on p.product_id = o.product_id
where date_format(o.produce_date, '%Y-%m') = '2022-05'
group by p.product_id
order by 3 desc , 1 asc;