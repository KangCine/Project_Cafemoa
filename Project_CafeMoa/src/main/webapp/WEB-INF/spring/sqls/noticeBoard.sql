DROP SEQUENCE NOTICEBOARDSEQ;
DROP TABLE NOTICEBOARD;

CREATE SEQUENCE NOTICEBOARDSEQ;

CREATE TABLE NOTICEBOARD(
	NOTICE_BOARD_SEQ NUMBER PRIMARY KEY,
	NOTICE_BOARD_MEMBER_ID VARCHAR2(1000) NOT NULL,
	NOTICE_BOARD_TITLE VARCHAR2(2000) NOT NULL,
	NOTICE_BOARD_CONTENT VARCHAR2(4000) NOT NULL,
	NOTICE_BOARD_REGDATE DATE NOT NULL
);

INSERT INTO NOTICEBOARD
VALUES(NOTICEBOARDSEQ.NEXTVAL, '관리자', '카페모아 테스트', '화이팅', SYSDATE);

SELECT NOTICE_BOARD_SEQ, NOTICE_BOARD_MEMBER_ID, NOTICE_BOARD_TITLE, NOTICE_BOARD_CONTENT, NOTICE_BOARD_REGDATE
FROM NOTICEBOARD
ORDER BY NOTICE_BOARD_SEQ DESC;