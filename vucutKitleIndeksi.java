import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
        double kg = 0, boy=0, vucutKitleIndeksi=0;
        vucutKitleIndeksi = (kg / (boy * boy));

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        vucutKitleIndeksi = (kg / (boy * boy));

        System.out.println("Vucut Kitle İndeksiniz : " + vucutKitleIndeksi);


    }

}
