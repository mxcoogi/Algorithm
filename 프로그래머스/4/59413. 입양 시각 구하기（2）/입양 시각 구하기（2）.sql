-- 0~23까지 숫자 생성 (파생 테이블)
WITH RECURSIVE hours AS (
    SELECT 0 AS hour
    UNION ALL
    SELECT hour + 1 FROM hours WHERE hour < 23
)
SELECT 
    h.hour AS HOUR,
    COUNT(DATETIME) AS COUNT
FROM 
    hours h
LEFT JOIN ANIMAL_OUTS ao ON HOUR(ao.DATETIME) = h.hour
GROUP BY 
    h.hour
ORDER BY 
    h.hour;
