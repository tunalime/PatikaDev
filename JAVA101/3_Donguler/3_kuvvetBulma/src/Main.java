import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
    // kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner scanner = new Scanner(System.in);

        System.out.println("########## Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini bulma ##########");

        System.out.print("Bir sayı giriniz: ");
        int limit = scanner.nextInt();

        System.out.print("4'ün kuvvetleri: ");
        for (int i = 1; i < limit; i*=4){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("5'in kuvvetleri: ");
        for (int i = 1; i < limit; i*=5){
            System.out.print(i+" ");
        }
    }
}
