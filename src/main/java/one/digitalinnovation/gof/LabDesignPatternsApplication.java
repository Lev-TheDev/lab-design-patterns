package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabDesignPatternsApplication {

	public static void main(String[] args) {
		// http://127.0.0.1:8080/swagger-ui/index.html
		SpringApplication.run(LabDesignPatternsApplication.class, args);
	}

}
