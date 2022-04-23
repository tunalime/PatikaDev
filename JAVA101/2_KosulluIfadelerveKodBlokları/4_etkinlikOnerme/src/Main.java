import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("########## SICAKLIĞA GÖRE ETKİNLİK ÖNERME ##########");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz (Celsius): ");
        int temp = scanner.nextInt();

        if (temp <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (temp >= 5 && temp <=15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (temp >= 15 && temp <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        if (temp >= 25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
