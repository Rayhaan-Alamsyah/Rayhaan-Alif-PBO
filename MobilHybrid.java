package latihan3;

/**
 * Contoh penambahan jenis kendaraan baru (Mobil Hybrid) sesuai Open-Closed Principle (OCP):
 * cukup membuat kelas baru dan mengombinasikan interface yang relevan tanpa mengubah kelas lama.
 */
public class MobilHybrid extends Vehicle implements EngineStartable, FuelRefillable, BatteryChargeable {
    public MobilHybrid(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melaju dengan kombinasi motor listrik dan mesin bensin.");
    }

    @Override
    public void startEngine() {
        System.out.println(nama + ": Menyalakan sistem hybrid...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println(nama + ": Mengisi tangki bahan bakar...");
    }

    @Override
    public void isiBaterai() {
        System.out.println(nama + ": Mengisi daya baterai hybrid...");
    }
}
