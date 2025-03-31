-- 코드를 입력하세요
SELECT p.product_code as PRODUCT_CODE, sum(p.price * o.sales_amount) AS SALES 
from product p 
join offline_sale o 
on p.product_id = o.product_id
group by p.product_code
order by 2 desc, 1;