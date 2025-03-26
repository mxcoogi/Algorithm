SELECT MCDP_CD as 진료과코드, count(*) as 5월예약건수
FROM appointment
WHERE DATE(APNT_YMD) BETWEEN '2022-05-01' AND '2022-05-31'
group by 1 order by 2, 1;