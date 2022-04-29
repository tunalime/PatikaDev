import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("########## GİRİLEN SAYILARDAN 4'E BÖLÜNENLERİN TOPLAMINI HESAPLAMA ##########");

        Scanner scanner = new Scanner(System.in);

        int sayi = 0, toplam = 0;

        while (true){
            System.out.print("Sayı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi % 2 == 1) {
                break;
            }
            else if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        System.out.println("Girilen sayılardan 4'e tam bölünenlerin toplamı: "+toplam);

        scanner.close();
    }
}
