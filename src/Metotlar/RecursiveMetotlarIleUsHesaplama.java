package Metotlar;

import java.util.Scanner;

public class RecursiveMetotlarIleUsHesaplama {
    static int usHesabı(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            if (b==0){
                result=1;
            }
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = scan.nextInt();

        System.out.println(usHesabı(a,b));


    }
}
