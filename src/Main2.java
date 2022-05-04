import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int number=0;
        double result=0;
        Scanner sc =new Scanner(System.in);

        System.out.println("Write a number:");
        number = sc.nextInt();
        result = number;

        do {

            if(number%2!=0)
            {
                System.out.println("Number is not binary.");
                break;
            }
            else{
                result = result/2.0;
            }

        }while (result!=1);

        if (result==1){
            System.out.println("Number is binary.");
        }
    }
}
