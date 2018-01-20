package com.hiramayo;

/**
 * Created by hiramayo on 2017/12/23.
 */
public class Item {

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //名前
    private String name;
    //値段
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
