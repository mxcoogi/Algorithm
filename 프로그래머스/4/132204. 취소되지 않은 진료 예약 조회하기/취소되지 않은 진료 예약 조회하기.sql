-- 코드를 입력하세요
SELECT a.apnt_no, p.pt_name, p.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd   from appointment a
join patient p on a.pt_no=p.pt_no
join doctor d on a.mddr_id=d.dr_id
where date_format(a.apnt_ymd, '%Y-%m-%d') = '2022-04-13' and a.APNT_CNCL_YN = 'N'
order by a.apnt_ymd ;
-- 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 orderby 진료예약일시