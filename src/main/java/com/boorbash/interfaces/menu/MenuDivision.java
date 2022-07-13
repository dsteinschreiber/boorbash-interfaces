package com.boorbash.interfaces.menu;

import java.util.Collection;

public class MenuDivision {
    private Collection<MenuItem> menuItems;
    private String divisionName;

    private MenuDivision(Collection<MenuItem> menuItems, String divisionName) {
        this.menuItems = menuItems;
        this.divisionName = divisionName;
    }

    public MenuDivision(){

    }

    public void setMenuItems(Collection<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void setDivisionName(String divisionName) {
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



