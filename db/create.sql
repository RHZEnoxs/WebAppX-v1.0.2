-- init DB SYSTEM_USER_INFO
DROP TABLE IF EXISTS SYSTEM_USER_INFO;
CREATE TABLE SYSTEM_USER_INFO(
ID INT PRIMARY KEY AUTO_INCREMENT,      #id
ACCOUNT VARCHAR(50) UNIQUE,		#登錄名
PASSWORD VARCHAR(18),			#密碼
USER_NAME VARCHAR(18),			#用戶名
PHONE VARCHAR(18),			#電話
ADDRESS VARCHAR(255)			#地址
);

-- init DB BOOK_MSG
DROP TABLE IF EXISTS BOOK_MSG;
CREATE TABLE BOOK_MSG (
	ID INT (11) PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR (54),
	AUTHOR VARCHAR (54),
	PUBLICATION_DATE DATE ,
  PUBLICATION VARCHAR (150),
	PRICE DOUBLE ,
	IMAGE VARCHAR (54),
	REMARK VARCHAR (600)
);
