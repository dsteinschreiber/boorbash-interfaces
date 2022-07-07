package com.boorbash.interfaces.menu;

import java.util.Collection;

public class MenuDivision {
    private final Collection<MenuItem> menuItems;
    private final String divisionName;

    private MenuDivision(Collection<MenuItem> menuItems, String divisionName) {
        this.menuItems = menuItems;
        this.divisionName = divisionName;
    }

    public static MenuDivision of(Collection<MenuItem> menuItems, String divisionName){
        return new MenuDivision(menuItems, divisionName);
    }

    public Collection<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getDivisionName() {
        return divisionName;
    }
}



