package com.consulting.mgt.springboot.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.consulting.mgt.springboot.employee.repository.EmployeeRepository;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AppEmployeeApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppEmployeeApplication.class, args);
    }
    
    EmployeeRepository employeeRepository;
    
    public AppEmployeeApplication(EmployeeRepository employeeRepository) {
    	this.employeeRepository = employeeRepository;
    }
    
    @Bean
    public CommandLineRunner startup() {
    	return (args) ->{
    		
    	};
    }
    
}
