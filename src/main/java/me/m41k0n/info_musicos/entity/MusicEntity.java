package me.m41k0n.info_musicos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.m41k0n.info_musicos.model.Music;

@Entity
@Table(name = "musics")
@Setter
@Getter
@NoArgsConstructor
public class MusicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    private String album;
    private String band;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private ArtistEntity artistEntity;

    public MusicEntity(Music music) {
        this.name = music.name();
        this.album = music.album();
        this.band = music.band();
    }
}