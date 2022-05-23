import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Palindromik Kelime Sorgulama

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelime giriniz: ");
        String kelime = scanner.nextLine();

        int i = 0, j = kelime.length() - 1;
        while (i < j){
            if (kelime.charAt(i) != kelime.charAt(j)){
                System.out.println("Kelime Palindromik Değil...");
                break;
            }
            i++;
            j--;
            if(i < j || i == j){
                System.out.println("Kelime Palindromik...!\t"+kelime);
                break;
            }
        }
    }
}
