package com.example.springboot_jfrog_ci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJfrogCiCdApplication {

	@GetMapping("/health")
	public String health() {
		return "Spring Boot CI/CD with JFrog Artifactory ";
	}

	@GetMapping("/test")
	public String test() {
		return "Spring Boot CI/CD with JFrog Artifactorygit  Test";
	}

//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Abhinav7784/springboot-jfrog-ci-cd.git
//	git push -u origin main


	public static void main(String[] args) {
		SpringApplication.run(SpringbootJfrogCiCdApplication.class, args);
	}

}
