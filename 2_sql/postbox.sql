/* ȸ�� */
DROP TABLE member 
	CASCADE CONSTRAINTS;

/* ���� */
DROP TABLE reservation 
	CASCADE CONSTRAINTS;

/* �����»�� */
DROP TABLE sender 
	CASCADE CONSTRAINTS;

/* �޴»�� */
DROP TABLE receiver 
	CASCADE CONSTRAINTS;

/* ȸ�� */
CREATE TABLE member (
	id VARCHAR2(50) NOT NULL, /* ���̵� */
	pwd VARCHAR2(50) NOT NULL, /* ��й�ȣ */
	name VARCHAR2(20) NOT NULL, /* �̸� */
	hp VARCHAR2(20) NOT NULL, /* ��ȭ��ȣ */
	email VARCHAR2(50) NOT NULL, /* �̸��� */
	zipcode VARCHAR2(5) NOT NULL, /* �����ȣ */
	address1 VARCHAR2(50) NOT NULL, /* �ּ� */
	address2 VARCHAR2(100), /* ���ּ� */
	regdate DATE DEFAULT sysdate /* ������ */
);

CREATE UNIQUE INDEX PK_member
	ON member (
		id ASC
	);

ALTER TABLE member
	ADD
		CONSTRAINT PK_member
		PRIMARY KEY (
			id
		);

/* ���� */
CREATE TABLE reservation (
	resNo NUMBER NOT NULL, /* �����ȣ */
	resAlias VARCHAR2(20) NOT NULL, /* ��ϸ�Ī */
	fare NUMBER, /* ���Ӻ� */
	resDate DATE DEFAULT sysdate, /* ������ */
	invoiceNo VARCHAR2(20), /* ������ȣ */
	id VARCHAR2(50) NOT NULL, /* ���̵� */
	weight NUMBER /* ���� */
);

CREATE UNIQUE INDEX PK_reservation
	ON reservation (
		resNo ASC
	);

ALTER TABLE reservation
	ADD
		CONSTRAINT PK_reservation
		PRIMARY KEY (
			resNo
		);

/* �����»�� */
CREATE TABLE sender (
	senderNo NUMBER NOT NULL, /* �Ϸù�ȣ */
	resNo NUMBER NOT NULL, /* �����ȣ */
	senderName VARCHAR2(20) NOT NULL, /* �̸� */
	senderHp VARCHAR2(20) NOT NULL, /* ��ȭ��ȣ */
	zipcode VARCHAR2(5) NOT NULL, /* �����ȣ */
	address1 VARCHAR2(50) NOT NULL, /* �ּ� */
	address2 VARCHAR2(100) /* ���ּ� */
);

CREATE UNIQUE INDEX PK_sender
	ON sender (
		senderNo ASC
	);

ALTER TABLE sender
	ADD
		CONSTRAINT PK_sender
		PRIMARY KEY (
			senderNo
		);

/* �޴»�� */
CREATE TABLE receiver (
	receiverNo NUMBER NOT NULL, /* �Ϸù�ȣ */
	resNo NUMBER NOT NULL, /* �����ȣ */
	receiverName VARCHAR2(20) NOT NULL, /* �̸� */
	receiverHp VARCHAR2(20) NOT NULL, /* ��ȭ��ȣ */
	zipcode VARCHAR2(5) NOT NULL, /* �����ȣ */
	address1 VARCHAR2(50) NOT NULL, /* �ּ� */
	address2 VARCHAR2(100), /* ���ּ� */
	requestMsg VARCHAR2(100), /* ��ۿ�û���� */
	payment VARCHAR2(10) NOT NULL /* ���ҹ�� */
);

CREATE UNIQUE INDEX PK_receiver
	ON receiver (
		receiverNo ASC
	);

ALTER TABLE receiver
	ADD
		CONSTRAINT PK_receiver
		PRIMARY KEY (
			receiverNo
		);

ALTER TABLE reservation
	ADD
		CONSTRAINT FK_member_TO_reservation
		FOREIGN KEY (
			id
		)
		REFERENCES member (
			id
		);

ALTER TABLE sender
	ADD
		CONSTRAINT FK_reservation_TO_sender
		FOREIGN KEY (
			resNo
		)
		REFERENCES reservation (
			resNo
		)on delete cascade;

ALTER TABLE receiver
	ADD
		CONSTRAINT FK_reservation_TO_receiver
		FOREIGN KEY (
			resNo
		)
		REFERENCES reservation (
			resNo
		)on delete cascade;
        
        
--������ ����, ����
drop sequence reservation_seq;
drop sequence sender_seq;
drop sequence receiver_seq;

create sequence reservation_seq
start with 1
increment by 1
nocache;

create sequence sender_seq
start with 1
increment by 1
nocache;

create sequence receiver_seq
start with 1
increment by 1
nocache;

commit;


--�����ȣ 
--CREATE TABLE zipcode (
--	zipcode VARCHAR2(5),  /*�����ȣ */
--	sido VARCHAR2(100), /* �õ� */
--	gugun VARCHAR2(100), /* ���� */
--	dong VARCHAR2(200), /* �� */
--	startbunji VARCHAR2(100), /* ���۹��� */
--	endbunji VARCHAR2(100), /* ������ */
--    seq number primary key /* �Ϸù�ȣ */
--);
--
--CREATE UNIQUE INDEX PK_zipcode
--	ON zipcode (
--		seq ASC
--	);
--
--ALTER TABLE zipcode
--	ADD
--		CONSTRAINT PK_zipcode
--		PRIMARY KEY (
--			seq
--		);
