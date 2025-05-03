-- 코드를 입력하세요
select cart_id from cart_products
where name = 'Yogurt' and cart_id in
(SELECT cart_id from cart_products
where name = 'Milk')
order by cart_id