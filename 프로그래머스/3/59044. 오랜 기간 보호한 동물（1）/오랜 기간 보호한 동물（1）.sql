-- 코드를 입력하세요
SELECT i.name, i.datetime from animal_ins i
left join animal_outs o
on o.animal_id = i.animal_id
where o.animal_id is null
order by 2 limit 3;