public class Latihan3 {

    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        }

        return celsius;
    }

    public static void main(String[] args) {
        System.out.println("Celsius ke Fahrenheit: " + konversiSuhu(25));
        System.out.println("Celsius ke Kelvin: " + konversiSuhu(25, "Kelvin"));
        System.out.println("Celsius ke Fahrenheit: " + konversiSuhu(25, "Fahrenheit"));
    }
}