import java.util.Scanner;

    public class dikucgen {
    public static void main(String[] args) {
        //Değişkenlerimizi oluşturalım.

        int a = 0, b = 0;
        double c = 0  ;
        double u =( a + b + c)/2;


        // Kullanıcıdan verilerimizi alalım.

        Scanner girdi = new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);
        u =( a + b + c)/2;
        System.out.println("Ucgenin Cevresi : " + (a+b+c)*2 );




    }


