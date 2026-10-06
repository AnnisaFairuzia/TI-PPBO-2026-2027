import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== HITUNG TARIF LISTRIK ===");
        System.out.println("1. 450 VA");
        System.out.println("2. 900 VA");
        System.out.println("3. 1300 VA");
        System.out.println("4. 2200 VA");
        System.out.println("5. >2200 VA");

        System.out.print("Pilih daya listrik: ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        if (kwh < 0 || kwh == 0) {
            System.out.println("Pemakaian listrik harus lebih dari 0 kWh.");
        } else {

            double tarif = 0;

            switch (pilihan) {
                case 1:
                    tarif = 415;
                    break;
                case 2:
                    tarif = 605;
                    break;
                case 3:
                    tarif = 1444.70;
                    break;
                case 4:
                    tarif = 1444.70;
                    break;
                case 5:
                    tarif = 1699.53;
                    break;
                default:
                    System.out.println("Pilihan daya tidak valid.");
                    input.close();
                    return;
            }

            double total = kwh * tarif;

            System.out.println("\n=== HASIL PERHITUNGAN ===");
            System.out.println("Golongan daya: " + pilihan);
            System.out.println("Pemakaian listrik: " + kwh + " kWh");
            System.out.println("Tarif per kWh: Rp" + tarif);
            System.out.println("Total tarif listrik: Rp" + total);
        }

        input.close();
    }
}