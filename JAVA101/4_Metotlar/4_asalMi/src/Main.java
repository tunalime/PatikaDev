import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Recursive metot ile asallık sorgulama

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int var = scanner.nextInt();
        
        if (asalMi(var,2)){
            System.out.println(var+ " sayısı bir asal sayıdır.");
        }
        else {
            System.out.println(var+ " sayısı asal değildir.");
        }
    }

    static boolean asalMi (int n, int i){

        if (n <= 2)
            return (n == 2);
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return asalMi(n, i+1);
    }
}
