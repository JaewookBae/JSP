-- java/java

create table member1(
	id varchar2(12),
	password varchar2(12),
	name varchar2(12),
	age number,
	address varchar2(50),
	email varchar2(30));
	
insert into member1 values('aaa', 'bbb', '홍길동', 22,'서울시', 'a@a.com');

select * from member1;