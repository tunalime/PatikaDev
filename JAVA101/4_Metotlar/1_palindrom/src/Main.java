import java.util.Scanner;

public class Main {

    static int basamakSayisi(int sayi){
        int basamak = 0;
        while (sayi > 0){
            sayi /= 10;
            basamak++;
        }
        return basamak;
    }

    static boolean isPalindrom(int sayi){
        int basamak = basamakSayisi(sayi);
        int var1, var2;
        for (int i = 0; i < basamak/2; i++){
            var1 = sayi % 10;
            var2 = sayi;
            System.out.print(var1 + " ");
            for (int j = 0; j < basamak - 2*i - 1; j++){
                var2 /= 10;
            }
            var2 %= 10;
            System.out.print(var2+"\n");
            if (var1 != var2){
                return false;
            }
            sayi /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
	// Palindrom sayı bulma

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        if(isPalindrom(sayi)){
            System.out.println(sayi+" sayısı bir palindrom sayıdır.");
        }
        else{
            System.out.println(sayi+" sayısı palindrom değildir.");
        }
        scanner.close();
    }
}
