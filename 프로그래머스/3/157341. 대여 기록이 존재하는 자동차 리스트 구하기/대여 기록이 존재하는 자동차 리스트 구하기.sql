-- 코드를 입력하세요
select car_id from CAR_RENTAL_COMPANY_CAR
where car_id in
(SELECT distinct(car_id) from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where date_format(start_date, '%m') = 10)
and car_type = '세단'
order by 1 desc;