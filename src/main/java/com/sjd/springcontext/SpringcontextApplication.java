package com.sjd.springcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@Configuration
@ComponentScan("com.sjd")
// @EnableAutoConfiguration
@SpringBootApplication
public class SpringcontextApplication
{

	public static void main (String[] args)
	{
		SpringApplication.run(SpringcontextApplication.class, args);
	}
}
