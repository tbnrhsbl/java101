package Giris;
import java.util.Scanner;

public class havayaGoreEtkinlikProgrami {
    public static void main(String []args){
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        heat = input.nextInt();

        if (heat>=0 && heat<5){
            System.out.println("Kayak yapabilirsiniz :) ");
        }else if (heat<=25){
            if (heat>=5 || heat<=15){
                System.out.println("Sinemaya gidebilirsiniz :) ");
            }
            if (heat>=10 || heat<=25){
                System.out.println("Pikniğe gidebilirsiniz :)");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsiniz :)");
        }

        /*if (heat <5){
            System.out.println("Kayak yapabilirsiniz :) ");
        }else if (heat<=25){
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsiniz :)");
            }else if (heat<10){
                System.out.println("Pikniğe gidebilirsiniz :)");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsiniz :)");
        }*/

    }
}
