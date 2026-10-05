import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan untuk tabel perkalian: ");
        int bilangan = input.nextInt();

        System.out.println("Tabel Perkalian " + bilangan + " (1 - 10):");
        for (int i = 1; i <= 10; i++) {
            int hasil = bilangan * i;
            System.out.println(bilangan + " x " + i + " = " + hasil);
        }

        input.close();
    }
}