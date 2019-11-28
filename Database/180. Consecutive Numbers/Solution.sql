select  distinct(num)  ConsecutiveNums
from    (select num, id - row_number() over (partition by num order by id) as tmp
        from Logs)
group by tmp, num
having count(num) >= 3;