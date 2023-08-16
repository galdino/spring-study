package com.galdino.ufood.notification;

import com.galdino.ufood.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier("sms")
@Component
public class SMSNotifier implements Notifier {

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

        System.out.printf("Notifying %s through SMS by phone %s: %s \n", client.getName(), client.getPhone(), message);
    }

//    public void setUpperCase(boolean upperCase) {
//        this.upperCase = upperCase;
//    }
}
