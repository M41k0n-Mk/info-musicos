package me.m41k0n.info_musicos.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import me.m41k0n.info_musicos.enums.FormationType;
import me.m41k0n.info_musicos.enums.RoleType;
import me.m41k0n.info_musicos.model.Artist;

import java.util.List;

@Entity
@Table(name = "artists")
@NoArgsConstructor
public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    @Enumerated(EnumType.STRING)
    private FormationType formationType;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @OneToMany(mappedBy = "artistEntity", cascade = CascadeType.ALL)
    private List<MusicEntity> musicEntityList;

    public ArtistEntity(Artist model) {
        this.name = model.name();
        this.formationType = model.formation();
        this.roleType = model.role();
    }
}