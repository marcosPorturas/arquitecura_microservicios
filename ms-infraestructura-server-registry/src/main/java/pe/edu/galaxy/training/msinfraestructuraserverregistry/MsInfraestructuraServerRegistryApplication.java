package pe.edu.galaxy.training.msinfraestructuraserverregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsInfraestructuraServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsInfraestructuraServerRegistryApplication.class, args);
	}

}
