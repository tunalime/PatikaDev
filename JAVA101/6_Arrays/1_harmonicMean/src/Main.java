public class Main {

    public static void main(String[] args) {
	// Calculating Harmonic Mean Value
        int[] arr = new int[10];
        double var = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (1 + Math.random() * 100);
        }

        System.out.print("Array: [ ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("]");

        for (int i: arr){
            var += 1d/i;
        }
        
        System.out.println("Harmonic Series: "+var);
        double hmv = (arr.length) / (var);

        System.out.print("Harmonic Mean Value: ");
        System.out.print(hmv);
    }
}
