package Task2;

public class DataTypeLimits{
    public static void main(String[]args){
        // Eksplorasi batas nilai untuk setiap tipe data
        System.out.println("=== BATAS NILAI TIPE DATA ===");

        // Byte
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte - Min: " + minByte + ", Max: " + maxByte);

        // TODO: Lakukan hal yang sama untuk short, int, long, float, double
        // Gunakan .MIN_VALUE dan .MAX_VALUE untuk setiap tipe

        //Short
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short - Min: " + minShort + ", Max: " + maxShort);

        //Double
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double - Min: " + minDouble + ", Max: " + maxDouble);

        //Long
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long - Min: " + minLong + ", Max: " + maxLong);

        //Int
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Int - Min: " + minInt + ", Max: " + maxInt);

        //Float
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float - Min: " + minFloat + ", Max: " + maxFloat);

        // Eksperimen: Coba assign nilai di luar batas
        // byte testByte = 200; // Uncomment dan lihat apa yang terjadi

        // Test dengan operasi yang menyebabkan overflow
        byte result = (byte)(maxByte + 1);
        System.out.println("Overflow byte: " + maxByte + " + 1 = " + result);

        short overflowShort = (short)(maxShort + 1);
        System.out.println("Overflow short: " + maxShort + " + 1 = " + overflowShort);

        double overflowDouble = (double)(maxDouble + 1);
        System.out.println("Overflow double: " + maxDouble + " + 1 = " + overflowDouble);

        long overflowLong = (long)(maxLong + 1);
        System.out.println("Overflow long: " + maxLong + " + 1 = " + overflowLong);

        int overflowInt = (int)(maxInt + 1);
        System.out.println("Overflow int: " + maxInt + " + 1 = " + overflowInt);

        float overflowFloat = (float)(maxFloat + 1);
        System.out.println("Overflow float: " + maxFloat + " + 1 = " + overflowFloat);
    }
}
