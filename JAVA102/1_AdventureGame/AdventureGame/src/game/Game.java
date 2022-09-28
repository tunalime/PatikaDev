package game;

import character.Bowman;
import character.Knight;
import character.Samurai;
import game.location.*;
import game.player.Inventory;
import game.player.Player;

import java.util.Scanner;

public class Game {

    Samurai samurai = new Samurai();
    Bowman bowman = new Bowman();
    Knight knight = new Knight();

    Player player = new Player();

    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Oyun Basladi !!!");
        characterMenu();

        while(!isDone(player) && player.isAlive()){

            player.playerInfo();
            System.out.println("1. Magara\t\t2. Orman\t\t3. Nehir\t\t4. Guvenli ev\t\t5. Market");
            System.out.print("Gitmek istediginiz lokasyon: ");
            int loc = scanner.nextInt();
            goToLocation(loc);

        }
        if (player.isAlive() && isDone(player)){
            System.out.println("!!!...TEBRIKLER OYUNU KAZANDINIZ...!!!");
        } else {
            System.out.println("Oyunu kaybettiniz...");
        }
    }

    public boolean isDone(Player player){
        if (player.getInventory().isFirewood()
                && player.getInventory().isFood()
                && player.getInventory().isWater()){
            return true;
        } else {
            return false;
        }
    }

    public void goToLocation(int loc){
        switch (loc){
            case 1:
                DungeonCave dungeonCave = new DungeonCave();
                dungeonCave.onLocationDungeon(player);

                if (player.isAlive() && dungeonCave.getMonsterCount() == 0){
                    System.out.println(dungeonCave.getLocationName() + " basariyla temizlendi!!");
                    System.out.println("Odul envantere eklendi...");
                    Inventory inventory = player.getInventory();
                    inventory.setFood(true);
                    player.setInventory(inventory);
                }
                break;
            case 2:
                DungeonForest dungeonForest = new DungeonForest();
                dungeonForest.onLocationDungeon(player);

                if (player.isAlive() && dungeonForest.getMonsterCount() == 0){
                    System.out.println(dungeonForest.getLocationName() + " basariyla temizlendi!!");
                    System.out.println("Odul envantere eklendi...");
                    Inventory inventory = player.getInventory();
                    inventory.setFirewood(true);
                    player.setInventory(inventory);
                }
                break;
            case 3:
                DungeonRiver dungeonRiver = new DungeonRiver();
                dungeonRiver.onLocationDungeon(player);

                if (player.isAlive() && dungeonRiver.getMonsterCount() == 0){
                    System.out.println(dungeonRiver.getLocationName() + " basariyla temizlendi!!");
                    System.out.println("Odul envantere eklendi...");
                    Inventory inventory = player.getInventory();
                    inventory.setWater(true);
                    player.setInventory(inventory);
                }
                break;
            case 4:
                SafeHouse safeHouse = new SafeHouse();
                safeHouse.healPlayer(player);
                break;
            case 5:
                SafeMarket safeMarket = new SafeMarket();
                safeMarket.showMarket(player);
                safeMarket.buyMenu(player);
                break;
            default:
                System.out.println("Hatali tuslama yaptiniz.");
                System.out.print("Gitmek istediginiz lokasyon: ");
                loc = scanner.nextInt();
                goToLocation(loc);
                break;
        }
    }

    public void characterMenu(){
        System.out.println("Karakterler: " +
                "\n" + samurai.getInfo() +
                "\n" + bowman.getInfo() +
                "\n" + knight.getInfo()
        );
        do{
            System.out.print("Karakter Seciniz: ");
            int input = scanner.nextInt();
            if (input == 1){
                player.createPlayer(samurai);
                break;
            } else if (input == 2) {
                player.createPlayer(bowman);
                break;
            } else if (input == 3) {
                player.createPlayer(knight);
                break;
            } else{
                System.out.println("Dogru tuslama yapiniz.");
            }
        } while (true);

        System.out.println("Karakter Secildi...!");
        player.playerInfo();
        System.out.println("\t\t################################\t\t");
    }

}
