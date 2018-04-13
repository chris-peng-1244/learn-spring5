package me.chrispeng.joker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokerApplication.class, args);
	}
}
