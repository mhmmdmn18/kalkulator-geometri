package BangunRuang;
import java.util.Scanner;

public class Kerucut extends BangunRuangImpl {
    public static void Main() {
        double s, r, t;

        Kerucut kerucut = new Kerucut();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("          Kerucut          ");
        System.out.println("===========================");
        System.out.print("Masukkan jari-jari (cm) : ");
        r = input.nextDouble();
        System.out.print("Masukkan sisi (cm) : ");
        s = input.nextDouble();
        System.out.print("Masukkan tinggi (cm)    : ");
        t = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Kerucut     : " + kerucut.hitungLuas(r, s) + " cm2");
        System.out.println("Volume Kerucut   : " + kerucut.hitungVolume(r, t) + " cm3");
    }

    
    @Override
    public double hitungLuas(double r, double s) {
        double hasil = Math.PI * r * (r + s);
        return hasil;
    }

    @Override
    public double hitungVolume(double r, double t) {
        double hasil = (Math.PI * r * r * t) / 3;
        return hasil;
    }
}
