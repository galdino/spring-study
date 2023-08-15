package com.galdino.ufood.notification;

import com.galdino.ufood.model.Client;
import org.springframework.stereotype.Component;

@Component
public class EmailNotifier implements Notifier {

//    private boolean upperCase;
//    private String serverHostSmtp;

//    public EmailNotifier(String serverHostSmtp) {
//        this.serverHostSmtp = serverHostSmtp;
//        System.out.println("Constructor");
//    }

    @Override
    public void notify(Client client, String message) {
//        if (upperCase) {
//            message = message.toUpperCase();
//        }

        System.out.printf("Notifying %s through e-mail %s: %s", client.getName(), client.getEmail(), message);
    }

//    public void setUpperCase(boolean upperCase) {
//        this.upperCase = upperCase;
//    }
}
