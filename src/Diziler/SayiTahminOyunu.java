package Diziler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random yeniValue = new Random();
        int number = yeniValue.nextInt(100);

        System.out.println(number);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz :");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz : ");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız kalan hak " + (5 - right));

                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir");

                }
                continue;
            }

            if (selected == number) {
                System.out.println("Teblirekler doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected < number) {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür !");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür !");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Kalan hakkı : " + (5 - right));
            }


        }
        if (isWin && !isWrong) {
            System.out.println("Kazandınız ! ");
        } else {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));

        }


    }


}
