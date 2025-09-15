package Task4;

import java.util.Scanner;

public class BiodataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== INPUT BIODATA MAHASISWA ===");

        // Input data menggunakan method Scanner yang tepat
        System.out.print("Nama Lengkap: ");
        String nama = scanner.nextLine();

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Umur: ");
        int umur = scanner.nextInt();

        System.out.print("IPK: ");
        double ipk = scanner.nextDouble();

        System.out.print("Tinggi Badan (cm): ");
        float tinggiBadan = scanner.nextFloat();

        System.out.print("Status Aktif (true/false): ");
        boolean statusAktif = scanner.nextBoolean();

        // TODO: Tambahkan input untuk:
        // - Semester saat ini (int)
        // - Jurusan (String)
        // - Tahun masuk (int)

        System.out.print("Semester saat ini: ");
        int semesterSaatini = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Jurusan: ");
        String jurusanKuliah = scanner.nextLine();

        System.out.print("Tahun masuk: ");
        int tahunMasukkuliah = scanner.nextInt();

        // Output biodata lengkap
        System.out.println("\\n=== BIODATA LENGKAP ===");
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Umur      : " + umur + " tahun");
        System.out.println("IPK       : " + ipk);
        System.out.println("Tinggi    : " + tinggiBadan + " cm");
        System.out.println("Status    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Semester saat ini    : " + semesterSaatini);
        System.out.println("Jurusan   : " + jurusanKuliah);
        System.out.println("Tahun masuk  : " + tahunMasukkuliah);

        scanner.close();
    }
}

