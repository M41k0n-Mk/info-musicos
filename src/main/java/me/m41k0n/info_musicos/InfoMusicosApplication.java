package me.m41k0n.info_musicos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InfoMusicosApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(InfoMusicosApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Principal principal = new Principal();
        principal.showMenu();
    }
}
