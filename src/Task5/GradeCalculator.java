package Task5;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM PERHITUNGAN NILAI ===");

        // TODO: Tambahkan fitur:
        // - Validasi input (nilai harus 0-100)
        // - Konversi nilai ke skala 4.0
        // - Status kelulusan (lulus jika >= 60)

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Mata Kuliah: ");
        String mataKuliah = scanner.nextLine();

        // Input komponen nilai dan validasi
        System.out.print("Nilai Tugas (0-100): ");
        double nilaiTugas = scanner.nextDouble();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Error: Nilai harus antara 0 dan 100. Program berhenti.");
            scanner.close();
            return; // Menghentikan eksekusi program
        }

        System.out.print("Nilai UTS (0-100): ");
        double nilaiUTS = scanner.nextDouble();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Error: Nilai harus antara 0 dan 100. Program berhenti.");
            scanner.close();
            return;
        }

        System.out.print("Nilai UAS (0-100): ");
        double nilaiUAS = scanner.nextDouble();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Error: Nilai harus antara 0 dan 100. Program berhenti.");
            scanner.close();
            return;
        }


        // Hitung nilai akhir (bobot: Tugas 30%, UTS 30%, UAS 40%)
        double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);

        // Tentukan grade huruf
        char gradeHuruf;
        String keterangan;
        double nilaiIP;

        if (nilaiAkhir >= 85) {
            gradeHuruf = 'A';
            keterangan = "Sangat Baik";
            nilaiIP = 4.0;
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = 'B';
            keterangan = "Baik";
            nilaiIP = 3.0;
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = 'C';
            keterangan = "Cukup";
            nilaiIP = 2.0;
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = 'D';
            keterangan = "Kurang";
            nilaiIP = 1.0;
        } else {
            gradeHuruf = 'E';
            keterangan = "Gagal";
            nilaiIP = 0.0;
        }

        // Status kelulusan (lulus jika >= 60, atau nilai C ke atas)
        String statusLulus = (nilaiAkhir >= 60) ? "Lulus" : "Tidak Lulus";


        // Output hasil (Memperbaiki typo \n menjadi \n)
        System.out.println("\n=== HASIL PERHITUNGAN NILAI ===");
        System.out.println("Mahasiswa     : " + nama);
        System.out.println("Mata Kuliah   : " + mataKuliah);
        System.out.println("Nilai Tugas   : " + nilaiTugas);
        System.out.println("Nilai UTS     : " + nilaiUTS);
        System.out.println("Nilai UAS     : " + nilaiUAS);
        System.out.println("------------------------------------");
        System.out.println("Nilai Akhir   : " + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade         : " + gradeHuruf);
        System.out.println("Keterangan    : " + keterangan);
        System.out.println("Nilai IP (4.0): " + nilaiIP);
        System.out.println("Status        : " + statusLulus);

        scanner.close();
    }
}