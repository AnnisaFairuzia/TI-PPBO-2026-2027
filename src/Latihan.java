import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //  LATIHAN 1 Menentukan bilangan ganjil atau genap

        System.out.print("\n\nMasukkan bilangan: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan " + angka + " adalah Genap");
        } else {
            System.out.println("Bilangan " + angka + " adalah Ganjil");
        }


        //  LATIHAN 2 Menentukan bilangan terbesar dari tiga bilangan

        System.out.print("\n\nMasukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int c = input.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println("Bilangan terbesar: " + a);
            } else {
                System.out.println("Bilangan terbesar: " + c);
            }
        } else {
            if (b >= c) {
                System.out.println("Bilangan terbesar: " + b);
            } else {
                System.out.println("Bilangan terbesar: " + c);
            }
        }


        //  LATIHAN 3 Menu makanan menggunakan switch-case

        System.out.println("\n\n1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Ayam Geprek");

        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Anda memilih Bakso");
                break;
            case 4:
                System.out.println("Anda memilih Ayam Geprek");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }


        //  LATIHAN 4 menentukan harga tiket berdasarkan umur dan status mahasiswa

        System.out.print("\n\nMasukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        if (mahasiswa && umur < 25) {
            System.out.println("Harga tiket: Rp30.000");
        } else {
            System.out.println("Harga tiket: Rp50.000");
        }


        //  LATIHAN 5 Klasifikasi BMI

        System.out.print("\n\nMasukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        double tinggiMeter = tinggiCm / 100.0;

        double bmi = berat / (tinggiMeter * tinggiMeter);

        System.out.printf("Nilai BMI Anda: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
        input.close();
    }
}