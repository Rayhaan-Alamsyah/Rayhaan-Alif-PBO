package latihan1;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas layanan notifikasi yang bergantung pada abstraksi NotificationChannel (DIP & OCP).
 * Tidak perlu diubah ketika ada penambahan platform notifikasi baru.
 */
public class NotificationService {
    private final List<NotificationChannel> channels = new ArrayList<>();

    public void addChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    public void sendToAll(String message) {
        for (NotificationChannel channel : channels) {
            channel.send(message);
        }
    }

    public void sendSingle(NotificationChannel channel, String message) {
        channel.send(message);
    }
}
