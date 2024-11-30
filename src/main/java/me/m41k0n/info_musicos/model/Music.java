package me.m41k0n.info_musicos.model;

import jakarta.validation.constraints.NotNull;
import me.m41k0n.info_musicos.entity.MusicEntity;

public record Music(@NotNull(message = "O nome da música não pode ser nulo") String name,
                    @NotNull(message = "O nome do álbum não pode ser nulo") String album,
                    @NotNull(message = "O nome da banda não pode ser nulo") String band) {

    public MusicEntity toEntity(Music music) {
        return new MusicEntity(music);
    }
}