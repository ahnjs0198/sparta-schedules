-- schedule 테이블
CREATE TABLE schedules (
    id INT,
    todo STRING,
    name STRING,
    password STRING,
    updatedAt DATETIME
);

-- 전체 일정 조회 query
SELECT id, todo, name, updatedAt
FROM schedules;


