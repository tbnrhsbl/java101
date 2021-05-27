package Giris;
import java.util.Scanner;

public class daireAlaniHesaplama {
    public static void main(String[]args){
        int r;
        double pi=3.14 ,a,alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : " );
        r=girdi.nextInt();

        System.out.print("Merkez açısını giriniz : ");
        a=girdi.nextInt();

        alan =(pi * ( r * r ) * a ) / 360;
        System.out.println("Dairenin alanı : " + alan);

    }
    /*Aşağıdaki işlemler Hocanın örneğidir :)

    public static void AlanCevreHesaplama (String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı :" + alan);
        System.out.println("Dairenin çevresi : " + cevre);


    }*/
}
