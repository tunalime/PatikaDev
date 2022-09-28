package character;

public abstract class Character {

    int id;
    String charName;
    int damage;
    int maxHealt;

    int money;


    public Character(){};

    public String getInfo(){
        String charSum =
                        "\t\tID : " + this.getId() +
                        "\t\tCharacter : " + this.getCharName() +
                        "\t\tDamage : " + this.getDamage() +
                        "\t\tHealt : " + this.getMaxHealt() +
                        "\t\tMoney : " + this.getMoney();
        return charSum;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
}
