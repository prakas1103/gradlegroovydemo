# sql procedure

```
create or replace procedure GET_TOTAL_CARS_BY_MODEL(
IN model_in VARCHAR(50),OUT count_out int
)
as
$$
begin
select count(*) from car
into count_out where model = model_in;
end;
$$
language plpgsql;
```

```
CREATE or replace PROCEDURE FIND_CARS_AFTER_YEAR(IN year_in INT)
LANGUAGE SQL
BEGIN ATOMIC
    SELECT * FROM car WHERE year >= year_in ORDER BY year;
END
```

