FROM tomcat:latest

COPY out/artifacts/TicketForU_war/TicketForU_war.war  /usr/local/tomcat/webapps/.

EXPOSE 8080/tcp

