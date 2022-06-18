package BangunDatar;
import Main.Main;
import java.util.Scanner;

public class MenuDatar {
    private static int pilih;
    
    public static void MenuDatar() {
        String konfirmasi;
        Scanner masukan = new Scanner(System.in); 
        
        do {
            konfirmasi = "Y";
            if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) { 
                System.out.println("""
                                   
                                 --------------------------
                                        Bangun Datar 
                                 --------------------------
                                 [1] Persegi 
                                 [2] Persegi Panjang 
                                 [3] Segitiga 
                                 [4] Lingkaran 
                                 [5] Trapesium 
                                 [6] Jajar Genjang 
                                 [7] Belah Ketupat 
                                 [8] Layang-Layang
                                 [9] Menu Awal
                                 [0] Keluar 
                                 -------------------------- """); 
                System.out.print("Masukkan pilihan kamu : "); 
                pilih = masukan.nextInt();
            }
            
            switch(pilih) {
            
                case 1 -> {
                    Main.ClearScreen(); 
                    Persegi.Main();
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
                    PersegiPanjang.Main();
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
                    Segitiga.Main();
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
                    Lingkaran.Main();
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
                    Trapesium.Main();
                    System.out.print("\nKembali ke menu? (Y/N): ");
                    konfirmasi = masukan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        Main.ClearScreen(); 
                        continue;
                    } else {
                        System.out.println("\nKeluar dari program..."); break;
                    }
                }
                
                case 6 -> {
                    Main.ClearScreen();
                    JajarGenjang.Main();
                    System.out.print("\nKembali ke menu? (Y/N): ");
                    konfirmasi = masukan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        Main.ClearScreen(); 
                        continue;
                    } else {
                        System.out.println("\nKeluar dari program..."); break;
                    }
                }
                
                case 7 -> {
                    Main.ClearScreen();
                    BelahKetupat.Main();
                    System.out.print("\nKembali ke menu? (Y/N): ");
                    konfirmasi = masukan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        Main.ClearScreen(); 
                        continue;
                    } else {
                        System.out.println("\nKeluar dari program..."); break;
                    }
                }
                case 8 -> {
                    Main.ClearScreen();
                    LayangLayang.Main();
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
