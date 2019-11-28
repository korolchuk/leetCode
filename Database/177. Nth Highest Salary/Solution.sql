CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    select distinct(Salary) into result
    from (select Salary, dense_rank() over (ORDER BY salary desc) as num
          from Employee)
    where num = N;
    
    RETURN result;
END;