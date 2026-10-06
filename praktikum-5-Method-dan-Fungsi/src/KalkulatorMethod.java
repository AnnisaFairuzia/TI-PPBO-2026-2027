import java.util.Scanner;

public class KalkulatorMethod {

    static double tambah(double a, double b) {
        return a + b;
    }

    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        return a / b;
    }

    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (double hasil : riwayatHasil) {
            if (hasil > maksimum) {
                maksimum = hasil;
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;

        int pilihan;

        do {
            System.out.println("\n=== KALKULATOR METHOD ===");
            System.out.println("1. Tambah");
            System.out.println("2. Tambah 3 Angka");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = input.nextInt();

            double a, b, hasil;

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = tambah(a, b);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    System.out.print("Masukkan angka ketiga: ");
                    double c = input.nextDouble();

                    hasil = tambah(a, b, c);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kurang(a, b);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kali(a, b);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = bagi(a, b);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 6:
                    System.out.print("Masukkan angka: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    b = input.nextDouble();

                    hasil = pangkat(a, b);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 7:
                    System.out.print("Masukkan angka: ");
                    a = input.nextDouble();

                    hasil = akarKuadrat(a);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 8:
                    if (jumlahRiwayat > 0) {
                        double[] riwayat = new double[jumlahRiwayat];

                        for (int i = 0; i < jumlahRiwayat; i++) {
                            riwayat[i] = riwayatHasil[i];
                        }

                        System.out.println("Hasil maksimum: "
                                + riwayatKeMaksimum(riwayat));
                    }

                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 8);

        input.close();
    }
}