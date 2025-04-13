-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, '%Y-%m-%d') from member_profile
where gender = 'W' and tlno is not null
and date_format(DATE_OF_BIRTH, '%c') = '3'
order by 1;