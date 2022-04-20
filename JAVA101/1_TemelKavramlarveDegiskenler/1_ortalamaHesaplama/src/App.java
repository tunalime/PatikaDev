import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("################ ORTALAMA HESAPLAMA PROGRAMI ################");

        Scanner scanner = new Scanner(System.in);

        System.out.println("* Sınıf geçme koşulu: Ortalama >= 60 *"
                            +"\nDers notlarınızı sırasıyla giriniz: ");

        System.out.print("Matematik: ");
        int matNot = scanner.nextInt();

        System.out.print("Fizik: ");
        int fizNot = scanner.nextInt();

        System.out.print("Müzik: ");
        int muzNot = scanner.nextInt();

        System.out.print("Coğrafya: ");
        int cogNot = scanner.nextInt();

        System.out.print("Kimya: ");
        int kimNot = scanner.nextInt();

        System.out.print("Biyoloji: ");
        int bioNot = scanner.nextInt();

        float ortalama = (matNot + fizNot + muzNot + cogNot + kimNot + bioNot) / 6f;

        System.out.println("Ortalamanız: "+ortalama);

        boolean gectiMi = ortalama >= 60;

        String str = gectiMi ? "Tebrikler! Sınıfı geçtiniz..." : "Kaldınız...";

        System.out.println(str);

        scanner.close();
    }
}
