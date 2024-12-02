package me.m41k0n.info_musicos.enums;

import lombok.Getter;

@Getter
public enum FormationType {
    SOLO("solo"),
    DUO("dupla"),
    TRIO("trio"),
    BAND("banda");

    private final String type;

    FormationType(String type) {
        this.type = type;
    }

    public static FormationType fromString(String typeFormation) {
        for (FormationType type : FormationType.values()) {
            if (typeFormation.toLowerCase().contains(type.getType())) {
                return type;
            }
        }
        throw new IllegalArgumentException("Este tipo de formação não existe: " + typeFormation);
    }
}