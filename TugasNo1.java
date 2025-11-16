import java.util.Scanner;
public class TugasNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Memasukkan banyaknya nilai mahasiswa yang diinput
        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlah = scanner.nextInt();
        int[] nilai = new int[jumlah];

        // Memasukkan Input Nilai Mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        // Menghitung Nilai Rata-rata
        int total = 0;
        int max = nilai[0];
        int min = nilai[0];

        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
            
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        } 
        double rataRata = (double) total / jumlah;

        // Output menampilkan semua hasil yang telah dimasukkan
       System.out.println("\n--- Hasil ---");
       System.out.println("Daftar Nilai Mahasiswa:");
       for (int i = 0; i < jumlah; i++) {
        System.out.println("Nilai Mahasiswa " + (i + 1) + ": " + nilai[i]);
       }
 
       System.out.println("Nilai Tertinggi: " + max);   
       System.out.println("Nilai Terendah: " + min);
       System.out.println("Nilai rata-rata: " + rataRata);

    }
}