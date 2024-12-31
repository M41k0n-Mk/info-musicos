package me.m41k0n.info_musicos.model;

import me.m41k0n.info_musicos.entity.ArtistEntity;
import me.m41k0n.info_musicos.enums.FormationType;
import me.m41k0n.info_musicos.enums.RoleType;

public record Artist(String name, FormationType formation, RoleType role) {

    public ArtistEntity toEntity() {
        return new ArtistEntity(name, formation, role);
    }
}