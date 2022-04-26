import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("########## ÇİN ZODYAĞI HESAPLAMA ##########");

        Scanner scanner = new Scanner(System.in);

        String burc = null;

        System.out.print("Doğum yılınız: ");
        int yil = scanner.nextInt();

        if (yil % 12 == 0)       {burc = "Maymun";}
        else if (yil % 12 == 1)  {burc = "Horoz";}
        else if (yil % 12 == 2)  {burc = "Köpek";}
        else if (yil % 12 == 3)  {burc = "Domuz";}
        else if (yil % 12 == 4)  {burc = "Fare";}
        else if (yil % 12 == 5)  {burc = "Öküz";}
        else if (yil % 12 == 6)  {burc = "Kaplan";}
        else if (yil % 12 == 7)  {burc = "Tavşan";}
        else if (yil % 12 == 8)  {burc = "Ejderha";}
        else if (yil % 12 == 9)  {burc = "Yılan";}
        else if (yil % 12 == 10) {burc = "At";}
        else if (yil % 12 == 11) {burc = "Koyun";}

        System.out.println("Çin Zodyağı Burcunuz: "+burc);
        scanner.close();
    }
}
