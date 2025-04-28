-- 코드를 입력하세요
SELECT year(o.sales_date), month(o.sales_date), u.gender, count(distinct u.user_id) as users
from user_info u join online_sale o on u.user_id = o.user_id
where u.gender is not null
group by 1,2,u.gender
order by 1, 2, 3;