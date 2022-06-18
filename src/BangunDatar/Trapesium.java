package BangunDatar;
import java.util.Scanner;

public class Trapesium extends BangunDatarImpl{
    public static void Main() {
        double a, b, t, s3, s4;
        
        Trapesium trap = new Trapesium();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("         Trapesium         ");
        System.out.println("===========================");

        System.out.print("Masukkan alas 1 (cm) : ");
        a = input.nextDouble();
        System.out.print("Masukkan alas 2 (cm) : ");
        b = input.nextDouble();
        System.out.print("Masukkan tinggi (cm) : ");
        t = input.nextDouble();
        System.out.print("Masukkan sisi 3 (cm) : ");
        s3 = input.nextDouble();
        System.out.print("Masukkan sisi 4 (cm) : ");
        s4 = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Trapesium     : " + trap.hitungLuas(a, b, t) + " cm2");
        System.out.println("Keliling Trapesium : " + trap.hitungKeliling(a, b, s3, s4) + " cm");
    }

    @Override
    public double hitungLuas(double a, double b, double t) {
        double hasil = 0.5 * (a + b) * t;
        return hasil;
    }

    @Override
    public double hitungKeliling(double s1, double s2, double s3, double s4) {
        double hasil = s1 + s2 + s3 + s4;
        return hasil;
    }
}
