package game;

import game.player.Player;
import monster.Monster;

public class Battle {

    public void fight(Player player, Monster monster){
        int fightVar = 1;
        while(player.isAlive() && monster.isAlive()){
            System.out.println("\t" + player.getPlayerRole() + " can: " + player.getHealt() + "\t\t" + monster.getMonsterName() + " can: " + monster.getHealt());
            if (fightVar % 2 == 1){
                hitToMonster(player, monster);
                fightVar++;
            } else {
                hitToPlayer(player, monster);
                fightVar++;
            }
        }
        if (player.isAlive()){
            System.out.println(player.getPlayerRole() + " dovusu kazandi..!");
            player.setMoney(player.getMoney() + monster.getMoney());
            System.out.println(monster.getMoney() + " para kazanildi.");
        } else {
            System.out.println(player.getPlayerRole() + " dovusu kaybetti...");
        }
    }

    public void hitToMonster(Player player, Monster monster){
        System.out.println(player.getPlayerRole() + " " + totalDamagePlayer(player) + " hasar ile saldiriyor...");
        monster.setHealt(monster.getHealt() - totalDamagePlayer(player));
    }

    public void hitToPlayer(Player player, Monster monster){
        System.out.println(monster.getMonsterName() + " " + totalDamageMonster(player, monster) + " hasar ile saldiriyor...");
        player.setHealt(player.getHealt() - totalDamageMonster(player, monster));
    }

    public int totalDamagePlayer(Player player){
        int totalDamage = player.getDamage() + player.getInventory().getWeapon().getDamage();
        return totalDamage;
    }

    public int totalDamageMonster(Player player, Monster monster){
        int totalDamage = monster.getDamage() - player.getInventory().getArmor().getDef();
        if (totalDamage < 0){
            totalDamage = 0;
        }
        return totalDamage;
    }
}
