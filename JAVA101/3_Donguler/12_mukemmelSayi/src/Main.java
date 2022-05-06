import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Mükemmel sayı sorgulama
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int var = scanner.nextInt();
        int i = var-1, sum = 0;
        while (i > 0){
            if (var % i == 0) {sum += i;}
            i--;
        }
        if (sum == var){
            System.out.println(var + " sayısı bir mükemmel sayıdır.");
        }
        else {
            System.out.println(var + " sayısı bir mükemmel sayı değildir.");
        }
    }
}
