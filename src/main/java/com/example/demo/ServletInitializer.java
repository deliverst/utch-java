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


//controlador | es una capa de nuestra aplicacion que se va a encargar de recibir las peticionees del cliente de un web browser, que utulizando un metodo post,get, put, delet el controlador canaliza a las diferencetes funciones

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


POJO: Plain Old Java Object

es una especificacion de java en como se debe de manejar la base de datos desde java <artifactId>spring-boot-starter-data-jpa</artifactId> jpa: Java Persistence API, nos ayuda a manera la base de datos desde codigo y nos sirve de intermediario


➜  javaDemo git:(dev) ✗ psql postgres
psql (13.4)
Type "help" for help.


➜  javaDemo git:(dev) ✗ brew services start postgresql
postgres=# create database tid71d;
CREATE DATABASE
postgres=#

Change de password postgress
ALTER USER deliverst PASSWORD 'Root.1234';







*/


