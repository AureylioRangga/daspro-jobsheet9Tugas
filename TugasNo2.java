import java.util.Scanner;
public class TugasNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //jumlah pesanan (input nama dan harga)
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 

        String[] nama = new String[jumlah];
        int[] harga = new int[jumlah];

        //input nama makanan/minuman dan harga masing'(input dari pengguna)
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama makanan/minuman ke-" + (i + 1) + ": ");
            nama[i] = scanner.nextLine();

            System.out.print("Harga: ");
            harga[i] = scanner.nextInt();
            scanner.nextLine();
        }

        //hitung total biaya dari semua pesanan yang telah diinput
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        //output tampilan data daftar pesanan dan total biaya
        System.out.println("\n--- DAFTAR PESANAN ---");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + ". " + nama[i] + " - Rp " + harga[i]);
        }
        System.out.println("Total biaya: Rp " + total);
    }
}
