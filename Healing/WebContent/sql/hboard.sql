drop table hboard;

create table hboard(
b_no          number    primary key,
b_nick        varchar2(30), 
b_contents    varchar2(300), 
b_img         varchar2(100), 
b_hash        varchar2(100), 
b_date        date, 
b_key         number    check(b_key in (1,2))
);

drop sequence hboard_seq;
create sequence hboard_seq
       start with 1
       increment by 1
       nocycle
       nocache;
       
       
 select * from hboard;      
       
       
       
       
select * from hboard;
delete from hboard;


select b_img,b_contents,b_no from hboard where b_hash like '%test%';

select * from hboard where b_nick='test' and b_no=1;



