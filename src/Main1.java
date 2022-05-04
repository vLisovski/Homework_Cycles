import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fullDist=0;
        double currentDist=0;
        int N;
        int stages=0;

        System.out.println("Set stages: ");
        stages = sc.nextInt();

        for ( N=3; N <= stages; N+=2) {
            currentDist += ((1.0/N) - 1.0/(N+1));
            fullDist += ((1.0/N) + 1.0/(N+1));
        }

        System.out.println("Current dist for " + (N-1) + " stages is: " + currentDist + " km.");
        System.out.println("Full dist for " + (N-1) + " stages is: " + fullDist + " km.");
    }
}
