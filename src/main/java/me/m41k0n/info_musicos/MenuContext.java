package me.m41k0n.info_musicos;

import me.m41k0n.info_musicos.actions.MenuAction;

import java.util.HashMap;
import java.util.Map;

public class MenuContext {
    private final Map<Integer, MenuAction> actions = new HashMap<>();

    public void setAction(int choice, MenuAction action) {
        actions.put(choice, action);
    }

    public void executeAction(int choice) {
        MenuAction action = actions.get(choice);
        if (action != null) {
            action.execute();
        } else {
            System.out.println("Não existe essa opção no menu");
        }
    }
}

