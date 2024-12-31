package me.m41k0n.info_musicos;

import jakarta.persistence.EntityNotFoundException;
import me.m41k0n.info_musicos.actions.MenuContext;
import me.m41k0n.info_musicos.actions.RegisterArtistAction;
import me.m41k0n.info_musicos.actions.RegisterMusicAction;
import me.m41k0n.info_musicos.actions.ListMusicAction;
import me.m41k0n.info_musicos.actions.SearchMusicByArtistAction;
import me.m41k0n.info_musicos.actions.SearchArtistDataAction;
import me.m41k0n.info_musicos.actions.ExitApplicationAction;
import me.m41k0n.info_musicos.repository.ArtistRepository;
import me.m41k0n.info_musicos.repository.MusicRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    private final ArtistRepository artistRepository;
    private final MusicRepository musicRepository;

    public Principal(ArtistRepository artistRepository, MusicRepository musicRepository) {
        this.artistRepository = artistRepository;
        this.musicRepository = musicRepository;
    }

    public void showMenu() {
        MenuContext context = new MenuContext();

        context.setAction(1, new RegisterArtistAction(artistRepository));
        context.setAction(2, new RegisterMusicAction(artistRepository, musicRepository));
        context.setAction(3, new ListMusicAction(musicRepository));
        context.setAction(4, new SearchMusicByArtistAction(musicRepository));
        context.setAction(5, new SearchArtistDataAction());
        context.setAction(0, new ExitApplicationAction());

        showMenu(context);
    }

    public static void showMenu(MenuContext context) {
        var choice = -1;
        Scanner read = new Scanner(System.in);

        while (choice != 0) {
            try {
                var menu = """
                        1 - Cadastrar artistas
                        2 - Cadastrar músicas
                        3 - Listar músicas
                        4 - Buscar músicas por artista
                        5 - Pesquisar dados sobre um artista
                        0 - Sair
                        """;

                System.out.println(menu);
                choice = read.nextInt();
                read.nextLine();

                context.executeAction(choice);
            } catch (IllegalArgumentException | EntityNotFoundException e) {
                System.out.println(e + "\n");
            } catch (InputMismatchException e) {
                System.out.println(e + " Digite somente os números listados para cada opção no menu abaixo:\n");
                read.nextLine();
            }
        }
    }
}