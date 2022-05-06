import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// EBOB / EKOK HESAPLAMA
        int islem, var1, var2, var3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İşlemler: " +
                "\n1. EBOB BULMA" +
                "\n2. EKOK BULMA");
        System.out.print("İşlem seçiniz: ");
        islem = scanner.nextInt();
        switch (islem){
            case 1:
                System.out.print("1. Sayı: ");
                var1 = scanner.nextInt();
                System.out.print("2. Sayı: ");
                var2 = scanner.nextInt();
                if (var2 >= var1) {var3 = var1;}
                else {var3 = var2;}
                while (var3 > 0){
                    if (var1 % var3 == 0 && var2 % var3 == 0){
                        System.out.println("EBOB: "+var3);
                        break;
                    }
                    else{var3--;}
                }
                break;
            case 2:
                System.out.print("1. Sayı: ");
                var1 = scanner.nextInt();
                System.out.print("2. Sayı: ");
                var2 = scanner.nextInt();
                if (var2 >= var1) {var3 = var2;}
                else {var3 = var1;}
                while (var3 <= var1*var2){
                    if (var3 % var1 == 0 && var3 % var2 == 0){
                        System.out.println("EKOK: "+var3);
                        break;
                    }
                    else {var3++;}
                }
                break;
            default:
                System.out.println("Hatalı işlem...");
                break;
        }
    }
}
