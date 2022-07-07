package com.boorbash.interfaces.menu;

import java.math.BigDecimal;

public class MenuItem {
    private final String dishName;
    private final String dishDescription;
    private final BigDecimal dishPrice;
    private final String dishPicUrl;

    private MenuItem(String dishName, String dishDescription, BigDecimal dishPrice, String dishPicUrl) {
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.dishPrice = dishPrice;
        this.dishPicUrl = dishPicUrl;
    }

    public static MenuItem of(String dishName, String dishDescription, BigDecimal dishPrice, String dishPicUrl){
        return new MenuItem(dishName, dishDescription, dishPrice, dishPicUrl);
    }

    public String getDishName() {
        return dishName;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public BigDecimal getDishPrice() {
        return dishPrice;
    }

    public String getDishPicUrl() {
        return dishPicUrl;
    }
}
