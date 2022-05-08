public class Main {

    public static void main(String[] args) {
	// 1-100 arasındaki asal sayıları yazdırma

        boolean asalMi;
        for (int i = 2; i <= 100; i++){
            asalMi = true;
            for (int j = i-1; j > 1; j--){
                if (i % j == 0){
                    asalMi = false;
                }
            }
            if (asalMi){
                System.out.println(i);
            }
        }
    }
}
