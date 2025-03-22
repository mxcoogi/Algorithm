-- 코드를 입력하세요
SELECT animal_id, name, case sex_upon_intake
when substr(sex_upon_intake, 1, 1) = 'I' then 'O'
else 'X' end
from animal_ins