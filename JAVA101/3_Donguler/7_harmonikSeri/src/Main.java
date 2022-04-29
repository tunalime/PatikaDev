import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Girilen adıma kadar harmonik seri hesaplama

        System.out.println("########## HARMONİK SERİ HESAPLAMA ##########");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adım sayısı: ");
        int adim = scanner.nextInt();
        float sonuc = 0f;

        for (float i = 1f; i <= adim; i++){
            sonuc += 1/i;
            System.out.printf("%.0f. adım: %f\n",i,sonuc);
        }
        System.out.println(adim+". adımda sonuç: "+sonuc);
    }
}
