import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("########## TAKSİMETRE PROGRAMI ##########");
        /*
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
        */
        Scanner scanner = new Scanner(System.in);

        float kmBasi = 2.2f;
        float acilis = 10f;
        
        System.out.print("Gidilecek mesafeyi giriniz(km): ");
        float km = scanner.nextFloat();
        float tutar = acilis + km * kmBasi;

        boolean minKontrol = tutar >= 20f;

        String str = minKontrol ? "Tutar: "+tutar+" tl" : "Tutar: "+20f+" tl";

        System.out.println(str);

        scanner.close();
    }
}
