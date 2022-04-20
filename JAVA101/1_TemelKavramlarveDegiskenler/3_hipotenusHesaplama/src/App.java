import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("########## HİPOTENÜS HESAPLAMA PROGRAMI ##########");
        System.out.println("Hipotenüsünü hesaplamak istediğiniz dik üçgenin sırasıyla dik kenarlarını giriniz.");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1. Kısa kenar: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("2. Kısa kenar: ");
        double kenar2 = scanner.nextDouble();

        double hipo = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);

        System.out.println("Verilen üçgenin hipotenüs uzunluğu: "+hipo);

        scanner.close();
    }
}
