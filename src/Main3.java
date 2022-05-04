import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N=1;
        int number;
        int numOfOne=0;
        int numOfNull=0;
        int minNum;

        System.out.println("Write number of coins:");
        N=sc.nextInt();

        for (int i = 1; i < N+1; i++) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Write side of coin number "+ i);
            number = scanner.nextInt();
            if(number==1){
                numOfOne++;
            }
            else {
                numOfNull++;
            }
        }

        minNum = Math.min(numOfOne,numOfNull);
        System.out.println("Min number of rotates is: "+minNum);
    }
}
