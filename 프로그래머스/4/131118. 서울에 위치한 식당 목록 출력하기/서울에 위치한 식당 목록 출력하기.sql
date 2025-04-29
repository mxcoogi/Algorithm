-- 코드를 입력하세요
SELECT i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, round(avg(r.review_score), 2) as score from rest_info i
join rest_review r on r.rest_id = i.rest_id
where i.address LIKE "서울%"
group by r.rest_id
order by 6 desc, 4  desc