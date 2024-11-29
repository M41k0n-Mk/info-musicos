package me.m41k0n.info_musicos.model;

import jakarta.validation.constraints.NotNull;
import me.m41k0n.info_musicos.enums.FormationType;
import me.m41k0n.info_musicos.enums.RoleType;

public record Artist(@NotNull(message = "O nome não pode ser nulo") String name,
                     @NotNull(message = "O tipo de formação do artista não pode ser nulo") FormationType formation,
                     @NotNull(message = "O papel do artista não pode ser nulo") RoleType role) {
}