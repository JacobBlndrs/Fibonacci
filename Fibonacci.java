import java.time.temporal.Temporal;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci hesaplama alanına hoş geldiniz.Lütfen bir değer giriniz : ");
        int deger=inp.nextInt();

        int first=1;
        System.out.println(first);
        int second=1;
        System.out.println(second);
        int result;

        for (int i=3 ; i<=deger;i++ ){

            result=first+second;
            System.out.println(result);

            first=second;
            second=result;

        }







    }
}
