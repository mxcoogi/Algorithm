with cte as (SELECT count(*) as cnt From user_info
where year(joined) = '2021')

select year(sales_date), month(sales_date), count(distinct o.user_id), round(count(distinct o.user_id)/sub.cnt,1) from online_sale o
join user_info u on o.user_id = u.user_id
join (select cnt from cte) sub
where year(u.joined) = '2021'
group by year(sales_date), month(sales_date)
order by 1, 2