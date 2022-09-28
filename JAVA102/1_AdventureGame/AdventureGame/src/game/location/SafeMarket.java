package game.location;

import game.player.Inventory;
import game.player.Player;
import item.armor.Armor;
import item.armor.HeavyArmor;
import item.armor.LightArmor;
import item.armor.MediumArmor;
import item.weapon.Pistol;
import item.weapon.Rifle;
import item.weapon.Sword;
import item.weapon.Weapon;
import java.util.Scanner;

public class SafeMarket extends Location{

    Pistol pistol = new Pistol();
    Sword sword = new Sword();
    Rifle rifle = new Rifle();
    LightArmor lightArmor = new LightArmor();
    MediumArmor mediumArmor = new MediumArmor();
    HeavyArmor heavyArmor = new HeavyArmor();

    public SafeMarket(){
        this.setLocationName("Market");
        this.setSafe(true);
        this.setMonsterCount(0);
        this.setMonster(null);
        System.out.println("Markete Hosgeldiniz...");
    }

    public void showMarket(Player player){

        System.out.println("Paraniz: " + player.getMoney());
        System.out.println("Esyalar:" +
                "\nSilahlar:" +
                    "\n\t1. " + pistol.getWeaponName() +"\tHasar: " + pistol.getDamage() + "Fiyat: " + pistol.getValue() +
                    "\n\t2. " + sword.getWeaponName() +"\tHasar: " + sword.getDamage() + "Fiyat: " + sword.getValue() +
                    "\n\t3. " + rifle.getWeaponName() +"\tHasar: " + rifle.getDamage() + "Fiyat: " + rifle.getValue() +
                "\nZirhlar:" +
                    "\n\t4. " + lightArmor.getArmorName() +"\tSavunma: " + lightArmor.getDef() + "Fiyat: " + lightArmor.getValue() +
                    "\n\t5. " + mediumArmor.getArmorName() +"\tSavunma: " + mediumArmor.getDef() + "Fiyat: " + mediumArmor.getValue() +
                    "\n\t6. " + heavyArmor.getArmorName() +"\tSavunma: " + heavyArmor.getDef() + "Fiyat: " + heavyArmor.getValue()
        );
    }

    public void buyMenu(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cikis yapmak icin '9' tuslayiniz...");
        while(true){
            System.out.print("Satin almak istediginiz esya: ");
            int itemID = scanner.nextInt();
            if(itemID > 0 && itemID <= 6){
                switch (itemID){
                    case 1:
                        purchaseWeapon(pistol, player);
                        break;
                    case 2:
                        purchaseWeapon(sword, player);
                        break;
                    case 3:
                        purchaseWeapon(rifle, player);
                        break;
                    case 4:
                        purchaseArmor(lightArmor, player);
                        break;
                    case 5:
                        purchaseArmor(mediumArmor, player);
                        break;
                    case 6:
                        purchaseArmor(heavyArmor, player);
                        break;
                }
            } else if (itemID == 9) {
                System.out.println("Marketten cikis yapiliyor...");
                break;
            } else {
                System.out.println("Hatali tuslama yaptiniz...");
            }
        }
    }

    public void purchaseWeapon(Weapon weapon, Player player){
        Inventory inventory = player.getInventory();
        if(canAfford(player.getMoney(), weapon.getValue())){
            player.setMoney(player.getMoney() - weapon.getValue());
            inventory.setWeapon(weapon);
            player.setInventory(inventory);
            System.out.println(weapon.getWeaponName() + " satin alindi...\t\t Yeni bakiyeniz: " + player.getMoney());
        } else {
            System.out.println("Bakiyeniz yetersiz...");
        }
    }

    public void purchaseArmor(Armor armor, Player player){
        Inventory inventory = player.getInventory();
        if(canAfford(player.getMoney(), armor.getValue())){
            player.setMoney(player.getMoney() - armor.getValue());
            inventory.setArmor(armor);
            player.setInventory(inventory);
            System.out.println(armor.getArmorName() + " satin alindi...\t\t Yeni bakiyeniz: " + player.getMoney());
        } else {
            System.out.println("Bakiyeniz yetersiz...");
        }
    }

    public boolean canAfford(int money, int value){
        if (money >= value){
            return true;
        } else {
            return false;
        }
    }


}
