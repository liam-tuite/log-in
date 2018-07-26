CREATE TABLE usernames(
	username VARCHAR(12),
    pw CHAR(12),
    client_id INT,
    PRIMARY KEY(username, pw)
)