import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        System.out.println("########## GİRİLEN SAYININ BASAMAKLARININ TOPLAMINI HESAPLAMA ##########");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0, basamak = 0;

        while (sayi != 0){
            toplam += sayi % 10;
            sayi /= 10;
            basamak++;
        }
        System.out.println("Girilen sayı "+basamak+" basamaklıdır.");
        System.out.println("Girilen sayının basamaklarının toplamı: "+toplam);
        scanner.close();
    }
}
