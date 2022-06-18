package BangunDatar;
import java.util.Scanner;

public class BelahKetupat extends BangunDatarImpl {
    public static void Main() {
        double d1, d2, s;

        BelahKetupat ketup = new BelahKetupat();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("       Belah Ketupat       ");
        System.out.println("===========================");
        System.out.print("Masukkan diagonal 1 (cm) : ");
        d1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2 (cm) : ");
        d2 = input.nextDouble();
        System.out.print("Masukkan sisi (cm)       : ");
        s = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Belah Ketupat     : " + ketup.hitungLuas(d1, d2) + " cm2");
        System.out.println("Keliling Belah Ketupat : " + ketup.hitungKeliling(s) + " cm");
    }

    @Override
    public double hitungLuas(double s1, double s2) {
        double hasil = 0.5 * s1 * s2;
        return hasil;
    }

    @Override
    public double hitungKeliling(double s1) {
        double hasil = 4 * s1;
        return hasil;
    }
}
