-- 코드를 입력하세요
select c.car_id, c.car_type,  round(c.daily_fee * 30 * (1-p.discount_rate / 100)) as fee from CAR_RENTAL_COMPANY_CAR c
join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p on c.car_type = p.car_type
where c.car_id not in 
(select distinct car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where date_format(start_date, '%Y-%m-%d') <= '2022-11-30'
and date_format(end_date, '%Y-%m-%d') >= '2022-11-1')
and c.car_type in ('세단', 'SUV')
and p.duration_type like '30일%'
and round(c.daily_fee * 30 * (1-p.discount_rate / 100)) >= 500000
and round(c.daily_fee * 30 * (1-p.discount_rate / 100)) < 2000000