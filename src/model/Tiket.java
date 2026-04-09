public abstract class Tiket {
    private String idTiket;
    protected String namaPenumpang;
    protected double hargaDasar;

    public Tiket(String idTiket, String namaPenumpang, double hargaDasar) {
        this.idTiket = idTiket;
        this.namaPenumpang = namaPenumpang;
        this.hargaDasar = hargaDasar;
    }

    public String getIdTiket() { return idTiket; }
    public String getNamaPenumpang() { return namaPenumpang; } 
    public abstract double hitungTotal();
}