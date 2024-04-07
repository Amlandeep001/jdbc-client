package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class JdbcClientExampleApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(JdbcClientExampleApplication.class, args);
	}
}
