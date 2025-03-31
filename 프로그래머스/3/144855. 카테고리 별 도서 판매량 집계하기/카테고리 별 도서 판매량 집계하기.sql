-- 코드를 입력하세요
SELECT b.category as CATEGORY, sum(sales) as TOTAL_SALES 
from book b
join book_sales s 
on b.book_id = s.book_id
where date_format(s.sales_date, '%Y-%m') = '2022-01'
group by 1 order by 1 asc;