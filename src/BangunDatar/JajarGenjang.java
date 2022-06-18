package BangunDatar;
import java.util.Scanner;

public class JajarGenjang extends BangunDatarImpl {
    public static void Main() {
        double p, l, t;
        
        JajarGenjang jajar = new JajarGenjang();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("       Jajar Genjang       ");
        System.out.println("===========================");

        System.out.print("Masukkan panjang (cm) : ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar (cm)   : ");
        l = input.nextDouble();
        System.out.print("Masukkan tinggi (cm)  : ");
        t = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Jajar Genjang     : " + jajar.hitungLuas(p, t) + " cm2");
        System.out.println("Keliling Jajar Genjang : " + jajar.hitungKeliling(p, l) + " cm");
    }

    @Override
    public double hitungLuas(double p, double t) {
        double hasil = p * t;
        return hasil;
    }

    @Override
    public double hitungKeliling(double p, double l) {
        double hasil = 2 * p + 2 * l;
        return hasil;
    }
}
