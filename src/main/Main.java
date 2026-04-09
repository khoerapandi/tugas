import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Double> daftarRute = new HashMap<>();
        daftarRute.put("Jakarta - Bandung", 150000.0);
        daftarRute.put("Bandung - Surabaya", 450000.0);
        daftarRute.put("Jakarta - Jogja", 350000.0);

        System.out.println("=== DAFTAR RUTE TERSEDIA ===");
        for (String rute : daftarRute.keySet()) {
            System.out.println("- " + rute + " (Harga Dasar: Rp " + daftarRute.get(rute) + ")");
        }


        System.out.print("\nMasukkan Nama Penumpang: ");
        String nama = scanner.nextLine();
        
        System.out.print("Pilih Rute: ");
        String rutePilihan = scanner.nextLine();

        if (!daftarRute.containsKey(rutePilihan)) {
            System.out.println("Rute tidak ditemukan!");
            return;
        }

        System.out.print("Pilih Kelas (Eksekutif/Ekonomi): ");
        String kelas = scanner.nextLine();

        double hargaDasar = daftarRute.get(rutePilihan);
        Tiket tiket;


        if (kelas.equalsIgnoreCase("Eksekutif")) {
            tiket = new TiketEksekutif("EX-" + System.currentTimeMillis() % 1000, nama, hargaDasar);
        } else {
            tiket = new TiketEkonomi("EC-" + System.currentTimeMillis() % 1000, nama, hargaDasar);
        }

    

        System.out.println("       STRUK PEMBELIAN TIKET KAI        ");
        System.out.println("========================================");
        System.out.println("Nama Penumpang  : " + tiket.getNamaPenumpang()); 
        System.out.println("ID Tiket        : " + tiket.getIdTiket());
        System.out.println("Rute            : " + rutePilihan);
        System.out.println("Kelas           : " + (tiket instanceof TiketEksekutif ? "Eksekutif" : "Ekonomi"));
        System.out.println("Harga Dasar     : Rp " + hargaDasar);
        

        if (tiket instanceof LayananTambahan) {
            System.out.println("Biaya Layanan   : Rp " + ((LayananTambahan) tiket).hitungBiayaLayanan());
        }
        

        System.out.println("TOTAL BAYAR     : Rp " + tiket.hitungTotal()); 

        
        scanner.close();
    }
}