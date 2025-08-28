package ro.meets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoMeets {

	public static void main(String[] args) {
		System.out.println("Application is running");
		SpringApplication.run(RoMeets.class, args);
	}

}
