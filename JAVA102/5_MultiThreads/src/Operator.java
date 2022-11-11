import java.util.ArrayList;

public class Operator implements Runnable{

    private static ArrayList<Integer> odd = new ArrayList<>();
    private static ArrayList<Integer> even = new ArrayList<>();
    private ArrayList<Integer> nums;

    public Operator(ArrayList<Integer> nums) {
        this.nums = nums;
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println(Thread.currentThread().getName() + " nums size: " + this.nums.size() + "\tilk: "+ this.nums.get(0) + "\tson: "+this.nums.get(this.nums.size() -1));
        while(i < this.nums.size()){
            checkNumber(this.nums.get(i));
            i++;
        }
        System.out.println(Thread.currentThread().getName() + " islemi bitti!!!" + " SON SAYI: " + this.nums.get(i - 1));
    }
    private synchronized static void checkNumber(int i){
        if(i % 2 == 0){
            addEven(i);
        } else {
            addOdd(i);
        }
    }
    private static void addOdd(Integer i){
        odd.add(i);
    }
    private static void addEven(Integer i){
        even.add(i);
    }
    public static ArrayList<Integer> getOdd() {
        return odd;
    }
    public static ArrayList<Integer> getEven() {
        return even;
    }
}
