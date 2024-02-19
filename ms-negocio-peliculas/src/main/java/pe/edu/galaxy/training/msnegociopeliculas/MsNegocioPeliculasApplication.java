package pe.edu.galaxy.training.msnegociopeliculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsNegocioPeliculasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNegocioPeliculasApplication.class, args);
	}

}
