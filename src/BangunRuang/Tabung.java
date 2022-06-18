package BangunRuang;
import java.util.Scanner;

public class Tabung extends BangunRuangImpl {
    public static void Main() {
        double r, t;

        Tabung tabung = new Tabung();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("          Tabung           ");
        System.out.println("===========================");
        System.out.print("Masukkan jari-jari (cm) : ");
        r = input.nextDouble();
        System.out.print("Masukkan tinggi (cm)    : ");
        t = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Tabung     : " + tabung.hitungLuas(r, t) + " cm2");
        System.out.println("Volume Tabung   : " + tabung.hitungVolume(r, t) + " cm3");
    }

    
    @Override
    public double hitungLuas(double r, double t) {
        double hasil = (2 * Math.PI * r * r) + (2 * Math.PI * r * t);
        return hasil;
    }

    @Override
    public double hitungVolume(double r, double t) {
        double hasil = Math.PI * r * r * t;
        return hasil;
    }
}
