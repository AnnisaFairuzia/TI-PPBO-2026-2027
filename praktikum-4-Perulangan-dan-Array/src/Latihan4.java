import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int total = 0;

        System.out.println("Masukkan elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriks[" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;
            for (int j = 0; j < 3; j++) {
                jumlahBaris += mat[i][j];
                total += mat[i][j];
            }
            System.out.println("Jumlah baris " + (i + 1) + ": " + jumlahBaris);
        }
        System.out.println("Jumlah seluruh elemen matriks: " + total);
    }
}