SELECT date_format(sales_date, '%Y-%m-%d') as sales_date, product_id, user_id, sum(sales_amount) as sales_amount from online_sale 
where date_format(sales_date, '%Y-%m') = '2022-03'
group by date_format(sales_date, '%Y-%m-%d'), product_id, user_id
union all
SELECT date_format(sales_date, '%Y-%m-%d') as sales_date, product_id, NULL as user_id, sum(sales_amount) as sales_amount from offline_sale 
where date_format(sales_date, '%Y-%m') = '2022-03'
group by date_format(sales_date, '%Y-%m-%d'), product_id

order by 1, 2, 3
