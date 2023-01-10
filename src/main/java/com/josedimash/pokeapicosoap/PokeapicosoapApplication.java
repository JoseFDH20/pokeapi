package com.josedimash.pokeapicosoap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PokeapicosoapApplication {
	private static final Logger LOGGER = LogManager.getLogger(PokeapicosoapApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PokeapicosoapApplication.class, args);
    }

}
