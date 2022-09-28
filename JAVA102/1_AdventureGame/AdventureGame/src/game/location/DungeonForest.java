package game.location;

import monster.Vampire;
import monster.Zombie;

public class DungeonForest extends Location{

    public DungeonForest(){
        this.setLocationName("Orman");
        this.setSafe(false);
        this.setMonster(new Vampire());
        this.setMonsterCount(1 + (int)(Math.random() * 3));
    }
}
