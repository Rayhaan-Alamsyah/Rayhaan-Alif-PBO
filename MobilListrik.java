package latihan3;

public class MobilListrik extends Vehicle implements EngineStartable, BatteryChargeable {
    public MobilListrik(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melaju senyap menggunakan motor listrik.");
    }

    @Override
    public void startEngine() {
        System.out.println(nama + ": Mengaktifkan sistem penggerak motor listrik...");
    }

    @Override
    public void isiBaterai() {
        System.out.println(nama + ": Mengisi daya baterai di stasiun charging...");
    }
}
