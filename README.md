# TicketForU
Ticket Recommendation Website Based on JAVA (Course Project For Cloud Computing & Network)


# Technique Stack:
+ Database: MySQL
+ WebServer: Tomcat 9.0.27

# Features
+ User: Login/Logout/Register
+ Recommendation: user based / itembased
+ Remote RPC: TicketMaster API

# Contribute
+ Patrick Li 
+ Steven Qin

# Deploy:
* (if you want to deploy our model, your should install some essential software packages as following)

### Install mysql:
+ Step 1, In your instance's terminal, execute the following command:
++ *sudo apt-get install mysql-server* (if you are asked for new mysql password, use "root")
+ Step 2, after installation, execute the following command:
++ *mysql -u root -p*, then input the "root" as password.
+ Step 3, In the mysql shell, paste the following SQL statements to create the tables:
`DROP DATABASE IF EXISTS project;`
`CREATE DATABASE project;`
`CREATE TABLE items (item_id VARCHAR(255) NOT NULL, name VARCHAR(255), rating FLOAT, address VARCHAR(255), image_url VARCHAR(255), url VARCHAR(255), distance FLOAT, PRIMARY KEY ( item_id));`
`CREATE TABLE categories (item_id VARCHAR(255) NOT NULL, category VARCHAR(255) NOT NULL, PRIMARY KEY ( item_id, category), FOREIGN KEY (item_id) REFERENCES items(item_id));`
`CREATE TABLE users (user_id VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL, first_name VARCHAR(255), last_name VARCHAR(255), PRIMARY KEY ( user_id ));`
`CREATE TABLE history (user_id VARCHAR(255) NOT NULL, item_id VARCHAR(255) NOT NULL, last_favor_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP, PRIMARY KEY (user_id, item_id), FOREIGN KEY (item_id) REFERENCES items(item_id), FOREIGN KEY (user_id) REFERENCES users(user_id));`
+ Type "exit" to quit mysql shell

### Install Tomcat 9
+ Install java:
`$ sudo apt update`
+Install the OpenJDK package by running:
`sudo apt install default-jdk`
+Create Tomcat User:
`$ sudo useradd -r -m -U -d /opt/tomcat -s /bin/false tomcat`
+Install Tomcat:
`$ wget http://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.27/bin/apache-tomcat-9.0.27.tar.gz -P /tmp`
`$ sudo tar xf /tmp/apache-tomcat-9*.tar.gz -C /opt/tomcat`
`$ sudo ln -s /opt/tomcat/apache-tomcat-9.0.27 /opt/tomcat/latest`
`$ sudo chown -RH tomcat: /opt/tomcat/latest`
`$ sudo sh -c 'chmod +x /opt/tomcat/latest/bin/*.sh'`
+ Create a systemd Unit File:
`$ sudo nano /etc/systemd/system/tomcat.service`
`$ sudo systemctl daemon-reload`
`$ sudo systemctl start tomcat`
`$ sudo systemctl enable tomcat`

### Run war file in the instance:
+ Run following
`sudo cp ~/webtest_war.war /opt/tomcat/latest/webapps/`

### Run in your browser:
`YOUR_INSTANCE_IP:8080/webtest_war/`







