insert into user_details(id,birth_date,name)
values(10001, current_date(), 'Ranga');

insert into user_details(id,birth_date,name)
values(10002, current_date(), 'Ravi');

insert into user_details(id,birth_date,name)
values(10003, current_date(), 'Sathish');

insert into post(id,description,user_id)
values(20001,'AWS',10001);
insert into post(id,description,user_id)
values(20002,'devops',10001);
insert into post(id,description,user_id)
values(20003,'AZURE',10002);
insert into post(id,description,user_id)
values(20004,'CLOUD',10002);