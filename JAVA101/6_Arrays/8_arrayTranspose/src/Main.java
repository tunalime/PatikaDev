public class Main {

    public static void main(String[] args) {
	// Matrix transpose

        int[][] matrix = new int[2][3];
        int[][] transpose = new int[3][2];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*10);
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(" ]");
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose: ");
        for (int i = 0; i < transpose.length; i++){
            System.out.print("[ ");
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println(" ]");
        }
    }
}
