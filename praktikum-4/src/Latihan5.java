import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > terbesar) {
                terbesarKedua = terbesar;
                terbesar = num;
            } else if (num > terbesarKedua && num != terbesar) {
                terbesarKedua = num;
            }
        }

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua (semua elemen mungkin sama).");
        } else {
            System.out.println("Nilai terbesar kedua adalah: " + terbesarKedua);
        }
    }
}
