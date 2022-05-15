import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
	// Printing duplicated even numbers

        int[] arr = new int[15];
        int[] duplicated = new int[arr.length];
        int startIndex = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = 1 + (int) (Math.random() * 10);
        }
        System.out.println("Array:\t"+Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    if (!isFind(duplicated,arr[i])){
                        duplicated[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Duplicated Numbers: \t[ ");
        for (int i = 0; i < duplicated.length; i++){
            if (duplicated[i] != 0 && duplicated[i] % 2 == 0){
                System.out.print(duplicated[i]+" ");
            }
        }
        System.out.print("]");
    }
}
