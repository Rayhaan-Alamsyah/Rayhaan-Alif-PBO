package latihan3;

/**
 * Sepeda hanya mewarisi Vehicle tanpa dipaksa mengimplementasikan
 * startEngine(), isiBahanBakar(), maupun isiBaterai() (memenuhi ISP).
 */
public class Sepeda extends Vehicle {
    public Sepeda(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan dikayuh menggunakan pedal.");
    }
}
