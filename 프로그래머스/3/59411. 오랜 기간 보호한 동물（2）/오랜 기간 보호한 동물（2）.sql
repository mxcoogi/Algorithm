-- 코드를 입력하세요
SELECT o.animal_id as ANIMAL_ID, o.name as NAME 
from animal_outs o
join animal_ins i
on o.animal_id = i.animal_id
where o.datetime is not null
order by DATEDIFF(i.datetime, o.datetime)
limit 2;