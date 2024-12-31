package me.m41k0n.info_musicos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import lombok.NoArgsConstructor;
import me.m41k0n.info_musicos.enums.FormationType;
import me.m41k0n.info_musicos.enums.RoleType;
import java.util.List;

@Entity
@Table(name = "artists")
@NoArgsConstructor
public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(unique = true)
    private String name;
    @Enumerated(EnumType.STRING)
    private FormationType formationType;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @OneToMany(mappedBy = "artistEntity", cascade = CascadeType.ALL)
    private List<MusicEntity> musicEntityList;

    public ArtistEntity(String name, FormationType formationType, RoleType roleType) {
        this.name = name;
        this.formationType = formationType;
        this.roleType = roleType;
    }
}