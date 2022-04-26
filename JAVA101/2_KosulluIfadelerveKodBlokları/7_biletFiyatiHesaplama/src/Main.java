import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("########## UÇAK BİLETİ FİYATI HESAPLAMA ##########");
        float km, perKm, tutar;
        int yolculukTipi, yas;

        Scanner scanner = new Scanner(System.in);

        perKm = 0.1f;

        System.out.print("Gidilecek mesafe(km): ");
        km = scanner.nextFloat();

        System.out.print("Yaş: ");
        yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi (1. Gidiş\t\t2. Gidiş-Dönüş): ");
        yolculukTipi = scanner.nextInt();

        if (km < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)){
            System.out.println("Hatalı giriş...!");
        }
        else {
            tutar = km * perKm;
            if (yas < 12){
                tutar *= 0.5f;
            }
            else if (yas >= 12 && yas <= 24){
                tutar *= 0.9f;
            }
            else if (yas >= 65){
                tutar *= 0.3f;
            }
            if (yolculukTipi == 2){
                tutar = (tutar * 0.8f) * 2;
            }

            System.out.println("Bilet ücreti: "+tutar);
        }
        scanner.close();
    }
}
