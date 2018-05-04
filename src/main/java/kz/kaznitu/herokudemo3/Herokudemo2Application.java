package kz.kaznitu.lessons;

import kz.kaznitu.herokudemo3.models.Server;
import kz.kaznitu.herokudemo3.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Herokudemo2Application implements CommandLineRunner {

	@Autowired
	ServerRepository serverRepository;

	public static void main(String[] args) {
		SpringApplication.run(Herokudemo2Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{
		/**/
	}
}
