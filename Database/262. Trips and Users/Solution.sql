/* Write your PL/SQL query statement below */

select t.Request_at "Day", round(nvl(sum(cancel.cancelled), 0) / nvl(sum(compl.completed), 0), 2) "Cancellation Rate"
from Trips t
     left join 
            (
            select id, 1 completed
            from Trips t
                join Users c on t.Client_Id = c.Users_Id and c.role = 'client' and c.Banned = 'No'
                join Users d on t.Driver_Id = d.Users_Id and d.role = 'driver' and d.Banned = 'No'
            ) compl on t.id = compl.id
     left join (
            select id, 1 cancelled
            from Trips t
                join Users c on t.Client_Id = c.Users_Id and c.role = 'client' and c.Banned = 'No'
                join Users d on t.Driver_Id = d.Users_Id and d.role = 'driver' and d.Banned = 'No'
                where t.Status != 'completed'
            ) cancel on t.id = cancel.id
where to_date(t.Request_at, 'yyyy-mm-dd') between to_date('2013-10-01', 'yyyy-mm-dd') 
                                          and to_date('2013-10-03', 'yyyy-mm-dd')
group by t.Request_at
order by t.Request_at