package game.player;

import item.armor.Armor;
import item.armor.DefaultArmor;
import item.weapon.DefaultWeapon;
import item.weapon.Weapon;

public class Inventory {

    private boolean water;
    private boolean food;
    private boolean firewood;
    private Weapon weapon;
    private Armor armor;

    public Inventory(){
        setWater(false);
        setFirewood(false);
        setFood(false);
        setArmor(new DefaultArmor());
        setWeapon(new DefaultWeapon());
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
