package me.m41k0n.info_musicos.model;

import me.m41k0n.info_musicos.entity.MusicEntity;

public record Music(String name, String album, String band) {

    public MusicEntity toEntity(Music music) {
        return new MusicEntity(music);
    }
}