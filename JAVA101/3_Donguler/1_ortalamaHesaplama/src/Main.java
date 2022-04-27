import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("########## 3 VE 4'E BÖLÜNEN SAYILARIN ORTALAMASINI HESAPLAMA ##########");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt(), toplam = 0, sayac = 0;

        for (int i = 0; i <= sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                sayac++;
                System.out.print(i+" ");
            }
        }
        float ortalama = toplam / sayac;
        System.out.println("\nToplam: "+toplam+"\tSayaç: "+sayac);
        System.out.println("3 ve 4'e bölünen sayıların ortalaması: "+ortalama);
    }
}
