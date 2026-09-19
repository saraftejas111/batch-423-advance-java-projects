package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com" , "xyz" , "pqr"})
public class SpringIoc834835Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringIoc834835Application.class, args);
		System.err.println("app started..");
		
		for (String beanNames : container.getBeanDefinitionNames()) {
			
			if(beanNames.startsWith("employee")) System.out.println("beans --> "+beanNames);
		}

		// IOC : inversion of control
		// k jisme hum spring ko object creation or injection or deletion ka control dete hain

	    // @RestController : 
		
		// @Service : business logic
		
		// @Repository
		
// @Component , @ComponentScan , @Autowired , @Configuration , @Bean , @Qualifier , @Primary		
		
		
	
	}

}
