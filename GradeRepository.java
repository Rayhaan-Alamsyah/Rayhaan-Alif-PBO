package latihan2;

/**
 * Tanggung jawab tunggal 3 (SRP):
 * Hanya menangani penyimpanan data nilai mahasiswa ke database.
 */
public class GradeRepository {
    public void simpanDatabase(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}
