select 	tmp.Name Department, e.Name Employee, e.Salary
from    Employee e
        join (select  d.Id, d.Name,  max(e.Salary) maxSalary
        from    Employee e
                join Department d on e.DepartmentId = d.Id
        group by d.Id, d.Name) tmp on e.DepartmentId = tmp.Id and e.Salary = tmp.maxSalary