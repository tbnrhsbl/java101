package Giris;

import java.util.Scanner;

public class UcakBiletiFiyatHesaplamasi {
    public static void main(String[] args) {

        int distance, old, selection;
        double normalTutar, gidisDonusİndirimi1, gidisDonusİndirimi2, gidisDonusİndirimi3,
                gencİndirimOrani, yasliİndirimOrani, cocukİndirimOrani, total;

        System.out.print("Mesafeyi km türünden giriniz : ");
        Scanner input = new Scanner(System.in);
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        old = input.nextInt();

        System.out.print("Yolculuk tipini giriniz :\n1-Tek Yön\n2-Gidiş Dönüş\n");
        selection = input.nextInt();

        normalTutar = (distance * 0.10);
        cocukİndirimOrani = (normalTutar * 0.50);
        gencİndirimOrani = (normalTutar * 0.10);
        yasliİndirimOrani = (normalTutar * 0.30);

        gidisDonusİndirimi1 = ((normalTutar - cocukİndirimOrani) * 0.20);
        gidisDonusİndirimi2 = ((normalTutar - gencİndirimOrani) * 0.20);
        gidisDonusİndirimi3 = ((normalTutar - yasliİndirimOrani) * 0.20);

            switch (selection ) {
                case 1:
                if (old <= 12) {
                    total = (normalTutar - cocukİndirimOrani);
                    System.out.println(total);
                } else if (old > 12 && old <= 24) {
                    total = (normalTutar - gencİndirimOrani);
                    System.out.println(total);
                } else if (old < 65) {
                    total = (normalTutar - yasliİndirimOrani);
                    System.out.println(total);
                } else {
                    total = normalTutar;
                    System.out.println(total);
                }break;
                case 2:  {
                    if (old <= 12) {
                        total = (normalTutar - gidisDonusİndirimi1) * 2;
                        System.out.println(total);
                    } else if (old > 12 && old <= 24) {
                        total = (normalTutar - gidisDonusİndirimi2) * 2;
                        System.out.println(total);
                    } else if (old < 65) {
                        total = (normalTutar - gidisDonusİndirimi3) * 2;
                        System.out.println(total);
                    } else {
                        total = normalTutar * 2;
                        System.out.println(total);
                    }break;

                }  default:
                    System.out.println("Hatalı giriş yaptınız.");
            }
            if (distance<=0){
                System.out.println("Hatalı giriş yaptınız.");
            }else {
                System.out.println();
            }




    }
}






