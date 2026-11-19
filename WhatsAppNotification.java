package latihan1;

public class WhatsAppNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}
