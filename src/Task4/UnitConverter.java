package Task4;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KONVERTER SATUAN ===");
        System.out.println("1. Meter ke Centimeter");
        System.out.println("2. Celsius ke Fahrenheit");
        System.out.println("3. Rupiah ke Dollar (kurs: 15000)");

        System.out.print("Pilih konversi (1-3): ");
        int pilihan = scanner.nextInt();

        switch(pilihan) {
            case 1:
                System.out.print("Masukkan panjang dalam meter: ");
                double meter = scanner.nextDouble();
                double centimeter = meter * 100;
                System.out.println(meter + " meter = " + centimeter + " cm");
                break;

            case 2:
                // TODO: Implementasikan konversi Celsius ke Fahrenheit
                // Rumus: F = (C × 9/5) + 32
                System.out.print("Masukkan suhu dalam celcius: ");
                double celcius = scanner.nextDouble();
                double fahrenheit = (celcius * (9.0 / 5.0)) + 32;
                System.out.println(celcius + "°C = " + fahrenheit + "°F");
                break;

            case 3:
                // TODO: Implementasikan konversi Rupiah ke Dollar
                // Perhatikan penggunaan tipe data yang tepat untuk mata uang
                final double KURS_DOLAR = 15000.0;
                System.out.print("Masukkan jumlah dalam Rupiah (Rp): ");
                double rupiah = scanner.nextDouble();
                double dollar = rupiah / KURS_DOLAR;
                System.out.printf("Rp %.2f = $ %.2f\n", rupiah, dollar);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}

