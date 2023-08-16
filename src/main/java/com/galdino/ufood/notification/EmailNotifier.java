package com.galdino.ufood.notification;

import com.galdino.ufood.model.Client;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Primary
//@Qualifier("email")

@Profile("prod")
@NotifierType(UrgencyLevel.NORMAL)
@Component
public class EmailNotifier implements Notifier {
    public EmailNotifier() {
        System.out.println("PROD EmailNotifier");
    }
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

        System.out.printf("Notifying %s through e-mail %s: %s \n", client.getName(), client.getEmail(), message);
    }

//    public void setUpperCase(boolean upperCase) {
//        this.upperCase = upperCase;
//    }
}
