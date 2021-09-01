package Metotlar;

import java.util.Scanner;

public class RecursiveMetotlarlaAsalSayiHesabi {
        static boolean asalSayiMi(int a) {
            int sayac = 0;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                return true;
            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Sayı Giriniz : ");
            int a = input.nextInt();
            System.out.println(asalSayiMi(a));

            if (asalSayiMi(a)){
                System.out.println("Girilen sayı asaldır.");
            }else {
                System.out.println("Girilen sayı asal değildir.");
            }
        }
}
