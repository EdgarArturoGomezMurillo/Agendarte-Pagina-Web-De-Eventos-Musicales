package edu.grupo05.agendarte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.grupo05.agendarte.repository.*;
import edu.grupo05.agendarte.entity.*;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AgendarteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendarteApplication.class, args);
	}



}
