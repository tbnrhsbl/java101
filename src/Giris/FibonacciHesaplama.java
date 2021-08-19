package Giris;
import java.util.Scanner;
public class FibonacciHesaplama {
    public static void main(String[] args) {
        int n,n1=0,n2=1,n3,i;
        Scanner input =new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        n=input.nextInt();
        System.out.print(n1+ " "+n2);

        for (i=2;i<n;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}
