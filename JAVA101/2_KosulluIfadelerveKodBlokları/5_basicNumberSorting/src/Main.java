import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Sorting 3 input numbers with if else statements
        System.out.println("########## Basic Number Sorting Application ##########");

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. number: ");
        int var1 = scanner.nextInt();

        System.out.print("2. number: ");
        int var2 = scanner.nextInt();

        System.out.print("3. number: ");
        int var3 = scanner.nextInt();

        if (var1 >= var2 && var1 >= var3){
            if (var2 >= var3){
                System.out.println(var1 + " >= " + var2 + " >= " + var3);
            }
            else {
                System.out.println(var1 + " >= " + var3 + " >= " + var2);
            }
        }
        else if (var2 >= var1 && var2 >=var3){
            if (var1 >= var3){
                System.out.println(var2 + " >= " + var1 + " >= " + var3);
            }
            else {
                System.out.println(var2 + " >= " + var3 + " >= " +var1);
            }
        }
        else{
            if (var1 >= var2){
                System.out.println(var3 + " >= " + var1 + " >= " + var2);
            }
            else{
                System.out.println(var3 + " >= " + var2 + " >= " + var1);
            }
        }
    }
}
