import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Printing MAX/MIN values
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int repeat = scanner.nextInt();
        int i = 1, min, max, var;
        System.out.print("Sayı giriniz: ");
        var = scanner.nextInt();
        min = var;
        max = var;
        while (i < repeat){
            System.out.print("Sayı giriniz: ");
            var = scanner.nextInt();
            if (var > max){
                max = var;
            }
            else if (var < min){
                min = var;
            }
            i++;
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
