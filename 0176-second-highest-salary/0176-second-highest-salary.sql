# Write your MySQL query statement below

select distinct max(salary) as SecondHighestSalary
from employee
where salary != (select max(salary) from employee);