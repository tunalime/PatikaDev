package monster;

public abstract class Monster {

    int id;

    String monsterName;

    int damage;

    int healt;

    int money;

    public boolean isAlive(){
        if (getHealt() > 0){
            return true;
        } else {
            return false;
        }
    }

    public String monsterInfo(){
        String info = "Canavar Adi: " + getMonsterName() + "\tCan: " + getHealt() + "\tHasar: " + getDamage();
                return info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
