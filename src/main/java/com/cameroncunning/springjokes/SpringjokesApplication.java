package com.cameroncunning.springjokes;

import com.cameroncunning.springjokes.Services.ChuckJokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringjokesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringjokesApplication.class, args);

		System.out.println(ctx.getBean(ChuckJokeService.class).getJoke());


	}
}
