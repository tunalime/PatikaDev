import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Printing close numbers of given array
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.print("Number: ");
        int var = scanner.nextInt();
        int max = 0, min = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array:        "+Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] <= var && var <= arr[i+1]){
                min = arr[i];
                max = arr[i+1];
                break;
            }
        }

        if (min == 0 || max == 0){
            if(var <= arr[0]){
                min = var;
                max = arr[0];
            }
            else if (var >= arr[arr.length-1]){
                min = arr[arr.length-1];
                max = var;
            }
        }

        System.out.println("\nClosest Values:\nLower: "+min + "\t\tHigher: "+max);
        scanner.close();
    }
}
