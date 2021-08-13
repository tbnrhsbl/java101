package Giris;

import java.util.Scanner;

public class MaxMinHesaplama {

    public static void main(String[] args) {
        int s, adet, max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        adet = input.nextInt();
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + " . Sayıyı giriniz : ");
            s = input.nextInt();
            if (i == 1) {
                max = s;
                min = s;
            }
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
        }
        System.out.println("max sayı : " + max);
        System.out.println("min sayı : " + min);

    }
}
