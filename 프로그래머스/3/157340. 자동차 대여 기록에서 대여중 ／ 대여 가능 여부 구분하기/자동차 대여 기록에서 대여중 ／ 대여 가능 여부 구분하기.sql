-- 코드를 입력하세요
SELECT distinct car_id, 
    if( car_id in (
        select car_id 
        from car_rental_company_rental_history
        where start_date <= '2022-10-16' 
        and '2022-10-16' <= end_date
    ), "대여중", "대여 가능") as AVAILABILITY
from car_rental_company_rental_history
order by car_id desc;
