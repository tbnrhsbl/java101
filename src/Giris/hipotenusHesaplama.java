package Giris;
import java.util.Scanner;

public class hipotenusHesaplama {
    public static void main(String[]args){

        //Değişkenlerimizi oluşturalım.

        int a,b;
        double c;

        Scanner veri =new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a=veri.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b=veri.nextInt();

        c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + c);





    }
}
