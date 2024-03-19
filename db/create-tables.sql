begin transaction;

DROP TABLE IF EXISTS users;

CREATE TABLE users (
	user_id SERIAL,
	username VARCHAR(255),
	password VARCHAR(255),
	authorize VARCHAR(255),
	enabled BOOLEAN,
	CONSTRAINT pk_users PRIMARY KEY (user_id)
);
INSERT INTO users (username, password, authorize, enabled)
VALUES ('user', 'password', 'USER', true);

END transaction;

