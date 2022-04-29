import java.util.Scanner;

public class Main {

    public static int faktoriyel(int a){
        int fakt = 1;
        for (int i = 1; i <= a; i++){
            fakt *= i;
        }
        return fakt;
    }

    public static void main(String[] args) {
	/*
    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü:    C(n,r) = n! / (r! * (n-r)!)
	 */
        System.out.println("########### KOMBİNASYON HESAPLAMA ###########");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nKombinasyon formülü: "
                        + "C(n,r) = n! / (r! * (n-r)!)");

        System.out.print("\nn: ");
        int n = scanner.nextInt();
        System.out.print("r: ");
        int r = scanner.nextInt();

        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n-r));

        System.out.println(n + " elemanlı kümenin "+ r +" elemanlı altküme sayısı: "+kombinasyon);
        scanner.close();
    }
}
