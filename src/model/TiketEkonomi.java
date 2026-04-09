public class TiketEkonomi extends Tiket {
    public TiketEkonomi(String id, String nama, double harga) {
        super(id, nama, harga);
    }

    @Override
    public double hitungTotal() {
        return hargaDasar; 
    }
}