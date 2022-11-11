import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 1; i <= 10000; i++){
            nums.add(i);
        }

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.addAll(nums.subList(0,2500));
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.addAll(nums.subList(2500,5000));
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums.subList(5000,7500));
        ArrayList<Integer> nums4 = new ArrayList<>();
        nums4.addAll(nums.subList(7500,10000));

        Thread t1 = new Thread(new Operator(nums1));
        Thread t2 = new Thread(new Operator(nums2));
        Thread t3 = new Thread(new Operator(nums3));
        Thread t4 = new Thread(new Operator(nums4));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Thread.sleep(3000);
        System.out.println("Total added numbers: " + (Operator.getEven().size() + Operator.getOdd().size()));
        System.out.println("Odd size: " + Operator.getOdd().size());
        System.out.println("Even size: " + Operator.getEven().size());

        System.out.println(); // eklenmeyen sayıları kontrol eder
        for(Integer i : nums){
            if(!Operator.getOdd().contains(i) && !Operator.getEven().contains(i)){
                System.out.println(i);
            }
        }
    }
}