import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int var = scanner.nextInt();
        int temp = var;
        boolean x = true;
        recursivePattern(var,temp,x);

    }

    static int recursivePattern(int var,int temp, boolean x){

        System.out.print(temp + " ");

        if (temp <= 0)
            x = false;
        if (!x && temp == var)
            return 1;

        if (x){
            return recursivePattern(var,temp-5,x);
        }
        else
            return recursivePattern(var,temp+5,x);
    }
}
