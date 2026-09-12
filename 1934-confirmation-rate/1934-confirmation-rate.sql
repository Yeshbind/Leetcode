# Write your MySQL query statement below
SELECT s1.user_id , 
COALESCE(
    ROUND( 
        COUNT(
            CASE
                WHEN c1.action = 'confirmed' THEN 1
            END 
        ) / COUNT(c1.action)  
    ,2)
,0) AS confirmation_rate
FROM Signups as s1 
LEFT JOIN Confirmations as c1 
ON s1.user_id = c1.user_id
GROUP BY s1.user_id