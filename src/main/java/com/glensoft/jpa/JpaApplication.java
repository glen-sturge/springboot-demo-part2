package com.glensoft.jpa;

import com.glensoft.jpa.models.Video;
import com.glensoft.jpa.repositories.AuthorRepository;
import com.glensoft.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository
	) {
		return args -> {
			var video = Video.builder()
					.name("test_vid_01")
					.length(24)
					.build();
			videoRepository.save(video);

//			var author = Author.builder()
//					.firstName("Glen")
//					.lastName("Sturge")
//					.email("glensturge@mail.com")
//					.age(41)
//					.build();
//			repository.save(author);
		};
	}
}
