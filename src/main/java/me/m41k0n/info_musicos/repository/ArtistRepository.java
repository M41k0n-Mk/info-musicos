package me.m41k0n.info_musicos.repository;

import me.m41k0n.info_musicos.entity.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistEntity, Long> {
}