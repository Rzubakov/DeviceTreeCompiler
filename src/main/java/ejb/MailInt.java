package ejb;

public interface MailInt {

    public void send(String addresses, String topic, String textMessage);
}
