/* Write your PL/SQL query statement below */
select 
    case
        when id = (select count(*) from seat) and mod(id, 2) = 1 then id
        when mod(id, 2) = 1 then id + 1
        when mod(id, 2) = 0 then id - 1
    end id,
    student
from seat
order by id;