package BangunDatar;
import java.util.Scanner;

public class Segitiga extends BangunDatarImpl {
    public static void Main() {
        double a, t, s2, s3;

        Segitiga segi3 = new Segitiga();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("         Segitiga          ");
        System.out.println("===========================");

        System.out.print("Masukkan alas (cm) : ");
        a = input.nextDouble();
        System.out.print("Masukkan tinggi (cm) : ");
        t = input.nextDouble();
        System.out.print("Masukkan sisi 2 (cm) : ");
        s2 = input.nextDouble();
        System.out.print("Masukkan sisi 3 (cm) : ");
        s3 = input.nextDouble();
        
        System.out.println("");
        System.out.println("Luas Segitiga     : " + segi3.hitungLuas(a, t) + " cm2");
        System.out.println("Keliling Segitiga : " + segi3.hitungKeliling(a, s2, s3) + " cm");
    }

    @Override
    public double hitungLuas(double a, double t) {
        double hasil = 0.5 * (a * t);
        return hasil;
    }

    @Override
    public double hitungKeliling(double s1, double s2, double s3) {
        double hasil = s1 + s2 + s3;
        return hasil;
    }
}
