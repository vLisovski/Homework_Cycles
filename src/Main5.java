import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main5 {
    public static void main(String[] args) {
        int[] prices = new int[3];
        int[] sizes = new int[3];
        int summ=0;
        Scanner sc = new Scanner(System.in);
//задаем два массива , потом сортируем по возрастанию, потом перемножаем попарно начиная с нулевого элемента, потом находим
        //сумму произведений
        for (int i = 0; i < 3; i++) {
            System.out.println("Prise of gold sand number " + (i+1));
            prices[i]=sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
        System.out.println("Size of container number " + (i+1));
           sizes[i]=sc.nextInt();
       }
        for(int i = prices.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( prices[j] > prices[j+1] ){
                int tmp = prices[j];
                prices[j] = prices[j+1];
                prices[j+1] = tmp;
            }
        }
    }
        for(int i = sizes.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( sizes[j] > sizes[j+1] ){
                    int tmp = sizes[j];
                    sizes[j] = sizes[j+1];
                    sizes[j+1] = tmp;
                }
            }
        }

        for(int i = 0;i<3;i++)
        {
            summ += sizes[i]*prices[i];
        }

        System.out.println(summ);
    }
}
