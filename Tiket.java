public abstract class Tiket {
    private String idTiket;
    protected String namaPenumpang; // PASTIKAN ADA INI
    protected double hargaDasar;

    public Tiket(String idTiket, String namaPenumpang, double hargaDasar) {
        this.idTiket = idTiket;
        this.namaPenumpang = namaPenumpang;
        this.hargaDasar = hargaDasar;
    }

    public String getIdTiket() { return idTiket; }
    
    // TAMBAHKAN INI AGAR ERROR DI MAIN HILANG
    public String getNamaPenumpang() { return namaPenumpang; } 
    
    public abstract double hitungTotal();
}