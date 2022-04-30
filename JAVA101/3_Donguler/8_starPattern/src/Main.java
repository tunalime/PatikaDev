import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Diamond pattern with stars
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of steps: ");
        int var = scanner.nextInt();
        int step = var/2;

        for (int i = 0; i <= step ; i++) {
            for (int j = 0; j < (step - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        step--;
        for (int i = step; i >= 0 ; i--) {
            for (int j = -1; j < (step - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1) ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
