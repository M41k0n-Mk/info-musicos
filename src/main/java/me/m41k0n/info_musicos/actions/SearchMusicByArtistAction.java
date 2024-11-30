package me.m41k0n.info_musicos.actions;

import me.m41k0n.info_musicos.model.Music;
import me.m41k0n.info_musicos.repository.MusicRepository;

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
        musicRepository.findMusicByArtist(nameArtist).stream()
                .map(m -> new Music(m.getName(), m.getAlbum(), m.getBand()))
                .forEach(System.out::println);
    }
}