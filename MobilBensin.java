package latihan3;

public class MobilBensin extends Vehicle implements EngineStartable, FuelRefillable {
    public MobilBensin(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melaju di jalan raya menggunakan tenaga mesin bensin.");
    }

    @Override
    public void startEngine() {
        System.out.println(nama + ": Menyalakan mesin bensin...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println(nama + ": Mengisi bahan bakar bensin di SPBU...");
    }
}
