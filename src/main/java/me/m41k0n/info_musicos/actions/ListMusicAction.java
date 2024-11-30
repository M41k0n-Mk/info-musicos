package me.m41k0n.info_musicos.actions;

import me.m41k0n.info_musicos.model.Music;
import me.m41k0n.info_musicos.repository.MusicRepository;

public class ListMusicAction implements MenuAction {
    private final MusicRepository musicRepository;

    public ListMusicAction(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public void execute() {
        musicRepository.findAll().stream().map(m -> new Music(m.getName(), m.getAlbum(), m.getBand()))
                .forEach(System.out::println);
    }
}