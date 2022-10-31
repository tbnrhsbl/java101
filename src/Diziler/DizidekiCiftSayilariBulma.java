package Diziler;

public class DizidekiCiftSayilariBulma {


    public static void main(String[] args) {
        int[] list = {3, 7, 3, 26,44,102,88, 2, 9, 10, 21, 1, 33, 9, 1};

        int startIndex=0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++){
                if (list[i]==list[j]){
                    if (list[j]%2==0){
                        System.out.println(list[j]);
                    }
                }
            }


        }


    }
}