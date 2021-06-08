package Giris;

import java.util.Scanner;

public class DonguyleTekSayiBulma {
    public static void main(String[] args) {
        int n;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz :  ");
            n = input.nextInt();
            if (n % 2 == 0 || n % 4 == 0) {
                total += n;
            }
        } while (!(n % 2 == 1));
        System.out.println("Toplam : " + total);




        /*  do {
            System.out.print("Sayı Giriniz : ");
            n = input.nextInt();
            if (n % 2 == 1) {
                total += n;
            }

        } while (n > 0);

        System.out.println("Toplam : " + total);
        */
    }
}
