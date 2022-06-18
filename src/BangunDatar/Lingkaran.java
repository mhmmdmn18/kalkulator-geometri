package BangunDatar;
import java.util.Scanner;

public class Lingkaran extends BangunDatarImpl {
    public static void Main() {
        double r;
        
        Lingkaran ling = new Lingkaran();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("         Lingkaran         ");
        System.out.println("===========================");

        System.out.print("Masukkan jari-jari (cm) : ");
        r = input.nextDouble();

        System.out.println("");
        System.out.println("Luas lingkaran     : " + ling.hitungLuas(r) + " cm2");
        System.out.println("Keliling lingkaran : " + ling.hitungKeliling(r) + " cm");
    }

    @Override
    public double hitungLuas(double r) {
        double hasil = Math.PI * r * r;
        return hasil;
    }

    @Override
    public double hitungKeliling(double r) {
        double hasil = 2 * Math.PI * r;
        return hasil;
    }
}
