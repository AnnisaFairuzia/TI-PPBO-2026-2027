import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // KKM untuk menentukan mahasiswa lulus
        int kkm = 70;

        // Meminta jumlah mahasiswa
        System.out.print("Jumlah mahasiswa: ");
        int n = input.nextInt();

        // Membuat array sesuai jumlah mahasiswa
        int[] nilai = new int[n];

        // Memasukkan nilai setiap mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan nilai sebelum diurutkan
        System.out.println("\n=== HASIL PENGOLAHAN NILAI ===");

        System.out.print("Nilai sebelum diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        // Menghitung total, nilai tertinggi, nilai terendah,
        // jumlah mahasiswa lulus, dan tidak lulus
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            if (nilai[i] >= kkm) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata
        double rataRata = (double) total / n;

        System.out.println("\nRata-rata kelas : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Jumlah lulus    : " + jumlahLulus);
        System.out.println("Tidak lulus     : " + jumlahTidakLulus);

        // Bubble Sort dari kecil ke besar
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Menampilkan nilai setelah diurutkan
        System.out.print("Nilai sesudah diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        input.close();
    }
}
