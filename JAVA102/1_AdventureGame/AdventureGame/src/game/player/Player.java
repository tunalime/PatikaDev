package game.player;

import character.Character;

public class Player {

    private String playerRole;
    private int damage;
    private int healt;
    private int maxHealt;
    private int money;

    private Inventory inventory;

    public Player(){};

    public Player(Character character) {
        this.playerRole = character.getCharName();
        this.damage = character.getDamage();
        this.healt = character.getMaxHealt();
        this.maxHealt = character.getMaxHealt();
        this.money = character.getMoney();
    }

    public void createPlayer(Character character){
        this.playerRole = character.getCharName();
        this.damage = character.getDamage();
        this.healt = character.getMaxHealt();
        this.maxHealt = character.getMaxHealt();
        this.money = character.getMoney();
        this.setInventory(new Inventory());
    }

    public void playerInfo(){
        System.out.println("\tPlayer Role: " + getPlayerRole()
        + "\tHealt: " + getHealt() + "/" + getMaxHealt()
        + "\tDamage: " + getDamage()
        + "\tMoney: " + getMoney());
    }

    public boolean isAlive(){
        if (getHealt() > 0){
            return true;
        } else {
            return false;
        }
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getMaxHealt() {
        return maxHealt;
    }

    public void setMaxHealt(int maxHealt) {
        this.maxHealt = maxHealt;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(String playerRole) {
        this.playerRole = playerRole;
    }
}
