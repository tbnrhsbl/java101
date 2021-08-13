package Giris;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        int number, total=0;


        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();
        if (number==1){
            System.out.println("Geçersiz bir sayı girdiniz. ");
            if (number==0){
                System.out.println("Geçersiz bir sayı girdiniz. ");
            }
        }else {
            for (int i = 1; i < number; i++) {

                if (number % i == 0) {
                    total = total + i;
                }
            }
            if (total==number){
                System.out.println("Mükemmel Sayıdır.");
            }else {
                System.out.println("Mükemmel sayı değildir.");
            }

        }




    }
}
