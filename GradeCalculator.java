package latihan2;

/**
 * Tanggung jawab tunggal 1 (SRP):
 * Hanya menangani perhitungan nilai akhir mahasiswa.
 */
public class GradeCalculator {
    public double hitungNilaiAkhir(Student student) {
        return (student.getTugas() * 0.3)
             + (student.getUts() * 0.3)
             + (student.getUas() * 0.4);
    }
}
