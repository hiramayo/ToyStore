package com.hiramayo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ToyStore toyStore = new ToyStore("晴生のおもちゃ屋");
    private static ArrayList<Toy> boughtToyList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int amount;

    public static void main(String[] args) {
	// write your code here
        initStore();
        toyStore.printToyList();
        boolean quit = false;
        int totalPirice = 0;

        System.out.println("あなたはお金をいくら持っていますか？");
        amount = scanner.nextInt();


        while(!quit) {
            System.out.println("\n買いたいオモチャを選んで下さい");

            try {
                int action = scanner.nextInt();
                boughtToyList.add(toyStore.findToy(action));
                printBoughtToyList();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    private static void printBoughtToyList() {

        int totalPrice = 0;

            System.out.println("あなたの買った商品の一覧です。");
            System.out.println("-------------------------------");
            for (int i = 0; i < boughtToyList.size(); i++) {
                Toy boughtToy = boughtToyList.get(i);
                System.out.println(" 商品名：" + boughtToy.getName());
                System.out.println("   価格：" + boughtToy.getPrice() + "円");
                totalPrice += boughtToy.getPrice();
            }
        System.out.println("合計金額は" + totalPrice + "円です");
        int remain = amount - totalPrice;
        System.out.println("残金は" + remain + "円です");

    }
    private static void initStore() {
        toyStore.addToy("ボール",-494); //0
        toyStore.addToy("ワンちゃん",-396); //1
        toyStore.addToy("ネコちゃん",-394); //2
        toyStore.addToy("アイスクリーム",9999); //3
        toyStore.addToy("アイス",100000000); //4
        toyStore.addToy("かき氷",100000000); //5
        toyStore.addToy("かき",100000000); //6

        toyStore.addToy("牡蠣",100000000); //7
        toyStore.addToy("huusenn" + "",100000000); //8
        toyStore.addToy("syabonndama" + "" + "",100000000); //9
        toyStore.addToy("牡蠣",1000000); //10
        toyStore.addToy("牡蠣",100000); //11
        toyStore.addToy("tenisuraketo" + "" + "",10000000); //12


        toyStore.addToy("" + "simohuraniku" + "",100000000); //13
        toyStore.addToy("" + "tiisanamedaru" + "",100000); //14
        toyStore.addToy("" + "kyoryu-u" + "" + "",10000); //15
        toyStore.addToy("けん玉（kenndama）",1000); //16

//        int price = 989999 - 10000 + 9000;
//        System.out.println("残金は" + price + "円です。");
    }
}
