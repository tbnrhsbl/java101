package Giris;

import java.util.Scanner;

public class OrtalamaHesaplama {

    public static void main(String[] args) {
        //Değikenler oluşturuldu

        int mat, tarih , fizik, muzik, kimya, turkce;

        //Scanner sınıfı tanımlandı
        Scanner sinif = new Scanner(System.in);

        //Kullanıcıdan değerleri alma işlemi

        System.out.print("Matematik Notunuzu giriniz: ");
        mat = sinif.nextInt();
        System.out.print("Tarih Notunuzu giriniz: ");
        tarih = sinif.nextInt();
        System.out.print("Fizik Notunuzu giriniz: ");
        fizik = sinif.nextInt();
        System.out.print("Müzik Notunuzu giriniz: ");
        muzik = sinif.nextInt();
        System.out.print("Kimya Notunuzu giriniz: ");
        kimya = sinif.nextInt();
        System.out.print("Türkçe Notunuzu giriniz: ");
        turkce = sinif.nextInt();

        //sonuç çıktısı işlemi
        int toplam = (mat + tarih+ fizik+ muzik+ turkce + kimya);
        double sonuc =toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);


        //Durum belirteçleri
        boolean durum = sonuc >= 60;
        boolean durum1 = !(sonuc >= 60);
        String sonuc1 = (durum) ? "Geçti" : "Kaldı." ;
        System.out.println(sonuc1);









    }
}
