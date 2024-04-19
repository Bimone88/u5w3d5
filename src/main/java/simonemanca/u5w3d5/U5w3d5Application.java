package simonemanca.u5w3d5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"simonemanca.u5w3d5.model"})
public class U5w3d5Application {

	public static void main(String[] args) {
		SpringApplication.run(U5w3d5Application.class, args);
	}

}
