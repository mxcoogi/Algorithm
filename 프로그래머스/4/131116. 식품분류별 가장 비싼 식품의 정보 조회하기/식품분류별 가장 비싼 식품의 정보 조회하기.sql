-- 코드를 입력하세요
select b.category, b.price, b.product_name from food_product b
where (category, price) in
(SELECT category, max(price) from food_product
group by category
having max(price))
and b.category in ('과자', '국', '김치', '식용유')
order by 2 desc;
