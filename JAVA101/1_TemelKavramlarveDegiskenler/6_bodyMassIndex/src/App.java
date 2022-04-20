import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("########## BODY MASS INDEX ##########");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height (m): ");
        float height = scanner.nextFloat();
        System.out.print("Enter your weight (kg): ");
        float weight = scanner.nextFloat();

        float bmi = weight / (height*height);

        System.out.println("Calculated Body Mass Index is: "+bmi);

        scanner.close();
    }
}
