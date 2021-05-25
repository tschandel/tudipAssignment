# tudipAssignment
**Assignment for Tudip - **<br />

Information -<br />
Spring Boot Version - 2.4.6<br />
Java - 1.8<br />
Database - In memory (with Liquibase)<br />
Port - 8000<br />

Database - <br />
CREATE TABLE IF NOT EXISTS `candidate` (<br />
    `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,<br />
    `name` VARCHAR(500) NOT NULL,<br />
    `phone_number` VARCHAR(500) NOT NULL,<br />
    `maild_id` VARCHAR(500) NOT NULL,<br />
    `address` VARCHAR(500) NOT NULL<br />
);<br />

Few records will also be created during application launch. These create and insert queries are written under resources/db/changelog/changelog-master.xml<br />

URI to open h2 database - http://localhost:8000/h2-console<br />
Driver class - org.h2.Driver<br />
JDBC URL - jdbc:h2:mem:testdb<br />
Username - sa<br />


API Details- <br />

API Name - /<br />
Method - GET <br />
Opens the landing page. Landing/Index page have form to search candidates. This page is developed in Thymeleaf using HTML, CSS and Bootstrap.<br />
<br />
API Name - candidate/all<br />
Method - POST<br />
I/P - {<br />
	"searchBy" : "Name",<br />
	"searchByValue" : "Rahul",<br />
	"sortBy" : "Address"<br />
	"page" : 1<br />
}<br />
O/P - [<br />
	{<br />
  "name" : "Rahul", <br />
  "phoneNumber" : "9340665685", <br />
  "mailId":"rahul@gmail.com", <br />
  "address":"Lucknow"}<br />
]<br />

Note - In landing page user can select search and sorting operations and if search and sorting operations aren't selected then user will recieve data in the same order it's present inside database.
