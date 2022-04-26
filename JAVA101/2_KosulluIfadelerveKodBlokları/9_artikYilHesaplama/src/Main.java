import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("########### ARTIK YIL HESAPLAMA ###########");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();

        if (yil % 4 == 0){
            if (yil % 100 == 0 && yil % 400 != 0){
                System.out.println(yil + " yılı bir artık yıl değildir.");
            }
            else {
                System.out.println(yil + " yılı bir artık yıldır.");
            }
        }
        else {
            System.out.println(yil + " yılı bir artık yıl değildir.");
        }
        scanner.close();
    }
}
