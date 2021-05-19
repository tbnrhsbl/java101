package Giris;
import java.util.Scanner;
public class vucutKitleİndeksi {
    public static void main(String[]args){

        double boy , kilo , sonuc ;

        Scanner bilgi = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo=bilgi.nextDouble();
        System.out.print("Lütfen Boyunuzu 'Metre Cinsinde' Giriniz :");
        boy=bilgi.nextDouble();

        sonuc = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + sonuc);
    }
}
