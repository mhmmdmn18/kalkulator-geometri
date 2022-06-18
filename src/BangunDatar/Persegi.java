package BangunDatar;
import java.util.Scanner;

public class Persegi extends BangunDatarImpl {
    public static void Main() {
        double s;

        Persegi kotak = new Persegi();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("          Persegi          ");
        System.out.println("===========================");
        System.out.print("Masukkan sisi (cm) : ");
        s = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Persegi     : " + kotak.hitungLuas(s) + " cm2");
        System.out.println("Keliling Persegi : " + kotak.hitungKeliling(s) + " cm");
    }

    @Override
    public double hitungLuas(double s) {
        double hasil = s * s;
        return hasil;
    }

    @Override
    public double hitungKeliling(double s) {
        double hasil = 4 * s;
        return hasil;
    }
}
