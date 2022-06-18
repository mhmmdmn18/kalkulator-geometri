package Main;
import BangunDatar.MenuDatar;
import BangunRuang.MenuRuang;
import java.util.Scanner;
import java.awt.Robot;
import java.awt.AWTException;

public class Main {
    private static int pilih;
    
    public static void main(String[] args) {
        System.out.println("""
                           =================================
                                  KALKULATOR GEOMETRI       
                           ================================= 
                           Program Menghitung: 
                           - Luas & Keliling (Bangun Datar)
                           - Luas & Volume (Bangun Ruang) """);
        
        Main.Menu();
    }

    public static void Menu() {
        Scanner masukan = new Scanner(System.in); 
        
        do {
            System.out.println("""
                               
                             --------------------------
                                    Menu Pilihan 
                             --------------------------
                             [1] Bangun Datar 
                             [2] Bangun Ruang 
                             [0] Keluar 
                             -------------------------- """); 
            System.out.print("Masukkan pilihan kamu : "); 
            pilih = masukan.nextInt();
            switch(pilih) {
                case 1 -> { Main.ClearScreen(); MenuDatar.MenuDatar(); break; }
                case 2 -> { Main.ClearScreen(); MenuRuang.MenuRuang(); break; }
                case 0 -> { System.out.println("\nKeluar dari program..."); }
                default -> System.out.println("Pilhan tidak tersedia!"); 
            }
            
            break;
            
        } while (pilih != 0);
    }
    
    public static void ClearScreen() {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17); // Holds CTRL key.
            pressbot.keyPress(76); // Holds L key.
            pressbot.keyRelease(17); // Releases CTRL key.
            pressbot.keyRelease(76); // Releases L key.
            for(int time=0;time<99999;time++){System.out.print("");}
            System.out.println("""
                           =================================
                                  KALKULATOR GEOMETRI       
                           ================================= 
                           Program Menghitung: 
                           - Luas & Keliling (Bangun Datar)
                           - Luas & Volume (Bangun Ruang) """);
        } catch (AWTException ex) {
            System.out.println("Something went wrong.");
        }
    }
}
