import java.util.Scanner;
public class TugasNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // daftar menu yang tersedia
        String[] menu ={"Nasi Goreng", "Mie Goreng", 
        "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        // nama makanan yang ingin dicari (input dari pengguna)
        System.out.print("Masukkan nama makananan yang ingin dicari: ");
        String cari = scanner.nextLine();
        
        // Algoritma Linear Search
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
               ditemukan = true;
               break;
            }
        }

        // output hasil 
        if (ditemukan) {
        System.out.println("Makanan \"" + cari + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + cari + "\" tidak tersedia di menu.");
    }
    }
}