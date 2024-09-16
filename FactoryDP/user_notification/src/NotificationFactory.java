public class NotificationFactory {
    public Notification createNotification(String channel){
        if (channel == null || channel.isEmpty())
            return null;
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EMAILNotification();
            case "PUSH" -> new PUSHNotification();
            default -> throw new IllegalArgumentException("Unknown channel " + channel);
        };
    }
}
