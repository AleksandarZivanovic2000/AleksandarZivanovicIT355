package controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageController {

    private final List<String> messages = new ArrayList<>();

    @JmsListener(destination = "myQueue")
    public void onMessage(String message) {
        messages.add(message);
    }

    @GetMapping("/messages")
    public List<String> getMessages() {
        return messages;
    }
}