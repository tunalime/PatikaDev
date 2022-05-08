import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Fibonacci series
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adım sayısı: ");
        int adim = scanner.nextInt();

        int var1 = 0,var2 = 1,var3;

        for (int i = 0; i < adim; i++){
            System.out.print(var1+" ");
            var3 = var1 + var2;
            var1 = var2;
            var2 = var3;
        }
    }
}
