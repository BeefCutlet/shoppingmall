create table product (
	pno number(3) primary key,
	pname varchar2(100)
);

insert into product values(10, '블레이저');
insert into product values(20, '슬랙스');
insert into product values(30, '로퍼');
commit;

create table basket (
    basketNo number(3) primary key,
    productNo number(3),
    amount number(3) not null,
    foreign key(productNo) references product.pno
);

create sequence basket_seq;

insert into basket values(basket_seq.nextval, 10, 2);
insert into basket values(basket_seq.nextval, 20, 3);
insert into basket values(basket_seq.nextval, 30, 4);
commit;