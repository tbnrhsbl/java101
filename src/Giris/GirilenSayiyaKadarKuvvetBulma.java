package Giris;

import java.util.Scanner;

public class GirilenSayiyaKadarKuvvetBulma {
    public static void main(String[] args) {


        int n;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz :");
        n = scanner.nextInt();

        while (i <= n) {
            System.out.println("4'ün kuvvetleri : " + i);
            i *= 4;
            System.out.println("5'in kuvvetleri : " + i);
            i *= 5;
        }

        /*
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz : ");
        n=input.nextInt();

        for (int i = 1; i <= 100; i *= 2) {
            System.out.println(i);
        }
        */

    }
}
