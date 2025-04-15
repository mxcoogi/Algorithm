select FOOD_TYPE, REST_ID, REST_NAME, FAVORITES from rest_info
where (FOOD_TYPE, FAVORITES) in
(select food_type, max(favorites) from rest_info
group by food_type)
order by 1 desc;