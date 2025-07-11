
package Woodle;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WoodleBeraksi {
    public static void main(String[] args) {
        //io
        Scanner input = new Scanner(System.in);
        boolean ulangi;

        do {
            Kata kata;

            System.out.println("\n=== WOODLE ===");
            System.out.println("Pilih kategori:");
            System.out.println("1. Hewan");
            System.out.println("2. Buah");

            int pilih = 0;
            while (true) {
                try {
                    System.out.print("Pilihan [1/2]: ");
                    String inputLine = input.nextLine();
                    if (inputLine.isEmpty()) {
                        throw new IllegalArgumentException("Input tidak boleh kosong.");
                    }
                    pilih = Integer.parseInt(inputLine);
                    if (pilih != 1 && pilih != 2) {
                        throw new IllegalArgumentException("Masukkan harus 1 atau 2!");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka 1 atau 2.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            //seleksi
            if (pilih == 1) {
                kata = new KataHewan();     
            } else {
                kata = new KataBuah();
            }            
            //menjalankan poli
             Woodle.infoKategori(kata.getKategori());
            
            int kesempatan = 10;
            boolean menang = false;
            //Array
            Woodle[] daftarTebakan = new Woodle[kesempatan];
            for (int i = 0; i < kesempatan; i++) {
                String t;
                while (true) {
                    try {
                        System.out.print("\nTebakan ke-" + (i + 1) + ": ");
                        t = input.nextLine().toUpperCase();

                        if (!t.matches("[A-Z]+")) {
                            throw new IllegalArgumentException("Input hanya boleh huruf tanpa angka atau simbol!");
                        }

                        if (t.length() != kata.getKata().length()) {
                            throw new IllegalArgumentException("Kata harus " + kata.getKata().length() + " huruf!");
                        }
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                //objek otomatis random sesuai kategori
                Woodle word = new Woodle(t, kata.getKata());
                daftarTebakan[i] = word;
                
                //menjalankan poli
                Woodle.infoTabel(daftarTebakan);

                if (t.equalsIgnoreCase(kata.getKata())) {
                    menang = true;
                    break;
                }
            }

            //Seleksi
            if (menang) {
                System.out.println("\nSELAMAT! Kamu menebak kata kategori [" + kata.getKategori() + "]: " + kata.getKata());
            } else {
                System.out.println("\nKesempatan habis. Kata yang benar dari kategori [" + kata.getKategori() + "] adalah: " + kata.getKata());
            }

            System.out.print("\nApakah kamu ingin bermain lagi? (y/any key): ");
            String jawab = input.nextLine().toLowerCase();
            ulangi = jawab.equals("y");

        } while (ulangi);
        
        System.out.println("\nTerima kasih sudah bermain!");
        input.close();
    }
}

