package patterns;

/**
 * Service de notification utilisant le Pattern Singleton
 */
public class NotificationService{
    private static NotificationService instance;

    private NotificationService() {} // Constructeur privé

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void envoyerNotification(String msg) {
        System.out.println("Notification: " + msg);
    }
}