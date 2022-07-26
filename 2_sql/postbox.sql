/* 회원 */
DROP TABLE member 
	CASCADE CONSTRAINTS;

/* 예약 */
DROP TABLE reservation 
	CASCADE CONSTRAINTS;

/* 보내는사람 */
DROP TABLE sender 
	CASCADE CONSTRAINTS;

/* 받는사람 */
DROP TABLE receiver 
	CASCADE CONSTRAINTS;

/* 회원 */
CREATE TABLE member (
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	pwd VARCHAR2(50) NOT NULL, /* 비밀번호 */
	name VARCHAR2(20) NOT NULL, /* 이름 */
	hp VARCHAR2(20) NOT NULL, /* 전화번호 */
	email VARCHAR2(50) NOT NULL, /* 이메일 */
	zipcode VARCHAR2(5) NOT NULL, /* 우편번호 */
	address1 VARCHAR2(50) NOT NULL, /* 주소 */
	address2 VARCHAR2(100), /* 상세주소 */
	regdate DATE DEFAULT sysdate /* 가입일 */
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

/* 예약 */
CREATE TABLE reservation (
	resNo NUMBER NOT NULL, /* 예약번호 */
	resAlias VARCHAR2(20) NOT NULL, /* 등록명칭 */
	fare NUMBER, /* 운임비 */
	resDate DATE DEFAULT sysdate, /* 예약일 */
	invoiceNo VARCHAR2(20), /* 운송장번호 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	weight NUMBER /* 무게 */
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

/* 보내는사람 */
CREATE TABLE sender (
	senderNo NUMBER NOT NULL, /* 일련번호 */
	resNo NUMBER NOT NULL, /* 예약번호 */
	senderName VARCHAR2(20) NOT NULL, /* 이름 */
	senderHp VARCHAR2(20) NOT NULL, /* 전화번호 */
	zipcode VARCHAR2(5) NOT NULL, /* 우편번호 */
	address1 VARCHAR2(50) NOT NULL, /* 주소 */
	address2 VARCHAR2(100) /* 상세주소 */
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

/* 받는사람 */
CREATE TABLE receiver (
	receiverNo NUMBER NOT NULL, /* 일련번호 */
	resNo NUMBER NOT NULL, /* 예약번호 */
	receiverName VARCHAR2(20) NOT NULL, /* 이름 */
	receiverHp VARCHAR2(20) NOT NULL, /* 전화번호 */
	zipcode VARCHAR2(5) NOT NULL, /* 우편번호 */
	address1 VARCHAR2(50) NOT NULL, /* 주소 */
	address2 VARCHAR2(100), /* 상세주소 */
	requestMsg VARCHAR2(100), /* 배송요청사항 */
	payment VARCHAR2(10) NOT NULL /* 지불방법 */
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
        
        
--시퀀스 삭제, 생성
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


--우편번호 
--CREATE TABLE zipcode (
--	zipcode VARCHAR2(5),  /*우편번호 */
--	sido VARCHAR2(100), /* 시도 */
--	gugun VARCHAR2(100), /* 구군 */
--	dong VARCHAR2(200), /* 동 */
--	startbunji VARCHAR2(100), /* 시작번지 */
--	endbunji VARCHAR2(100), /* 끝번지 */
--    seq number primary key /* 일련번호 */
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
