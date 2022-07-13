package com.boorbash.interfaces.menu;

import java.math.BigDecimal;

public class MenuItem {
    private String dishName;
    private String dishDescription;
    private BigDecimal dishPrice;
    private String dishPicUrl;

    private MenuItem(String dishName, String dishDescription, BigDecimal dishPrice, String dishPicUrl) {
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.dishPrice = dishPrice;
        this.dishPicUrl = dishPicUrl;
    }

    public MenuItem() {

    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public void setDishPrice(BigDecimal dishPrice) {
        this.dishPrice = dishPrice;
    }

    public void setDishPicUrl(String dishPicUrl) {
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
