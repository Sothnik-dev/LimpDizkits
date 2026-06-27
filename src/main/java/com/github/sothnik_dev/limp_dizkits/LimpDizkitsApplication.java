package com.github.sothnik_dev.limp_dizkits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LimpDizkitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimpDizkitsApplication.class, args);
	}

}
