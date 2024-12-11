package me.m41k0n.info_musicos.actions;

import jakarta.persistence.EntityNotFoundException;
import me.m41k0n.info_musicos.model.Music;
import me.m41k0n.info_musicos.repository.MusicRepository;

import java.util.List;
import java.util.Scanner;

public class SearchMusicByArtistAction implements MenuAction {
    private final MusicRepository musicRepository;

    public SearchMusicByArtistAction(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public void execute() {
        System.out.println("Qual o nome do artista que você quer buscar as músicas?");
        Scanner read = new Scanner(System.in);
        String nameArtist = read.nextLine();
        List<Music> musicList = musicRepository.findMusicByArtist(nameArtist.toLowerCase()).stream()
                .map(m -> new Music(m.getName(), m.getAlbum(), m.getBand()))
                .toList();
        if (musicList.isEmpty()) {
            throw new EntityNotFoundException("Não foram encontradas músicas para esse artista registradas no banco de dados");
        } else {
            musicList.forEach(System.out::println);
        }
    }
}