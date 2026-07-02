package com.example.demo;

import java.io.Writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("springcore.xml");
		Writer writer = (Writer) context.getBean("writer");
		//writer.write(null);
		//erroe conmpilication 
	}

}
