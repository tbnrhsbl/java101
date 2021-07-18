package Giris;
import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int n,k;
        Scanner scan =new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n=scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        k=scan.nextInt();
        int total=1;
        for (int i =1;i<=k;i++){
            total*=n;
        }
        System.out.println("Cevap : " + total);




        //mustafa hocanın while ile yapılan örneği
      /*  int n,k;
        Scanner input =new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n=input.nextInt();
        System.out.println("Üs olacak sayı : ");
        k=input.nextInt();
        int total =1;
        int i = 1;
        while (i<=k){
            total *=n;
            i++;
        }
        System.out.println("Cevap : " + total);*/
    }
}
