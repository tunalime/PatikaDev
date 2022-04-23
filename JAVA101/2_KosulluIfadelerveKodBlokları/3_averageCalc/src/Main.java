import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("########## AVERAGE SCORE CALCULATOR ##########");

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        float totalScore = 0f;

        System.out.println("Enter the course scores in order: ");

        System.out.print("Math: ");
        float mathScore = scanner.nextFloat();
        if (mathScore >= 0 && mathScore <= 100){
            totalScore += mathScore;
            count++;
        }
        System.out.print("Physics: ");
        float phyScore = scanner.nextFloat();
        if (phyScore >= 0 && phyScore <= 100){
            totalScore += phyScore;
            count++;
        }
        System.out.print("Turkish: ");
        float turScore = scanner.nextFloat();
        if (turScore >= 0 && turScore <= 100){
            totalScore += turScore;
            count++;
        }
        System.out.print("Chemistry: ");
        float chemScore = scanner.nextFloat();
        if (chemScore >= 0 && chemScore <= 100){
            totalScore += chemScore;
            count++;
        }
        System.out.print("Music: ");
        float musScore = scanner.nextFloat();
        if (musScore >= 0 && musScore <= 100){
            totalScore += musScore;
            count++;
        }

        float average = totalScore / count;
        System.out.println("Average Score: "+(average)+"\tNumber of calculated courses: "+count);

        boolean isPassed = average >= 55;
        System.out.println(isPassed ? "Congratulations you passed." : "Your average is below criteria, you did not pass the class.");
    }
}
