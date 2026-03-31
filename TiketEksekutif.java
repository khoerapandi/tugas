public class TiketEksekutif extends Tiket implements LayananTambahan {
    
    public TiketEksekutif(String id, String nama, double harga) {
        // Harus ada 3 parameter: id, nama, harga
        super(id, nama, harga); 
    }

    @Override
    public double hitungTotal() {
        return hargaDasar + hitungBiayaLayanan();
    }

    @Override
    public double hitungBiayaLayanan() {
        return 50000;
    }
}