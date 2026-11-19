package latihan1;

public class EmailNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}
