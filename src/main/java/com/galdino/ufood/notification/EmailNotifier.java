package com.galdino.ufood.notification;

import com.galdino.ufood.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Primary
//@Qualifier("email")

@Profile("prod")
@NotifierType(UrgencyLevel.NORMAL)
@Component
public class EmailNotifier implements Notifier {

//    @Value("${email.notifier.server-host}")
//    private String host;
//    @Value("${email.notifier.server-port}")
//    private int port;

    @Autowired
    private NotifierProperties properties;

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
//        System.out.println("Host:" + host);
//        System.out.println("Port:" + port);
        System.out.println("Host:" + properties.getServerHost());
        System.out.println("Port:" + properties.getServerPort());

        System.out.printf("Notifying %s through e-mail %s: %s \n", client.getName(), client.getEmail(), message);
    }

//    public void setUpperCase(boolean upperCase) {
//        this.upperCase = upperCase;
//    }
}
