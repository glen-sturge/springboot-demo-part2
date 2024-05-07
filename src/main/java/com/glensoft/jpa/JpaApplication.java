package com.glensoft.jpa;

import com.glensoft.jpa.models.Author;
import com.glensoft.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	) {
		return args -> {
			var author = Author.builder()
					.firstName("Glen")
					.lastName("Sturge")
					.email("glensturge@mail.com")
					.age(41)
					.build();
			repository.save(author);
		};
	}
}
