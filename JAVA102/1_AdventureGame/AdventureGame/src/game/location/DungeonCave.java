package game.location;

import monster.Zombie;

public class DungeonCave extends Location{

    public DungeonCave(){
        this.setLocationName("Magara");
        this.setSafe(false);
        this.setMonster(new Zombie());
        this.setMonsterCount(1 + (int)(Math.random() * 3));
    }

}
