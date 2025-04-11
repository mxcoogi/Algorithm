-- 코드를 입력하세요
SELECT price - price % 10000 as PRICE_GROUP ,count(*) from product
group by price - price % 10000
order by 1;