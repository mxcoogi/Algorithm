-- 코드를 입력하세요
select book_id as BOOK_ID,substr(PUBLISHED_DATE, 1,10) as PUBLISHED_DATE from BOOK
where category="인문" and substr(PUBLISHED_DATE, 1,4) = '2021'
order by 2;