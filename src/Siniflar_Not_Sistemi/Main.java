package Siniflar;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","555","TRH");
        Teacher t2=new Teacher("Graham Bell","000","FZK");
        Teacher t3=new Teacher("Kül Yutmaz","1111","BIO");

        Course tarih =new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","000","FZK");
        fizik.addTeacher(t2);
        Course biyo=new Course("Biyoloji","1111","BIO");
        biyo.addTeacher(t3);


        Student s1=new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(20,30,40,50,40,30);
        s1.isPass();

        Student s2=new Student("Güdük Necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,20,20,20);
        s2.isPass();


    }


}
