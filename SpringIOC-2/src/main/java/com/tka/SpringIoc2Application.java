package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com" , "notify"})  // to scan all the packages under com 
public class SpringIoc2Application {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext run = SpringApplication.run(SpringIoc2Application.class, args);
		
		// alt + shift + l ;
		
		System.err.println("app started");
		
		String[] beanNames = run.getBeanDefinitionNames();
		
		for (String bname : beanNames) {
			
			if (bname.contains("product") || bname.contains("user")) {
				System.out.println(bname);
			}
		}
	}

}
