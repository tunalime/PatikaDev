package game.location;

import game.Battle;
import game.player.Player;
import monster.Monster;

import java.util.Scanner;

public abstract class Location {

    private boolean isSafe;
    private String locationName;
    private int monsterCount;
    private Monster monster;

    // ####################################################### // onLocation metot

    public void onLocationDungeon(Player player){
        if(!this.isSafe){
            System.out.println(getLocationName() + " giris yaptiniz...");
            System.out.println(monster.monsterInfo() + "\t\tCanavar sayisi: " + getMonsterCount());

            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\t1.Savas\t2.Kac\t\tKalan Canavar Sayisi: " + getMonsterCount());
                System.out.print("Islem: ");
                int var = scanner.nextInt();
                if (var == 1){
                    Battle battle = new Battle();
                    battle.fight(player, getMonster());
                    if (player.isAlive()){
                        setMonsterCount(getMonsterCount() - 1);
                        continue;
                    } else {
                        System.out.println("Oyunu kaybettiniz...");
                        break;
                    }
                } else if (var == 2) {
                    System.out.println("Cikis yapiliyor...");
                    break;
                } else {
                    System.out.println("Hatali tuslama yaptiniz...");
                }
            } while (getMonsterCount() > 0);

        } else {
            System.out.println("This method is not allowed...");
        }
    }

    public boolean isSafe() {
        return isSafe;
    }

    public void setSafe(boolean safe) {
        isSafe = safe;
    }

    public int getMonsterCount() {
        return monsterCount;
    }

    public void setMonsterCount(int monsterCount) {
        if (monsterCount >= 0){
            this.monsterCount = monsterCount;
        } else {
            System.out.println("Canavar sayisi 0'dan kucuk olamaz!");
        }
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
