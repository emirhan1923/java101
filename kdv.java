import java.util.Scanner;

 public class kdv {
    public static void main(String[] args)
    {
        double tutar, kdvOran = 0.20;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz :");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran ;
        System.out.println(kdvTutar);

        double kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutari :" + kdvliTutar);

    }

}
