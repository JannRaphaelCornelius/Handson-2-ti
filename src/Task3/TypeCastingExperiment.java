package Task3;

public class TypeCastingExperiment {
    public static void main(String[] args) {
        System.out.println("=== EKSPERIMEN TYPE CASTING ===");

        // 1. Implicit Casting (Widening)
        int intValue = 100;
        long longValue = intValue; // Automatic conversion
        double doubleValue = longValue; // Automatic conversion

        System.out.println("Implicit Casting (Aman, tidak ada data loss):");
        System.out.println("int: " + intValue + " -> long: " + longValue + " -> double: " + doubleValue);

        // 2. Explicit Casting (Narrowing) - Tanpa Data Loss
        double preciseValue = 123.0; // Meskipun double, nilainya bulat
        int convertedInt = (int) preciseValue;

        // (Memperbaiki typo newline \\n -> \n)
        System.out.println("\nExplicit Casting (no data loss):");
        System.out.println("double: " + preciseValue + " -> int: " + convertedInt);

        // 3. Explicit Casting - Dengan Data Loss (Truncation/Pemotongan)
        double decimalValue = 123.789;
        int truncatedInt = (int) decimalValue; // Data loss! Seluruh desimal hilang.

        System.out.println("\nExplicit Casting (with data loss/truncation):");
        System.out.println("double: " + decimalValue + " -> int: " + truncatedInt + " (Data .789 hilang)");

        // 4. Overflow Example (Int ke Byte)
        // Byte hanya menampung nilai dari -128 hingga 127.
        int largeInt = 300; // 300 jauh di luar jangkauan byte
        byte overflowByte = (byte) largeInt; // Data "meluap" dan "wrap around"

        // TODO: Eksperimen dengan kasus-kasus berikut:
        // - Convert long ke int dengan nilai besar
        // - Convert float ke int
        // - Convert double ke float
        // Analisis kapan terjadi data loss dan kapan tidak

        System.out.println("\nOverflow Example (Int ke Byte):");
        System.out.println("int: " + largeInt + " -> byte: " + overflowByte + " (Nilai tidak valid/korup)");

        System.out.println("\n=== EKSPERIMEN TAMBAHAN (TODO) ===");

        // 5. Convert long ke int dengan nilai besar (Overflow)
        // Nilai maks int adalah 2,147,483,647. Kita gunakan 3 Miliar.
        long veryLargeLong = 3_000_000_000L; // 3 Miliar (melebihi maks int)
        int intFromLargeLong = (int) veryLargeLong; // Data loss! Terjadi Overflow.

        System.out.println("\n5. Long ke Int (Overflow):");
        System.out.println("long: " + veryLargeLong);
        System.out.println("int: " + intFromLargeLong + " (Nilai korup karena overflow)");

        // 6. Convert float ke int (Truncation)
        // Sama seperti double ke int, casting float ke int akan membuang semua data desimal.
        float floatValue = 456.999f; // f menunjukkan ini adalah float
        int intFromFloat = (int) floatValue; // Data loss! (Truncation)

        System.out.println("\n6. Float ke Int (Truncation):");
        System.out.println("float: " + floatValue);
        System.out.println("int: " + intFromFloat + " (Data .999 hilang)");

        // 7. Convert double ke float (Loss of Precision / Kehilangan Presisi)
        // Double (64-bit) memiliki presisi digit desimal yang jauh lebih banyak daripada float (32-bit).
        double highlyPreciseDouble = 0.12345678901234567;
        float lessPreciseFloat = (float) highlyPreciseDouble; // Data loss! Digit presisi berkurang.

        System.out.println("\n7. Double ke Float (Loss of Precision):");
        System.out.println("double (64-bit): " + highlyPreciseDouble);
        System.out.println("float (32-bit):  " + lessPreciseFloat + " (Digit di akhir dibulatkan/hilang)");
    }
}