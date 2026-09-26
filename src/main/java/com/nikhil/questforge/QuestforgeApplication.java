package com.nikhil.questforge;

import domain.GameCharacter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestforgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestforgeApplication.class, args);

        GameCharacter hero = new GameCharacter();
        System.out.println("QuestForge booting... (Level 0 skeleton - Spring Boot)");
    }

}
