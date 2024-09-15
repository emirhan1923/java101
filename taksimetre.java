import java.util.Scanner;


public class taksimetre {
    public static void main(String[] args) {

        int km;
        double perKM =2.20, total, startPrice = 10;


        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km= input.nextInt();
        total = km * perKM;
        total += startPrice;

        // total  20 tl den küçükse total değeri 20 tl olsun
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Tutar : " + total);



    }
}
