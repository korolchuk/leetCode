select  w.Id
from    Weather w
where   w.Temperature > (select Temperature
                        from Weather
                        where RecordDate = w.RecordDate - 1)