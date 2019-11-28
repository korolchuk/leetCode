select  case
            when min(Salary) = max(Salary) then null
            else min(Salary)
         end SecondHighestSalary
from    (select Salary
        from Employee
        order by Salary desc)
where rownum <= 2;