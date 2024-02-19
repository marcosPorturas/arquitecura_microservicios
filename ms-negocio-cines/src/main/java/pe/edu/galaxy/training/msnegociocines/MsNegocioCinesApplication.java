package pe.edu.galaxy.training.msnegociocines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsNegocioCinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNegocioCinesApplication.class, args);
	}

}
