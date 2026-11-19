package latihan2;

/**
 * Model data mahasiswa untuk merepresentasikan entitas nilai secara terstruktur.
 */
public class Student {
    private final String nama;
    private final double tugas;
    private final double uts;
    private final double uas;

    public Student(String nama, double tugas, double uts, double uas) {
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public double getTugas() {
        return tugas;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }
}
