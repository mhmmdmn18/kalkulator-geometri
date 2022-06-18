package BangunDatar;
import java.util.Scanner;

public class LayangLayang extends BangunDatarImpl {
    public static void Main() {
        double d1, d2, a, b;
        
        LayangLayang lay = new LayangLayang();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("       Layang-Layang       ");
        System.out.println("===========================");

        System.out.print("Masukkan diagonal 1 (cm) : ");
        d1 = input.nextDouble();
        System.out.print("Masukkan diagonal 2 (cm) : ");
        d2 = input.nextDouble();
        System.out.print("Masukkan alas 1 (cm)     : ");
        a = input.nextDouble();
        System.out.print("Masukkan alas 2 (cm)     : ");
        b = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Trapesium     : " + lay.hitungLuas(d1, d2) + " cm2");
        System.out.println("Keliling Trapesium : " + lay.hitungKeliling(a, b) + " cm");
    }

    @Override
    public double hitungLuas(double d1, double d2) {
        double hasil = 0.5 * d1 * d2;
        return hasil;
    }

    @Override
    public double hitungKeliling(double s1, double s2) {
        double hasil = 2 * s1 + 2 * s2;
        return hasil;
    }
}
