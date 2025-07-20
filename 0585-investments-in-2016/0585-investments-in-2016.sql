# Write your MySQL query statement below

select round(sum( i1.tiv_2016),2) as tiv_2016
from Insurance i1
where exists(
    select 1
    from insurance i2
    where i1.tiv_2015=i2.tiv_2015 
    and i1.pid <> i2.pid
)

and not exists(
    select 1
    from insurance i3
    where i1.lat = i3.lat and i1.lon = i3.lon and i1.pid != i3.pid
);