package configuration;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @JmsListener(destination = "messageQueue")
    public void receiveMessage(String message) {
        System.out.println("Primljena poruka: " + message);
    }
}
