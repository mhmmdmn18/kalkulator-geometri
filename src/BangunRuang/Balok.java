package BangunRuang;
import java.util.Scanner;

public class Balok extends BangunRuangImpl {
    public static void Main() {
        double p, l, t;

        Balok balok = new Balok();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("           Balok           ");
        System.out.println("===========================");
        System.out.print("Masukkan panjang (cm) : ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar (cm)   : ");
        l = input.nextDouble();
        System.out.print("Masukkan tinggi (cm)  : ");
        t = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Balok     : " + balok.hitungLuas(p, l, t) + " cm2");
        System.out.println("Volume Balok   : " + balok.hitungVolume(p, l, t) + " cm3");
    }

    
    @Override
    public double hitungLuas(double p, double l, double t) {
        double hasil = 2 * ((p * l) + (p * t) + (l * t));
        return hasil;
    }

    @Override
    public double hitungVolume(double p, double l, double t) {
        double hasil = p * l * t;
        return hasil;
    }
}
