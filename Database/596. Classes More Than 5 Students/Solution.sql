/* Write your PL/SQL query statement below */
select class
from (select distinct *
      from courses)
having count(student) >= 5
group by class;