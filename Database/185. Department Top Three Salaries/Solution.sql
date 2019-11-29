select  d.Name Department, tmp.Name Employee, tmp.Salary
from    Department d
        join    (
                select  e.Name, 
                        e.DepartmentId, 
                        e.Salary, 
                        dense_rank() over (partition by e.DepartmentId order by e.Salary desc) as rank
                from    Employee e
                ) tmp on d.Id = tmp.DepartmentId
where 	tmp.rank <= 3;