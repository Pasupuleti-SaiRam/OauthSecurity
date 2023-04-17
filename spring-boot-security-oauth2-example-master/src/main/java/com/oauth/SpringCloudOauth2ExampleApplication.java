package com.oauth;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso

public class SpringCloudOauth2ExampleApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2ExampleApplication.class, args);
	}

}
