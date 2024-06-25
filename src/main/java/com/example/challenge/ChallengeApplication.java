package com.example.challenge;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChallengeApplication {

	private FilmRepository repository;


	public ChallengeApplication(FilmRepository filmRepository) {

		this.repository = filmRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			Film filmIndiana = new Film("Indiana Jones", "Harrison Ford", new Date(2017, 05, 19));
			Film deadPool = new Film("DeadPool", "Ryan Reynolds", new Date(2017, 05, 19));
			Film logan = new Film("Logan", "Hugh Jackman", new Date(2017, 05, 19));
			this.repository.save(filmIndiana);
			this.repository.save(deadPool);
			this.repository.save(logan);
		};
	}
}
