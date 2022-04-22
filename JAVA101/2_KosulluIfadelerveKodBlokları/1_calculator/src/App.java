import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("########## BASIC CALCULATOR ##########");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Operations: "
                            +"\n1. Addition"
                            +"\n2. Subtraction"
                            +"\n3. Multiplication"
                            +"\n4. Division");

        System.out.print("Select operation: ");
        int operation = scanner.nextInt();

        System.out.print("Number 1: ");
        float var1 = scanner.nextFloat();

        System.out.print("Number 2: ");
        float var2 = scanner.nextFloat();

        switch(operation){
            case 1:

                System.out.println("Result for given numbers is: "+(var1 + var2));
                break;
            
            case 2:

                System.out.println("Result for given numbers is: "+(var1 - var2));
                break;

            case 3:

                System.out.println("Result for given numbers is: "+(var1 * var2));
                break;

            case 4:

                System.out.println("Result for given numbers is: "+(var1 / var2));
                break;
        }
        scanner.close();
    }
}
