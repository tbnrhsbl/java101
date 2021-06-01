package Giris;
import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[]args){
        int select,n1,n2;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz ; ");
        n1= girdi.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        n2 = girdi.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod Alma");
        System.out.print("Seçiminiz :");
        select = girdi.nextInt();

        switch ( select ) {
            case 1 :System.out.println("Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                    if (n2 != 0){
                        System.out.println("Bölme : + " +( n1 / n2 ));
                    }else{
                        System.out.println("Bir sayı sıfıra bölünemez.");
                    }
                break;
            case 5:
                System.out.println("Mod : " + (n1 % n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz. ");
        }

    }
}
