import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Sorting Numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array Length: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++){
            System.out.print(i+1 + ". number: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Sorted Array: "+Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j+1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
