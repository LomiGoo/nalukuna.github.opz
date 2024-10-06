create table if not exists form (
Reg_ID int primary key auto_increment,
Fname varchar(20),
Lname varchar(20),
Age int default 16,
Grade int,
Strand varchar(15),
Email varchar(40),
Reg_Date date,
constraint Gurids check (Grade <= 12)
);



insert into form (
Fname,
Lname,
Grade,
Strand,
Email,
Reg_Date
)
value 
("Chevelle", "Nacionales", 11, "ICT prog", NULL, "2024-10-02"),
("Kc", "Mulano", 11, "Humms", NULL, "2024-10-05"),
("Christine", "Cariño", 11, "Abm", NULL, "2024-10-03"),
("Edviel", "Argarin", 11, "ICT prog", "flatgyatt@gmail.com", "2024-10-010"),
("Simon", "Reyes", 11, "ICT prog", NULL, "2024-10-05"),
("Micha", "Monastrial", 11, "Abm", "mechanics@gmail.com", "2024-10-07"),
("Denniel", "Manalo", 11, "ICT prog", "gyattlvl3@gmail.com", current_date()),
("Cjhay", "Bibit", NULL, NULL, NULL, current_date()),
("Vance", NULL, 10, NULL, NULL, current_date()),
("Steph", "Lucero", 12, "ICT prog", NULL, current_date()),
("Sean Grabriel", "Francisco", 11, "ICT css", NULL, current_date()),
("Jenna", "San Ramon", 11, "ICT prog", "pres@gmail.com", current_date());

select * from form;