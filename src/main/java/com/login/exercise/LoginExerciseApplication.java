package com.login.exercise;

import com.login.exercise.model.User;
import com.login.exercise.model.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoginExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginExerciseApplication.class, args);
	}

}
