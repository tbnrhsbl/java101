package Giris;

import java.util.Scanner;

public class cinZoydagiHesaplayanProgram {
    public static void main(String[] args) {

        int dogumYili;
        String burc;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Doğum Tarihinizi Yıl Olarak Giriniz : ");
        dogumYili = input.nextInt();

        if (dogumYili % 12 == 0) {
            burc = "Maymun";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 1) {
            burc = "Horoz";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 2) {
            burc = "Köpek";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 3) {
            burc = "Domuz";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 4) {
            burc = "Fare";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 5) {
            burc = "Öküz";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 6) {
            burc = "Kaplan";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 7) {
            burc = "Tavşan";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 8) {
            burc = "Ejderha";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 9) {
            burc = "Yılan";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 10) {
            burc = "At";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        } else if (dogumYili % 12 == 11) {
            burc = "Koyun";
            System.out.println("Çin Zoydağı Burcunuz :" + burc);
        }
    }
}
