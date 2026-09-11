import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {

        // Latihan 4: Konversi suhu Celsius ke Fahrenheit
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan suhu Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Suhu Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
