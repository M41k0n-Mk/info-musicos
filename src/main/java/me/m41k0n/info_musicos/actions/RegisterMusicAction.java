package me.m41k0n.info_musicos.actions;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import me.m41k0n.info_musicos.entity.ArtistEntity;
import me.m41k0n.info_musicos.entity.MusicEntity;
import me.m41k0n.info_musicos.model.Music;
import me.m41k0n.info_musicos.repository.ArtistRepository;
import me.m41k0n.info_musicos.repository.MusicRepository;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class RegisterMusicAction implements MenuAction {
    private final ArtistRepository artistRepository;
    private final MusicRepository musicRepository;

    public RegisterMusicAction(ArtistRepository artistRepository, MusicRepository musicRepository) {
        this.artistRepository = artistRepository;
        this.musicRepository = musicRepository;
    }

    @Override
    public void execute() {
        System.out.println("Qual o nome da música?");
        Scanner read = new Scanner(System.in);
        String nameMusic = read.nextLine();
        System.out.println("Essa música faz parte de que álbum?");
        String albumName = read.nextLine();
        System.out.println("Essa música é de qual artista/banda?");
        String artist = read.nextLine();
        executeInternal(nameMusic, albumName, artist);
    }

    @Transactional
    protected void executeInternal(String nameMusic, String albumName, String artist) {
        Music music = new Music(nameMusic, albumName, artist);
        ArtistEntity artistResult = artistRepository.findByName(artist.toLowerCase())
                .orElseThrow(() -> new EntityNotFoundException("Artista não encontrado no banco de dados: " + artist
                        + " .Antes de cadastrar uma música, cadastre primeiro o artista na opção 1 do menu abaixo :) "));
        MusicEntity musicEntity = music.toEntity();
        musicEntity.setArtistEntity(artistResult);
        musicRepository.save(musicEntity);
    }
}