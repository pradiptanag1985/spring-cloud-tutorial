The config git location should have the properties file with the same name as 
of the client service.

http://localhost:9000/room-services/default - URL to see the exposed config

@EnableConfigServer - Annotation to mark this as config server

application.properties -
spring.cloud.config.server.git.uri - Refers to the GIT location of the config server