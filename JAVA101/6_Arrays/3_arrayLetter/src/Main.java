public class Main {

    public static void main(String[] args) {
	// Printing letter 'B' with multi dimensional array

        String [][] arr = new String[7][4];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (j != 1 && j != 2){
                    arr[i][j] = "*";
                }
                else{
                    arr[i][j] = " ";
                }
                if (i == 0 || i == 3 || i == 6){
                    arr[i][j] = "*";
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
