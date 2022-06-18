package BangunRuang;
import java.util.Scanner;

public class Kubus extends BangunRuangImpl {
    public static void Main() {
        double s;

        Kubus kubus = new Kubus();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("           Kubus           ");
        System.out.println("===========================");
        System.out.print("Masukkan sisi (cm) : ");
        s = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Kubus     : " + kubus.hitungLuas(s) + " cm2");
        System.out.println("Volume Kubus   : " + kubus.hitungVolume(s) + " cm3");
    }

    @Override
    public double hitungLuas(double s1) {
        double hasil = 6 * s1 * s1;
        return hasil;
    }

    @Override
    public double hitungVolume(double s1) {
        double hasil = s1 * s1 * s1;
        return hasil;
    }
}
