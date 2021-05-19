package Giris;

import java.util.Scanner;

public class kullaniciBilgileriOlusturma {

    public static void main(String[] args) {
        String userName, password, newpassword;


        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
        userName = girdi.nextLine();
        System.out.print("Lütfen Kullanıcı Şifrenizi Giriniz :");
        password = girdi.nextLine();

        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Giriş Yaptınız ! ");
        } else {
            System.out.println("Bilgileriniz Yanlış ! ");
            System.out.print("Şifrenizi Sıfırlamak İster misiniz?\nLütfen yeni şifrenizi giriniz: ");
            newpassword = girdi.nextLine();

            if (newpassword.equals("dev123") && (newpassword.equals(newpassword))) {
                System.out.println("Şifreler aynı olamaz. Yeni şifre giriniz.");

            } else {
                System.out.println("Şifreniz güncellenmiştir.");

            }

        }


    }

}


