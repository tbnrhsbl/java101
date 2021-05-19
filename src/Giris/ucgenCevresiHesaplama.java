package Giris;
import java.util.Scanner;

public class ucgenCevresiHesaplama {
    public static void main(String[]args){

        double a,b,c, uzunluk,alan;


        Scanner giris = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a= giris.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b=giris.nextInt();
        System.out.print("3. Kenarı giriniz : ");
        c=giris.nextInt();


        uzunluk = (a+b+c)/2;
        alan = Math.sqrt( (uzunluk - a)*(uzunluk - b)*(uzunluk - c));
        System.out.println("Üçgenin Alanı : "+ alan);









    }
}
