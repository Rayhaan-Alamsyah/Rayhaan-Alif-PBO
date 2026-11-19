package latihan1;

public class SMSNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}
