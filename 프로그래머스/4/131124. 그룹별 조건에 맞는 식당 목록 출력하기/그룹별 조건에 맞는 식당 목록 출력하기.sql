-- 코드를 입력하세요
select m.member_name, r.review_text, date_format(r.review_date, '%Y-%m-%d') from rest_review r
join member_profile m on r.member_id = m.member_id
where r.member_id in (
select member_id 
from (SELECT member_id, count(*), rank() over(order by count(*) desc) rank_cnt 
 from rest_review 
group by member_id) as sub
where rank_cnt = 1)
order by 3, 2
