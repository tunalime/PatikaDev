import com.sun.javafx.tk.ScreenConfigurationAccessor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java ile kullanıcının girdiği değerler ile
    // üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        System.out.println("########## ÜSLÜ SAYI HESAPLAMA ##########");

        Scanner scanner = new Scanner(System.in);

        int sonuc = 1;

        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Kuvvet giriniz: ");
        int kuvvet = scanner.nextInt();

        for (int i = 1; i <= kuvvet; i++){
            sonuc *= sayi;
        }

        System.out.println(sayi + " sayısının " + kuvvet + ". kuvveti: "+sonuc);
        scanner.close();
    }
}
