package ejb;

import javax.annotation.Resource;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Asynchronous
@Stateless
public class MailService implements MailInt{

    @Resource(name = "java:jboss/mail/gmail")
    Session session;

    public MailService() {
    }

    @Override
    public void send(String addresses, String topic, String textMessage) {
        try {
            Message message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresses));
            message.setSubject(topic);
            message.setText(textMessage);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
