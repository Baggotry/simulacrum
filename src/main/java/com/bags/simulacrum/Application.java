package com.bags.simulacrum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static Engine simulationEngine;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        simulationEngine = new Engine();
        simulationEngine.simulate();
    }
}
