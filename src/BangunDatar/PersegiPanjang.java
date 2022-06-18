package BangunDatar;
import java.util.Scanner;

public class PersegiPanjang extends BangunDatarImpl{
    public static void Main() {
        double p, l;

        PersegiPanjang panjang = new PersegiPanjang();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("      Persegi Panjang      ");
        System.out.println("===========================");
        System.out.print("Masukkan panjang (cm) : ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar (cm)   : ");
        l = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Persegi Panjang     : " + panjang.hitungLuas(p, l) + " cm2");
        System.out.println("Keliling Persegi Panjang : " + panjang.hitungKeliling(p, l) + " cm");
    }

    @Override
    public double hitungLuas(double p, double l) {
        double hasil = p * l;
        return hasil;
    }

    @Override
    public double hitungKeliling(double p, double l) {
        double hasil = 2 * (p + l);
        return hasil;
    }
}
