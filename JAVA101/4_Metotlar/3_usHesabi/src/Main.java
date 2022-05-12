import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Recursive Metot ile Üs Hesaplama

        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int var1 = scanner.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int var2 = scanner.nextInt();
        System.out.println("Sonuç: "+usBulma(var1,var2));
    }

    static int usBulma(int base, int power){
        if (power == 0){
            return 1;
        }
        return base * usBulma(base,power-1);
    }
}
