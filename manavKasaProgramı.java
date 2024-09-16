import java.util.Scanner;


public class manavKasaProgramı {
    public static void main (String... args) {
     double ArmutFiyat=2.14 , ElmaFiyat = 3.67 , DomatesFiyat = 1.11 , MuzFiyat = 0.95 ,
                PatlıcanFiyat = 5.00  ;
     double ArmutKilo , ElmaKilo , DomatesKilo, MuzKilo, PatlıcanKilo, toplamharcanantutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kiloluk Armut aldınız? : ");
        ArmutKilo= input.nextDouble();

        System.out.println("Armut Tutar : " +  ArmutFiyat * ArmutKilo );


        System.out.println("Kaç kiloluk Elma aldınız? : ");
        ElmaKilo= input.nextDouble();

        System.out.println("Elma Tutar : " +  ElmaFiyat * ElmaKilo );

        System.out.println("Kaç kiloluk Domates aldınız? : ");
        DomatesKilo= input.nextDouble();

        System.out.println("Domates Tutar : " +  DomatesFiyat * DomatesKilo );

        System.out.println("Kaç kiloluk Muz aldınız? : ");
        MuzKilo= input.nextDouble();

        System.out.println("Muz Tutar : " +  MuzFiyat * MuzKilo );


        System.out.println("Kaç kiloluk Patlıcan aldınız? : ");
        PatlıcanKilo= input.nextDouble();

        System.out.println("Patlıcan Tutar : " +  PatlıcanFiyat * PatlıcanKilo );

        toplamharcanantutar= ArmutFiyat*ArmutKilo +ElmaFiyat*ElmaKilo +DomatesFiyat*DomatesKilo +MuzFiyat*MuzKilo +PatlıcanFiyat*PatlıcanKilo;

        System.out.println("Toplam Harcama Tutarı : " + toplamharcanantutar);






    }
}
