package BangunRuang;
import Main.Main;
import java.util.Scanner;

public class MenuRuang {
    private static int pilih;
    
    public static void MenuRuang() {
        String konfirmasi;
        Scanner masukan = new Scanner(System.in); 
        
        do {
            konfirmasi = "Y";
            if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) { 
                System.out.println("""
                                   
                                 --------------------------
                                        Bangun Ruang 
                                 --------------------------
                                 [1] Kubus 
                                 [2] Balok
                                 [3] Kerucut
                                 [4] Bola
                                 [5] Tabung
                                 [9] Menu Awal
                                 [0] Keluar 
                                 -------------------------- """); 
                System.out.print("Masukkan pilihan kamu : "); 
                pilih = masukan.nextInt();
            }
            
            switch(pilih) {
            
                case 1 -> {
                    Main.ClearScreen();
                    Kubus.Main();
                    System.out.print("\nKembali ke menu? (Y/N): ");
                    konfirmasi = masukan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        Main.ClearScreen(); 
                        continue;
                    } else {
                        System.out.println("\nKeluar dari program..."); break;
                    }
                }
                
                case 2 -> {
                    Main.ClearScreen();
                    Balok.Main();
                    System.out.print("\nKembali ke menu? (Y/N): ");
                    konfirmasi = masukan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        Main.ClearScreen(); 
                        continue;
                    } else {
                        System.out.println("\nKeluar dari program..."); break;
                    }
                }
                
                case 3 -> {
                    Main.ClearScreen();
                    Kerucut.Main();
                    System.out.print("\nKembali ke menu? (Y/N): ");
                    konfirmasi = masukan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        Main.ClearScreen(); 
                        continue;
                    } else {
                        System.out.println("\nKeluar dari program..."); break;
                    }
                }
                
                case 4 -> {
                    Main.ClearScreen();
                    Bola.Main();
                    System.out.print("\nKembali ke menu? (Y/N): ");
                    konfirmasi = masukan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        Main.ClearScreen(); 
                        continue;
                    } else {
                        System.out.println("\nKeluar dari program..."); break;
                    }
                }
                
                case 5 -> {
                    Main.ClearScreen();
                    Tabung.Main();
                    System.out.print("\nKembali ke menu? (Y/N): ");
                    konfirmasi = masukan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        Main.ClearScreen(); 
                        continue;
                    } else {
                        System.out.println("\nKeluar dari program..."); break;
                    }
                }
                
                case 9 -> { Main.ClearScreen(); Main.Menu(); break; }
                case 0 -> { System.out.println("\nKeluar dari program..."); }
                default -> System.out.println("Pilhan tidak tersedia!"); 
            }
            
            break;
            
        } while (pilih != 0);
    }
}
