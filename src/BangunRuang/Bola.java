package BangunRuang;
import java.util.Scanner;

public class Bola extends BangunRuangImpl {
    public static void Main() {
        double s, r, t;

        Bola bola = new Bola();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("           Bola            ");
        System.out.println("===========================");
        System.out.print("Masukkan jari-jari (cm) : ");
        r = input.nextDouble();

        System.out.println("");
        System.out.println("Luas Bola     : " + bola.hitungLuas(r) + " cm2");
        System.out.println("Volume Bola   : " + bola.hitungVolume(r) + " cm3");
    }

    
    @Override
    public double hitungLuas(double r) {
        double hasil = 4 * Math.PI * r * r;
        return hasil;
    }

    @Override
    public double hitungVolume(double r) {
        double hasil = 4 * Math.PI * r * r * r / 3;
        return hasil;
    }
}
