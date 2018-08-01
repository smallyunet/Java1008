CREATE TABLE `student` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NULL,
	`gender` VARCHAR(50) NULL,
	`class` VARCHAR(50) NULL,
	`teacher` VARCHAR(50) NULL,
	PRIMARY KEY (`id`)
);

INSERT INTO student(name, gender, class, teacher) VALUES("张三","男","java101","王五");
INSERT INTO student(name, gender, class, teacher) VALUES("张三","女","java102","王五");
INSERT INTO student(name, gender, class, teacher) VALUES("张三","男","java103","王五");
INSERT INTO student(name, gender, class, teacher) VALUES("张四","男","java104","王五");
INSERT INTO student(name, gender, class, teacher) VALUES("张三","男","java105","王五");
INSERT INTO student(name, gender, class, teacher) VALUES("张六","男","java107","王五");
INSERT INTO student(name, gender, class, teacher) VALUES("张三","男","java108","王五");
INSERT INTO student(name, gender, class, teacher) VALUES("张三","女","java109","王七");
INSERT INTO student(name, gender, class, teacher) VALUES("张三","男","java110","王五");