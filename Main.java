public class Main {
    public static void main(String[] args) {
        // Polymorphism
       Tiket tiket1 = new TiketEksekutif("KA-EX-7788", "hurrr", 500000);

        
        System.out.println("       STRUK PEMBELIAN TIKET KAI        ");
        System.out.println("Nama Penumpang  : " + tiket1.getNamaPenumpang());
        System.out.println("ID Tiket        : " + tiket1.getIdTiket());
        System.out.println("Jenis Tiket     : " + tiket1.getJenisTiket());
        System.out.println("Harga Dasar     : Rp " + tiket1.getHargaDasar());
        System.out.println("Biaya Layanan   : Rp " + tiket1.getBiayaLayanan());
        System.out.println("----------------------------------------");
        System.out.println("TOTAL BAYAR     : Rp 550.000");
        System.out.println("Terima kasih, " + tiket1.getNamaPenumpang() + "!");
    }
}