package com.hiramayo;

import java.util.ArrayList;

/**
 * Created by hiramayo on 2017/12/23.
 */
public class ToyStore {
    private String owner; // お店の人の名前
    private ArrayList<Toy> toyList; //おもちゃのリスト

    public ToyStore(String owner) {
        this.owner = owner;
        this.toyList = new ArrayList<>();
    }
    private boolean addToy(Toy toy) {
        this.toyList.add(toy);
        return true;
    }
    public boolean addToy(String name,int price) {
        Toy newToy =  new Toy(name, price);
        addToy(newToy);
        return true;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Toy> getToyList() {
        return toyList;
    }

    public void setToyList(ArrayList<Toy> toyList) {
        this.toyList = toyList;
    }
    public void printToyList() {
        System.out.println(owner + "の商品一覧です。");
        System.out.println("-------------------------------");
        for (int i = 0; i < this.toyList.size(); i++) {
            Toy existingToy = this.toyList.get(i);
            System.out.println(i + ". 商品名：" + existingToy.getName());
            System.out.println("      価格：" + existingToy.getPrice() + "円です。");
        }
    }
    public Toy findToy(int index) {
        if(index >= this.toyList.size()) {
            return null;
        }
        return this.toyList.get(index);
    }
}
