create table if not exists stu_rec (
SID int primary key auto_increment,
GenAv int,
Reg_ID int,
foreign key(Reg_ID) references form(Reg_ID)
);

alter table stu_rec
auto_increment = 100;

insert into stu_rec (
GenAv,
Reg_ID
)
Value 
(90, 1);

select * from stu_rec;