import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("########## HOMEWORK: USER LOGIN ##########");

        Scanner scanner = new Scanner(System.in);

        String user = "user123";
        String pass = "pass123";
        
        while (true){
            System.out.println("-----------------------");
            System.out.print("User Name: ");
            String userName = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();
            System.out.println("-----------------------");

            if (!userName.equals(user) && password.equals(pass)){
                System.out.println("User name is incorrect.");
            }
            else if (userName.equals(user) && !password.equals(pass)){
                System.out.println("Password is incorrect.");
                System.out.print("Do you want to reset your password? (Yes: y, No: n): ");
                String isForgotten = scanner.nextLine();
                if (isForgotten.equals("y")){
                    System.out.print("New password: ");
                    String str = scanner.nextLine();
                    while (str.equals(password) || str.equals(pass)){
                        System.out.print("Password could not created. Try again: ");
                        str = scanner.nextLine();
                    }
                    System.out.println("Password created successfully.");
                    pass = str;
                }
            }
            else if (!userName.equals(user) && !password.equals(pass)){
                System.out.println("User name and password are incorrect.");
            }
            else {
                System.out.println("Successfully logged in!");
                break;
            }            
        }
        scanner.close();
    }
}
