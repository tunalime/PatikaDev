import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Number Guessing Game
        Scanner scanner = new Scanner(System.in);

        int attemp = 5;
        int number = (int)(Math.random()*100);

        while(attemp > 0){
            System.out.println("Kalan Deneme Hakkınız: "+attemp);
            attemp--;
            System.out.print("Tahmin: ");
            int guess = scanner.nextInt();
            if (guess == number){
                System.out.println("Tebrikler Doğru Tahmin...!");
                break;
            }
            else if (guess > number){
                System.out.println("Tahmin daha büyük...");
            }
            else if (guess < number){
                System.out.println("Tahmin daha küçük...");
            }
            if(attemp == 0){
                System.out.println("Deneme hakkınız bitti..." +
                        "\nDoğru cevap: "+number +
                        "\nÇıkış yapılıyor...");
            }
        }
        scanner.close();
    }
}
