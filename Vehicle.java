package latihan3;

/**
 * Kelas abstrak dasar untuk seluruh jenis kendaraan (mendukung OCP).
 * Hanya memuat atribut dan perilaku umum yang dimiliki semua kendaraan.
 */
public abstract class Vehicle {
    protected String nama;

    public Vehicle(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void bergerak();
}
