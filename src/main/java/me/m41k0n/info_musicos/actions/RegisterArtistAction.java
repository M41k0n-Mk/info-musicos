package me.m41k0n.info_musicos.actions;

import me.m41k0n.info_musicos.entity.ArtistEntity;
import me.m41k0n.info_musicos.enums.FormationType;
import me.m41k0n.info_musicos.enums.RoleType;
import me.m41k0n.info_musicos.model.Artist;
import me.m41k0n.info_musicos.repository.ArtistRepository;

import java.util.Scanner;

public class RegisterArtistAction implements MenuAction {
    private final ArtistRepository artistRepository;

    public RegisterArtistAction(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void execute() {
        System.out.println("Qual o nome do artista?");
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        System.out.println("Esse artista tem carreira solo, dupla, trio, banda?");
        String formation = read.nextLine();
        FormationType formationType = FormationType.fromString(formation);
        System.out.println("Qual a função desse artista?[Cantor, Baterista, Baixista, Guitarrista, Tecladista");
        String role = read.nextLine();
        RoleType roleType = RoleType.fromString(role);
        Artist artist = new Artist(name, formationType, roleType);
        ArtistEntity artistEntity = toEntity(artist);
        artistRepository.save(artistEntity);
    }

    private ArtistEntity toEntity(Artist artistModel) {
        return new ArtistEntity(artistModel);
    }
}