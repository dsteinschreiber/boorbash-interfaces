package com.boorbash.interfaces.menu;

import java.util.Collection;

public class Menu {

    private final Collection<MenuDivision> menuDivisions;


    private Menu(Collection<MenuDivision> menuDivisions) {
        this.menuDivisions = menuDivisions;
    }

    public static Menu of (Collection<MenuDivision> menuDivisions){
        return new Menu(menuDivisions);
    }

    public Collection<MenuDivision> getMenuDivisions() {
        return menuDivisions;
    }
}
