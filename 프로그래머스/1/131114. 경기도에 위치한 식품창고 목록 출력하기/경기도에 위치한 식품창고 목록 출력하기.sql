-- 코드를 입력하세요
SELECT WAREHOUSE_ID,WAREHOUSE_NAME, ADDRESS,
ifNULL(FREEZER_YN, 'N') FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE substr(ADDRESS, 1, 3) = '경기도'
ORDER BY 1;