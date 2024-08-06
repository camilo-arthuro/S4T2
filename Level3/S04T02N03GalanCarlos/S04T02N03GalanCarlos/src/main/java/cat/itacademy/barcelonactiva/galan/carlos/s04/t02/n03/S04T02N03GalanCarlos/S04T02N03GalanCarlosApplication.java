package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class S04T02N03GalanCarlosApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N03GalanCarlosApplication.class, args);
	}

}
