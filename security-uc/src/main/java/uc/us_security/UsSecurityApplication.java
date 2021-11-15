package uc.us_security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UsSecurityApplication {
	static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();


	public static void main(String[] args) {
		System.out.println(bCryptPasswordEncoder.encode("reyna").toString());
		
		SpringApplication.run(UsSecurityApplication.class, args);
	}
	
	
	
	

}
