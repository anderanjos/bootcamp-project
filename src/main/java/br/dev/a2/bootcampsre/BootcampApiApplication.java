package br.dev.a2.bootcampsre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication
public class BootcampApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApiApplication.class, args);
	}

}
