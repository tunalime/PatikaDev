import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("########## KDV HESAPLAMA PROGRAMI ##########");

        Scanner scanner = new Scanner(System.in);

        float tutar, kdv;

        System.out.print("Bir tutar giriniz: ");
        tutar = scanner.nextFloat();
        System.out.println("------------------------");

        if (tutar >= 1000){
            kdv = tutar * 0.08f;
            System.out.println("Girilen tutar: "+tutar+"\tKDV oranı: 8%");
        }
        else {
            kdv = tutar * 0.18f;
            System.out.println("Girilen tutar: "+tutar+"\tKDV oranı: 18%");
        }
        System.out.println("KDV'li tutar: "+(tutar + kdv));
        System.out.println("KDV: "+kdv);

        scanner.close();

    }
}
