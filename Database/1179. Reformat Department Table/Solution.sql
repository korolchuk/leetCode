/* Write your PL/SQL query statement below */
select  distinct dep.id, 
        jan.revenue Jan_Revenue, 
        feb.revenue Feb_Revenue,
        mar.revenue Mar_Revenue,
        apr.revenue Apr_Revenue,
        may.revenue May_Revenue,
        jun.revenue Jun_Revenue,
        jul.revenue Jul_Revenue,
        aug.revenue Aug_Revenue,
        sep.revenue Sep_Revenue,
        oct.revenue Oct_Revenue,
        nov.revenue Nov_Revenue,
        dec.revenue Dec_Revenue
from    Department dep
        left join Department jan on dep.id = jan.id and jan.month = 'Jan'
        left join Department feb on dep.id = feb.id and feb.month = 'Feb'
        left join Department mar on dep.id = mar.id and mar.month = 'Mar'
        left join Department apr on dep.id = apr.id and apr.month = 'Apr'
        left join Department may on dep.id = may.id and may.month = 'May'
        left join Department jun on dep.id = jun.id and jun.month = 'Jun'
        left join Department jul on dep.id = jul.id and jul.month = 'Jul'
        left join Department aug on dep.id = aug.id and aug.month = 'Aug'
        left join Department sep on dep.id = sep.id and sep.month = 'Sep'
        left join Department oct on dep.id = oct.id and oct.month = 'Oct'
        left join Department nov on dep.id = nov.id and nov.month = 'Nov'
        left join Department dec on dep.id = dec.id and dec.month = 'Dec'
order by dep.id;
