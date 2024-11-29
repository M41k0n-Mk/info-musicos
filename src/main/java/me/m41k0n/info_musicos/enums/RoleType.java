package me.m41k0n.info_musicos.enums;

import lombok.Getter;

@Getter
public enum RoleType {
    DRUMMER("Baterista"),
    GUITARIST("Guitarrista"),
    BASSIST("Baixista"),
    VOCALIST("Cantor"),
    KEYBOARDIST("Tecladista");

    private final String type;

    RoleType(String type) {
        this.type = type;
    }

    public static RoleType fromString(String roleType) {
        for (RoleType type : RoleType.values()) {
            if (type.getType().contains(roleType)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Este tipo de papel não existe: " + roleType);
    }
}