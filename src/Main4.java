import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number:");
        number=sc.nextLine();
        char[] numberAsArray = number.toCharArray();

        if (((numberAsArray[0]) == (numberAsArray[numberAsArray.length-1]))&&
        (numberAsArray[(numberAsArray.length/2)-1]==numberAsArray[(numberAsArray.length/2)]))
        {
            System.out.println("Eto palindrom.");
        }
        else{
            System.out.println("Eto ne palindrom.");
        }
    }
}
