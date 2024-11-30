package me.m41k0n.info_musicos.repository;

import me.m41k0n.info_musicos.entity.MusicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<MusicEntity, Long> {
    @Query("SELECT m FROM MusicEntity m LEFT JOIN m.artistEntity a WHERE a.name = :nameArtist")
    List<MusicEntity> findMusicByArtist(String nameArtist);
}