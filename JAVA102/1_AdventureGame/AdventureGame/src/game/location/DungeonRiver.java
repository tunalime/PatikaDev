package game.location;

import monster.Bear;
import monster.Zombie;

public class DungeonRiver extends Location{

    public DungeonRiver(){
        this.setLocationName("Nehir");
        this.setSafe(false);
        this.setMonster(new Bear());
        this.setMonsterCount(1 + (int)(Math.random() * 3));
    }
}
