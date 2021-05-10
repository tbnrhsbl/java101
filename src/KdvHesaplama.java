import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double
                tutar, kdvOran1 = 0.18, kdvOran2 = 0.8, kdvTutar1, kdvTutar2, kdvliTutar1, kdvliTutar2;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");
        tutar = input.nextDouble();

        kdvTutar1 = tutar * kdvOran1;
        kdvliTutar1 = tutar + kdvTutar1;

        kdvTutar2 = tutar * kdvOran2;
        kdvliTutar2 = tutar + kdvTutar2;
        if (tutar <= 1000) {

            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Tutarı :" + kdvTutar1);
            System.out.println("Kdv Oranı :" + kdvOran1);
            System.out.println("KDV'li Tutar: " + kdvliTutar1);

        }else {

            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Tutarı :" + kdvTutar2);
            System.out.println("Kdv Oranı :" + kdvOran2);
            System.out.println("KDV'li Tutar :" + kdvliTutar2);
        }
    }
}
