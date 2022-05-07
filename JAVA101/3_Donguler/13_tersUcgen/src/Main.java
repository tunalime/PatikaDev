import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Reverse triangle pattern with stars
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of steps: ");
        int var = scanner.nextInt();

        for (int i = var-1; i >= 0 ; i--) {
            for (int j = 0; j < (var - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1) ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}