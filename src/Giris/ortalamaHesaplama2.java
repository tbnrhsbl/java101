package Giris;

import java.util.Scanner;

public class ortalamaHesaplama2 {
    public static void main(String[] args) {
        int turkce, tarih, mat, fizik, kimya, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Türkçe notunuzu giriniz :");
        turkce = input.nextInt();
        System.out.print("Tarih notunuz giriniz :");
        tarih = input.nextInt();
        System.out.print("Müzik notunuz giriniz :");
        muzik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz :");
        fizik = input.nextInt();
        System.out.print("Matematik notunuzu giriniz :");
        mat = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        double avarage = ((mat + fizik + kimya + muzik + turkce + tarih) / 6);
            if (mat < 0 || mat > 100) {
                avarage = ((fizik + kimya + muzik + turkce + tarih) / 6);
            } else if (fizik < 0 || fizik > 100) {
                avarage = ((mat + kimya + muzik + turkce + tarih) / 6);
            } else if (kimya < 0 || kimya > 100) {
                avarage = ((mat + muzik + turkce + tarih + fizik) / 6);
            } else if (turkce < 0 || turkce > 100) {
                avarage = ((kimya + mat + fizik + muzik + tarih) / 6);
            } else if (tarih < 0 || tarih > 100) {
                avarage = ((mat + turkce + kimya + fizik + muzik) / 6);
            } else if (muzik < 0 || muzik > 100) {
                avarage = ((mat + tarih + turkce + kimya + fizik) / 6);
            }
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız, Seneye görüşmek üzere! ");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz. ");
        }
        System.out.println("Ortalamanız : " + avarage);
    }


}






