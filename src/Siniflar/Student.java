package Siniflar;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    int a1;
    int a2;
    int a3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3,int a1,int a2,int a3) {
        if (note1 >= 0 && note1 <= 100) {
           this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void isPass(){
        System.out.println("---------------");
        this.avarage=
                ((this.c1.note*0.80)+(this.a1*0.20))+
                ((this.c2.note*0.80)+(this.a2*0.20))+
                ((this.c3.note*0.80)+(this.a3*0.20))/3.0;
        if (this.avarage>55) {

            System.out.println("Sınıfı başarılı şeklilde geçtiniz.");
            this.isPass=true;
        }else {
            System.out.println("Sınıfta kaldınız.Yeni dönemde kayıt yenileme yapınız.");
            this.isPass=false;
        }
        printNote();

    }

    void printNote(){
        System.out.println(c1.name + "Notu\t     :"+c1.note);
        System.out.println(c2.name + "Notu\t     :"+c2.note);
        System.out.println(c3.name + "Notu\t :"+c3.note);
        System.out.println();
        System.out.println("Ortalamanız : "+this.avarage);
    }

}
