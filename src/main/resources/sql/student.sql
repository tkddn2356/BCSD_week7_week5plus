create table student (
	student_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(15) NOT NULL,
	department_number int,
    department_id int,
    created_date timestamp default CURRENT_TIMESTAMP(),
	update_date TIMESTAMP default CURRENT_TIMESTAMP() ON
                    UPDATE CURRENT_TIMESTAMP()
);
