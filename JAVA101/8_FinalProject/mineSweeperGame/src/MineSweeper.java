import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {

    int row, col;
    String[][] board;
    String[][] gameBoard;

    MineSweeper(int row, int col){
        this.row = row;
        this.col = col;
        this.board = new String[row][col];
        this.gameBoard = new String[row][col];
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        createBoard();
        placeMines(this.board);
        printBoard();
        System.out.println("Oyun Başladı...!");

        while(!isWon()){
            printGameBoard();
            System.out.print("Satır ve Sütun: ");
            int satir = scanner.nextInt();
            int sutun = scanner.nextInt();
            if(satir < 0 || satir >= this.row || sutun < 0 || sutun >= this.col){
                System.out.println("Hatalı koordinat...");
                continue;
            }
            else if (this.board[satir][sutun].equals("*")){
                System.out.println("Game Over!");
                break;
            }
            minesAround(satir,sutun);
        }
    }
    public boolean isWon(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++){
                if(!this.board[i][j].equals("*") && this.gameBoard[i][j].equals("-")){
                    return false;
                }
            }
        }
        System.out.println("Tebrikler Oyunu Kazandınız...!!!");
        for(int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++){
                if(this.board[i][j].equals("*")){
                    gameBoard[i][j] = "*";
                }
            }
        }
        printGameBoard();
        return true;
    }

    public void minesAround(int a, int b){
        int quantity = 0;
        if((a-1 >= 0 && b-1 >= 0) && (a+1 < this.row && b+1 < this.col)){
            for(int i = a-1; i < a+2; i++){
                for (int j = b-1; j < b+2; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        else if((a == 0 && b-1 >= 0) && (a+1 < this.row && b+1 < this.col)){
            for(int i = a; i < a+2; i++){
                for (int j = b-1; j < b+2; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        else if((a == 0 && b-1 >= 0) && (a+1 < this.row && b+1 == this.col)){
            for(int i = a; i < a+2; i++){
                for (int j = b-1; j < b+1; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        else if((a-1 >= 0 && b == 0) && (a+1 < this.row && b+1 < this.col)){
            for(int i = a-1; i < a+2; i++){
                for (int j = b; j < b+2; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        else if((a-1 >= 0 && b == 0) && (a+1 == this.row && b+1 < this.col)){
            for(int i = a-1; i < a+1; i++){
                for (int j = b; j < b+2; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        else if((a == 0 && b == 0) && (a+1 < this.row && b+1 < this.col)){
            for(int i = a; i < a+2; i++){
                for (int j = b; j < b+2; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        else if((a-1 >= 0 && b-1 >= 0) && (a+1 == this.row && b+1 < this.col)){
            for(int i = a-1; i < a+1; i++){
                for (int j = b-1; j < b+2; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        else if((a-1 >= 0 && b-1 >= 0) && (a+1 < this.row && b+1 == this.col)){
            for(int i = a-1; i < a+2; i++){
                for (int j = b-1; j < b+1; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        else if((a-1 >= 0 && b-1 >= 0) && (a+1 == this.row && b+1 == this.col)){
            for(int i = a-1; i < a+1; i++){
                for (int j = b-1; j < b+1; j++){
                    if (this.board[i][j].equals("*")){
                        quantity++;
                    }
                }
            }
        }
        this.gameBoard[a][b] = Integer.toString(quantity);
    }

    public void createBoard(){
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){
                this.board[i][j] = "-";
                this.gameBoard[i][j] = "-";
            }
            System.out.println();
        }
    }
    public void printBoard(){
        System.out.println("##############");
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("##############");
    }
    public void printGameBoard(){
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){
                System.out.print(this.gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void placeMines(String[][] board){
        int mineQuantity = (this.col * this.row) / 4;
        int a,b,i = 0;
        while (i < mineQuantity){
            a = (int)(Math.random() * (this.row));
            b = (int)(Math.random() * (this.col));
            if(!this.board[a][b].equals("*")){
                this.board[a][b] = "*";
                i++;
            }
        }
    }



}
