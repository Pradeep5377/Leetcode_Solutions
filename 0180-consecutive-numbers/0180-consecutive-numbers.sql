# Write your MySQL query statement below
 select distinct l1.num as ConsecutiveNums
 
 from Logs l1
 join logs l2 on l1.id=l2.id-1
 join logs l3 on l1.id = l3.id-2
 where l1.Num=l2.Num and l2.Num=l3.Num;