package Giris;
import java.util.Scanner;

public class manavHesaplama {
    public static void main(String[]args){

        double armut=2.14, elma=3.67, domates=1.11,muz=0.95, patlican=5.00 ,total ;
        Scanner fiyat = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldıgınızı yazınız lütfen :");
        armut=fiyat.nextDouble();
        System.out.print("Kaç kilo elma aldıgınızı yazınız lütfen :");
        elma=fiyat.nextDouble();
        System.out.print("Kaç kilo domates aldıgınızı yazınız lütfen :");
        domates=fiyat.nextDouble();
        System.out.print("Kaç kilo muz aldıgınızı yazınız lütfen :");
        muz=fiyat.nextDouble();
        System.out.print("Kaç kilo patlıcan aldıgınızı yazınız lütfen :");
        patlican=fiyat.nextDouble();

        total=armut+elma+muz+domates+patlican;
        System.out.println("Toplam tutar : "+ total + "TL");



        }

    }

