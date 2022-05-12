import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı
	 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("İşlemler: " +
                "\n1. Toplama İşlemi" +
                "\n2. Çıkarma İşlemi" +
                "\n3. Çarpma İşlemi" +
                "\n4. Bölme İşlemi" +
                "\n5. Üslü Sayı Hesaplama" +
                "\n6. Faktoriyel Hesaplama" +
                "\n7. Mod Alma" +
                "\n8. Dikdörtgen Alan ve Çevre Hesabı" +
                "\n9. Çıkış");
        int islem, var;
        double var1, var2;
        do {
            System.out.print("Yapmak istediğiniz işlem: ");
            islem = scanner.nextInt();

            switch (islem){
                case 1:
                    System.out.print("1. Sayı: ");
                    var1 = scanner.nextDouble();
                    System.out.print("2. Sayı: ");
                    var2 = scanner.nextDouble();
                    System.out.println("Sonuç: "+toplama(var1,var2));
                    break;
                case 2:
                    System.out.print("1. Sayı: ");
                    var1 = scanner.nextDouble();
                    System.out.print("2. Sayı: ");
                    var2 = scanner.nextDouble();
                    System.out.println("Sonuç: "+cikarma(var1,var2));
                    break;
                case 3:
                    System.out.print("1. Sayı: ");
                    var1 = scanner.nextDouble();
                    System.out.print("2. Sayı: ");
                    var2 = scanner.nextDouble();
                    System.out.println("Sonuç: "+carpma(var1,var2));
                    break;
                case 4:
                    System.out.print("1. Sayı: ");
                    var1 = scanner.nextDouble();
                    System.out.print("2. Sayı: ");
                    var2 = scanner.nextDouble();
                    System.out.println("Sonuç: "+bolme(var1,var2));
                    break;
                case 5:
                    System.out.print("1. Sayı: ");
                    int base = scanner.nextInt();
                    System.out.print("2. Sayı: ");
                    int power = scanner.nextInt();
                    System.out.println("Sonuç: "+usluSayi(base,power));
                    break;
                case 6:
                    System.out.print("Sayı giriniz: ");
                    var = scanner.nextInt();
                    System.out.println("Sonuc: "+faktoriyel(var));
                    break;
                case 7:
                    System.out.print("1. Sayı: ");
                    int a = scanner.nextInt();
                    System.out.print("2. Sayı: ");
                    int b = scanner.nextInt();
                    System.out.println("Sonuç: "+modAlma(a,b));
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 9:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Hatalı işlem...");
            }
        }while(islem != 9);
        
        scanner.close();
    }

    static double toplama(double var1, double var2){
        return var1 + var2;
    }

    static double cikarma(double var1, double var2){
        return var1 - var2;
    }

    static double carpma(double var1, double var2){
        return var1 * var2;
    }

    static double bolme(double var1, double var2){
        return var1/var2;
    }

    static double usluSayi(int var1, int var2){
        return Math.pow(var1,var2);
    }

    static double faktoriyel(int var){
        if (var == 1){
            return 1;
        }
        return var * faktoriyel(var-1);
    }

    static int modAlma(int a, int b){
        return a % b;
    }

    static void dikdortgen(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğu: ");
        int a = scanner.nextInt();
        System.out.print("Uzun kenar uzunluğu: ");
        int b = scanner.nextInt();
        System.out.println("Çevre: "+carpma(2,toplama(a,b)));
        System.out.println("Alan: "+carpma(a,b));
    }
}
