--liquibase formatted sql

-- changeset bootcamp:1
CREATE TABLE IF NOT EXISTS course (course_id INT, name VARCHAR(255), description VARCHAR(255));

-- changeset bootcamp:2
insert into course (course_id , name , description) values (1, "Bootcamp SRE", "Bootcamp to learn best practices of Reliability Engineering");
insert into course (course_id , name , description) values(2, 'Kubernetes On Hands', 'On hands K8S training');