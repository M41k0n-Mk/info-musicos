package me.m41k0n.info_musicos;

import me.m41k0n.info_musicos.repository.ArtistRepository;
import me.m41k0n.info_musicos.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InfoMusicosApplication implements CommandLineRunner {
    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    private MusicRepository musicRepository;

    public static void main(String[] args) {
        SpringApplication.run(InfoMusicosApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Principal principal = new Principal(artistRepository, musicRepository);
        try {
            principal.showMenu();
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }
}