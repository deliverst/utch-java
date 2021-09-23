package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

}



//Servlets: es la aplicacion que corre del lado del servidor y que atiende las petision de una manera global por parte de springboo


//COMMANDOS
//mvn spring-boot:run
// crear carpeta app dentro de /Users/deliverst/gitProyects/javaDemo/src/main/java/com/example/demo/"app"

/*
java
jdk
git
github
indelij
postgres
maven
insomnia
postman
sptringboot
*/