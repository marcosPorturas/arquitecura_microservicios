package pe.edu.galaxy.training.msinfraestructuraserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsInfraestructuraServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsInfraestructuraServerConfigApplication.class, args);
	}

}
