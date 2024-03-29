# gradlegroovydemo

This branch has code for
>* REST Api (CRUD Operation)
>* H2 connection
>* Global Exception Handler 
>* Integration test
>* Jpa Joins


For JPA Joins for creating data, use this syntax
>insert into department(name,description) values \
> ('IT','IT')\
> ('Manufacturing','Manufacturing')\
> ('Construction','Construction');
>
>insert into employee_jpa(address,email,name,dept_id) values
> ('Chennai','prakash@gmail.com','Prakash',1);\
> ('Bangalore','pk@gmail.com','PK',2);\
> ('Coimbatore','dk@gmail.com','DK',3);

Use this to check the join script
>SELECT employee_jpa.id, employee_jpa.name, employee_jpa.email,department.name FROM EMPLOYEE_JPA inner join Department On employee_jpa.dept_id = department.id;

For Customer and OrderEntity, Refer
> <https://github.com/anna-knudsen/jpa-spring-simple-example-join/blob/main/readme.md>