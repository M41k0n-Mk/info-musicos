package me.m41k0n.info_musicos.actions;

import me.m41k0n.info_musicos.GptChatRequest;

import java.util.Scanner;

public class SearchArtistDataAction implements MenuAction {
    @Override
    public void execute() {
        System.out.println("Qual artista você deseja obter informações?");
        Scanner read = new Scanner(System.in);
        String artist = read.nextLine();
        System.out.println(GptChatRequest.getInfo(artist));
    }
}