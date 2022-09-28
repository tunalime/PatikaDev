package game.location;

import game.player.Player;

public class SafeHouse extends Location{

    public SafeHouse(){
        this.setLocationName("Guvenli ev");
        this.setSafe(true);
        this.setMonsterCount(0);
        this.setMonster(null);
        System.out.println("Guvenli evdesiniz.");
    }

    public void healPlayer(Player player){
        System.out.println("Can yenilendi...");
        player.setHealt(player.getMaxHealt());
    }
}
