package latihan1;

/**
 * Contoh ekstensi kanal baru (Telegram) sesuai Open-Closed Principle (OCP):
 * ditambahkan sebagai kelas baru tanpa memodifikasi NotificationService atau kanal lain.
 */
public class TelegramNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Telegram: " + message);
    }
}
