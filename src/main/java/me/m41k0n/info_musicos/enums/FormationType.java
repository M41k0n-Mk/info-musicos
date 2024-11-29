package me.m41k0n.info_musicos.enums;

import lombok.Getter;

@Getter
public enum FormationType {

    SOLO("Solo"),
    DUO("Dupla"),
    TRIO("Trio"),
    BAND("Banda");

    private final String type;

    FormationType(String type) {
        this.type = type;
    }

    public static FormationType fromString(String typeFormation) {
        for (FormationType type : FormationType.values()) {
            if (type.getType().contains(typeFormation)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Este tipo de formação não existe: " + typeFormation);
    }
}