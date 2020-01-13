/* Write your PL/SQL query statement below */
select  id,
        to_char(visit_date, 'yyyy-mm-dd') visit_date,
        people
from (
        select id,
                visit_date,
                people,
                MAX(num_in_group) KEEP (DENSE_RANK LAST ORDER BY num_in_group) OVER (PARTITION BY id_tmp) AS high_in_group
        from (
                select  id,
                        visit_date,
                        people,
                        id_tmp,
                        ROW_NUMBER() OVER (PARTITION BY id_tmp ORDER BY id)  num_in_group
                from (
                        select  id,  
                                 visit_date,
                                 people,
                                 id - ROW_NUMBER() OVER (ORDER BY id) id_tmp
                        from stadium
                        where people >= 100)))
where high_in_group >= 3