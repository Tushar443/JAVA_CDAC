use practice;
create view t1_view as
select * from t1;

create view t_view as
select num from t2;

select * from t2;


select * from t2;

insert into t_view values(100);



create OR REPLACE view t2_view as 
select * from t2 WHERE num  =1 WITH check option;


update t2_view set num = 1000 where num=100;



show create view t2_view;


create view addAll as
select * from t1_view;
select * from t_view;
select * from t2_view;




select * from addAll;

show databases;


