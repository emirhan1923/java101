import java.util.Scanner;


public class daireninalanı {
    public static void main (String[] args) {
        int r ;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : " +  alan);
        System.out.println("Dairenin Cevresi :" + cevre);



    }

}
