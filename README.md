# gradlegroovydemo

This branch has code for
>* REST Api (CRUD Operation)
>* H2 connection
>* Global Exception Handler 
>* Integration test
>* Added support for Postgres
>* Added lombok
>* It has CarRepository with calling a stored procedure. Function calling is not working yet. Will update it later.

To load the initial data make the below entry in application.properties \
ddl-auto=none - this will not create the table based on the @Entity anotation \
spring.sql.init.mode=always - will make spring to look for schema.sql and data.sql

```
spring.jpa.hibernate.ddl-auto=none 
spring.sql.init.mode=always
```

After the 1st load, make the below changes\
ddl-auto=update - Will update the existing tables\
commenting the spring.sql.init.mode will remove spring not to load initial data based on schema.sql and data.sql
```
spring.jpa.hibernate.ddl-auto=update 
#spring.sql.init.mode=always
```

This was my reference.\
<https://github.com/GabrielBB/spring-data-jpa-procedure-tests/blob/master/src/main/resources/postgres.sql>