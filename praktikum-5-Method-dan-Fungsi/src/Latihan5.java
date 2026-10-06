public class Latihan5 {

    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }

        int[] hasil = new int[jumlah];
        int index = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 88};

        int total = hitungTotal(nilai);
        double rataRata = (double) total / nilai.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);

        int[] hasil = filterDiAtasRataRata(nilai);

        System.out.print("Nilai di atas rata-rata: ");

        for (int n : hasil) {
            System.out.print(n + " ");
        }
    }
}