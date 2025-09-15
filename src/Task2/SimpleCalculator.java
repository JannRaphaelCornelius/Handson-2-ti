package Task2;

import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA (INTEGER) ===");

        // Input dua angka sebagai Integer (bilangan bulat)
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        // Operasi Integer (hasilnya selalu integer)
        int hasilTambah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
        int hasilKali = angka1 * angka2;

        // --- Penanganan Khusus untuk Pembagian dan Modulus ---

        // 1. Penanganan Modulus (Hasil int, periksa pembagi nol)
        String hasilModStr = (angka2 == 0)
                ? "Operasi modulus dengan nol tidak valid"
                : String.valueOf(angka1 % angka2); // Hasilnya otomatis int


        // 2. Penanganan Pembagian (Hasil harus double)
        // Kita harus "cast" salah satu angka ke (double) agar Java melakukan pembagian desimal
        double hasilBagiDouble = (double) angka1 / angka2; // (cth: 5.0 / 2.0 = 2.5) atau (4.0 / 2.0 = 2.0)

        /*
         * Gunakan ternary bertingkat (nested ternary):
         * 1. Cek dulu: Apakah angka2 == 0?
         * -> Jika YA: Tampilkan error.
         * -> Jika TIDAK: Lanjutkan ke cek kedua:
         * 2. Cek kedua: Apakah hasil pembagiannya (double) jika di-mod 1 hasilnya 0?
         * (Ini adalah trik untuk mengecek apakah 4.0 atau 2.5. Jika 4.0 % 1 = 0. Jika 2.5 % 1 = 0.5)
         * -> Jika YA (hasilnya 0, artinya bilangan bulat seperti 4.0): Cetak sebagai int (cast ke int).
         * -> Jika TIDAK (hasilnya 0.5, artinya desimal): Cetak sebagai double (apa adanya).
         */

        String hasilBagiStr = (angka2 == 0)
                ? "Tidak bisa dibagi dengan nol"                           // Kondisi 1 (Error)
                : (hasilBagiDouble % 1 == 0)                               // Kondisi 2 (Cek apakah bulat)
                ? String.valueOf((int) hasilBagiDouble)                // Hasil jika Kondisi 2 Benar (di-cast ke int)
                : String.valueOf(hasilBagiDouble);                     // Hasil jika Kondisi 2 Salah (biarkan double)


        // Tampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan : " + hasilTambah);
        System.out.println("Pengurangan : " + hasilKurang);
        System.out.println("Perkalian   : " + hasilKali);
        System.out.println("Pembagian   : " + hasilBagiStr); // Akan menampilkan "2.5" atau "2" (bukan "2.0")
        System.out.println("Modulus     : " + hasilModStr);

        scanner.close();
    }
}
