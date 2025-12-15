package com.packt.cardatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  org.slf4j.Logger; // for Login authentication
import  org.slf4j.LoggerFactory; // for  login authentication

@SpringBootApplication
public class CardatabaseApplication {

    // mkaing the Logger class object
    private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {

        //auto restart application
        SpringApplication.run(CardatabaseApplication.class, args);

        //logger.info() prints message to console
        logger.info("Application Started");
    }

}
