/* Write your PL/SQL query statement below */
select t.Request_at "Day", round(sum(decode(t.status, 'completed', 0, 1)) / count(*), 2) "Cancellation Rate"
from Trips t
where t.Client_Id in (select Users_Id from Users where role = 'client' and Banned = 'No')
  and t.Driver_Id in (select Users_Id from Users where role = 'driver' and Banned = 'No')
  and to_date(t.Request_at, 'yyyy-mm-dd') between to_date('2013-10-01', 'yyyy-mm-dd') 
                                              and to_date('2013-10-03', 'yyyy-mm-dd')
group by t.Request_at
order by t.Request_at