import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("########## GROCERY SHOPPING ##########");

        Scanner scanner = new Scanner(System.in);
        
        float kgPear, kgApple, kgTomato, kgBanana, kgEggplant;

        float valuePear = 2.14f;
        float valueApple = 3.67f;
        float valueTomato = 1.11f;
        float valueBanana = 0.95f;
        float valueEggplant = 5f;

        System.out.println("Enter quantities of given vegetables (kg):");
        System.out.print("Pear: ");
        kgPear = scanner.nextFloat();
        System.out.print("Apple: ");
        kgApple = scanner.nextFloat();
        System.out.print("Tomatoes: ");
        kgTomato = scanner.nextFloat();
        System.out.print("Banana: ");
        kgBanana = scanner.nextFloat();
        System.out.print("Eggplant: ");
        kgEggplant = scanner.nextFloat();
        
        float price = kgPear*valuePear + kgApple*valueApple + kgTomato*valueTomato + kgBanana*valueBanana + kgEggplant*valueEggplant;

        System.out.println("Total price: "+price);

        scanner.close();
    }
}
