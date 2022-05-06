import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ATM PROJECT
        Scanner scanner = new Scanner(System.in);
        int girisHakki = 3;
        String userName, password;
        while (girisHakki > 0){
            System.out.print("Kullanıcı Adı: ");
            userName = scanner.nextLine();
            System.out.print("Parola: ");
            password = scanner.nextLine();

            if (userName.equals("user123") && !password.equals("pass123")){
                System.out.println("Parola hatalı...");
                girisHakki--;
                System.out.println("Kalan giriş hakkı: "+girisHakki);
                System.out.println("--------------------");
            }
            else if (!userName.equals("user123") && password.equals("pass123")){
                System.out.println("Kullanıcı Adı hatalı...");
                girisHakki--;
                System.out.println("Kalan giriş hakkı: "+girisHakki);
                System.out.println("--------------------");
            }
            else if (!userName.equals("user123") && !password.equals("pass123")){
                System.out.println("Kullanıcı Adı ve Parola hatalı...");
                girisHakki--;
                System.out.println("Kalan giriş hakkı: "+girisHakki);
                System.out.println("--------------------");
            }
            else{
                System.out.println("Başarıyla giriş yapıldı...");
                System.out.println("--------------------");
                int bakiye = 1000, miktar, islem = 0;
                System.out.println("İşlemler: " +
                        "\n1. Bakiye Sorgulama" +
                        "\n2. Para Yatırma" +
                        "\n3. Para Çekme" +
                        "\n4. Çıkış" +
                        "\n----------------------");
                while (islem != 4){
                    System.out.print("İşlem seçiniz: ");
                    islem = scanner.nextInt();
                    switch (islem){
                        case 1:
                            System.out.println("Bakiyeniz: "+bakiye);
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            miktar = scanner.nextInt();
                            bakiye += miktar;
                            System.out.println("Yeni bakiyeniz: "+bakiye);
                            break;
                        case 3:
                            System.out.print("Çekmek istediğiniz miktar: ");
                            miktar = scanner.nextInt();
                            if (miktar > bakiye){
                                System.out.println("Bakiye yetersiz...");
                                break;
                            }
                            else{
                                bakiye -= miktar;
                                System.out.println("Yeni bakiyeniz: "+bakiye);
                                break;
                            }
                        case 4:
                            System.out.println("Çıkış Yapılıyor...");
                            break;
                        default:
                            System.out.println("Yanlış işlem...");
                            break;
                    }
                }
                System.out.println("Bankamızı tercih ettiğiniz için teşekkür ederiz...");
                break;
            }
        }
        scanner.close();
    }
}
