import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {

            // Degiskenleri olustur
            int mat, fizik , kimya, turkce, tarih, muzik;

            //Scanner sınıfımızı tanımladık
            Scanner inp = new Scanner(System.in);

            //Kullanıcıdan degerleri al
            System.out.print("Matematik Notunuz : ");
                    mat =inp.nextInt();

            System.out.print("Fizik Notunuz : ");
            fizik = inp.nextInt();

            System.out.print("kimya Notunuz : ");
            kimya = inp.nextInt();

            System.out.print("Turkce Notunuz : ");
            turkce = inp.nextInt();

            System.out.print("tarih Notunuz : ");
            tarih = inp.nextInt();

            System.out.print("muzik Notunuz : ");
            muzik = inp.nextInt();

            int toplam = ( mat + fizik +  kimya + turkce + tarih + muzik);
            double sonuc = toplam / 6.0;

            System.out.println("Ortalamanız : " + sonuc);

            //Notu kontrol et ve sonucu yazdır
            if (sonuc >=60) {
                System.out.println("Geçti");
            }
            else {
                System.out.println("Kaldı");
            }

        }
    }









/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        System.out.println("Girdiğiniz sayı: " + number);
    }
}*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);
    }
}*/
