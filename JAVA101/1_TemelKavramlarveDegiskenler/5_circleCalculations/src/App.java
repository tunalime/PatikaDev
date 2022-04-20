import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("########## CALCULATING AREA AND PERIMETER OF A CIRCLE ##########");
        
        Scanner scanner = new Scanner(System.in);

        float pi = 3.14f;

        System.out.print("Enter radius: ");
        float radius = scanner.nextFloat();

        System.out.print("Enter angle (degree): ");
        float angle = scanner.nextFloat();

        float areaTotal = pi * radius * radius;
        float areaSlice = pi * radius * radius * (angle/360f);
        float perimeterTotal = 2 * pi * radius;
        float perimeterSlice = 2 * pi * radius * (angle/360f);
        System.out.println("Total area by given radius: "+areaTotal);
        System.out.println("Area by given radius and angle: "+areaSlice);
        System.out.println("Perimeter by given radius: "+perimeterTotal);
        System.out.println("Perimeter by given radius and angle: "+perimeterSlice);

        scanner.close();
    }
}
