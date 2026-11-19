package latihan1;

/**
 * Abstraksi (Interface) umum untuk kanal notifikasi.
 * Mendukung Interface Segregation Principle (ISP) dan Open-Closed Principle (OCP):
 * setiap platform baru cukup mengimplementasikan interface ini tanpa mengubah kode lama.
 */
public interface NotificationChannel {
    void send(String message);
}
