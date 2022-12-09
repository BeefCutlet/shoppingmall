create table basket (
    id number(3) primary key,
    name varchar2(200) not null,
    amount number(3) not null,
    upload date default sysdate
);

insert into basket(id, name, amount) values(10, '데님', 1);
insert into basket(id, name, amount) values(20, '블레이저', 2);
insert into basket(id, name, amount) values(30, '슬랙스', 2);
commit;