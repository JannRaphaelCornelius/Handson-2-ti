package Task3;

public class DataLossStudy {
    public static void main(String[] args) {
        System.out.println("=== STUDI KASUS DATA LOSS ===");

        // Kasus 1: Sistem Penilaian
        System.out.println("1. Sistem Penilaian:");
        double nilaiAsli = 87.65;
        int nilaiHuruf = (int) nilaiAsli; // Data loss! (Truncation / Pemotongan)

        System.out.println("Nilai asli: " + nilaiAsli);
        System.out.println("Nilai setelah casting ke int: " + nilaiHuruf);
        System.out.println("Data yang hilang (desimal): " + (nilaiAsli - nilaiHuruf));

        // Kasus 2: Populasi Negara
        // (Memperbaiki typo newline dari \\n ke \n)
        System.out.println("\n2. Data Populasi (Contoh Potensi Overflow):");
        long populasiIndonesia = 273_523_615L; // 273 juta+ (Nilai ini masih muat di int)
        int populasiInt = (int) populasiIndonesia;

        System.out.println("Populasi asli (long): " + populasiIndonesia);
        System.out.println("Populasi setelah casting ke int: " + populasiInt + " (Kasus ini aman karena < 2.14 Miliar)");

        // Contoh Overflow Sebenarnya:
        long populasiDunia = 8_000_000_000L; // 8 Miliar (JAUH di atas maks int)
        int populasiDuniaInt = (int) populasiDunia; // Overflow! Data akan terkorupsi/meluap
        System.out.println("Populasi Dunia (long): " + populasiDunia);
        System.out.println("Populasi Dunia (int setelah overflow): " + populasiDuniaInt + " (Data tidak valid!)");

        // TODO: Buat 3 skenario lagi yang mendemonstrasikan data loss:
        // - Konversi mata uang (rupiah ke dollar dengan presisi)
        // - Pengukuran jarak GPS
        // - Perhitungan waktu dengan milidetik

        // Kasus 3: Konversi Mata Uang (Kehilangan Presisi Desimal/Cents)
        System.out.println("\n3. Konversi Mata Uang:");
        double rupiah = 25000.0;
        double kurs = 15000.0;
        double dollarPresisi = rupiah / kurs; // Hasilnya harusnya sekitar 1.6666...

        // Data loss terjadi jika kita mencoba menyimpan hasil presisi ini sebagai integer (kehilangan sen)
        int dollarBulat = (int) dollarPresisi;

        System.out.println("Hasil presisi (double): $ " + dollarPresisi);
        System.out.println("Hasil setelah casting ke int: $ " + dollarBulat);
        System.out.println("Data sen yang hilang: $ " + (dollarPresisi - dollarBulat));


        // Kasus 4: Pengukuran Jarak GPS (Kehilangan Presisi dari Double ke Float)
        System.out.println("\n4. Pengukuran GPS (Double ke Float):");
        // Double memiliki presisi 64-bit (jauh lebih detail)
        double koordinatAkurat = -6.873214598765432;

        // Float hanya memiliki presisi 32-bit. Data akan dibulatkan/dipotong.
        float koordinatFloat = (float) koordinatAkurat; // Data loss!

        System.out.println("Koordinat Double (64-bit): " + koordinatAkurat);
        System.out.println("Koordinat Float (32-bit):  " + koordinatFloat + " (Digit terakhir hilang/berubah)");

        System.out.println("\n5. Perhitungan Waktu (Timestamp Overflow):");
        // System.currentTimeMillis() mengembalikan 'long' karena jumlah milidetik sejak 1970
        // sudah jauh melebihi nilai maksimum 'int' (sekitar 2.14 Miliar).
        long timestampMsLong = System.currentTimeMillis();

        // Memaksa 'long' besar ini ke 'int' menyebabkan overflow parah dan data korup.
        int timestampMsInt = (int) timestampMsLong; // Overflow parah!

        System.out.println("Timestamp Asli (long): " + timestampMsLong);
        System.out.println("Timestamp setelah cast ke int: " + timestampMsInt + " (Nilai tidak lagi mewakili waktu!)");
    }
}