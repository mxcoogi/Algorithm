-- 코드를 입력하세요
with cte as 
(SELECT h.history_id,  c.daily_fee, c.car_type, datediff(h.end_date, h.start_date) +1 as duration , case 
when datediff(h.end_date, h.start_date) +1 >= 90 then '90일 이상'
when datediff(h.end_date, h.start_date) +1 >= 30 then '30일 이상'
when datediff(h.end_date, h.start_date) +1 >= 7 then '7일 이상'
else '7일 미만' end as duration_type
from CAR_RENTAL_COMPANY_RENTAL_HISTORY h
join CAR_RENTAL_COMPANY_CAR c on c.car_id = h.car_id
where c.car_type = '트럭')

select cte.history_id,  round((1-ifnull(p.discount_rate, 0) / 100) * cte.daily_fee * cte.duration) as fee from cte
left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p on cte.duration_type = p.duration_type and cte.car_type = p.car_type
order by 2 desc, 1 desc;