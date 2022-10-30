import java.util.Scanner;

public class DizilerdeGirilenSayiyaEnYakinVeEnUzakDeğeriBulma {
    public static void main(String[] args) {
        int[] list = {2, 15, -95, -846, 37, 98};

        int max = list[0];
        int min = list[0];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen rastgele bir sayı giriniz :");
        int sayi = scanner.nextInt();

        for (int i : list) {
            if (i < sayi) {
                min = i;
            }
            if (i > sayi) {
                max = i;
            }

        }
        System.out.println("Girilen sayi " + sayi);
        System.out.println("Girilen sayıdan kücük en yakın sayı :" + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);
    }
}
