# Write your MySQL query statement below
select s1.Score as score, 
    (select count(distinct s2.Score)
    from Scores s2
    where s2.Score >= s1.Score) as `rank`
from Scores s1
order by s1.Score desc;