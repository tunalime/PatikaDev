import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Finding frequency of an array

        int[] arr = new int[20];
        int[] results = new int[arr.length*2];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < results.length; i++){
            results[i] = -1;
        }
        System.out.println("Array: "+ Arrays.toString(arr));
        freq(arr,results);

    }

    public static void freq(int[] arr,int[] results){
        int freq;
        for (int i = 0; i < arr.length; i++){
            freq = 1;
            for (int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    freq++;
                }
            }
            if(!isFind(results,arr[i])){
                results[i*2] = arr[i];
                results[i*2+1] = freq;
                System.out.println(arr[i]+" sayısı " + freq + " defa tekrar etti.");
            }
        }
    }

    public static boolean isFind(int[] arr, int value){
        for (int i = 0; i < arr.length; i+=2){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }
}
