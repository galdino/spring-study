package com.galdino.ufood.service;

import com.galdino.ufood.model.Client;
import com.galdino.ufood.notification.Notifier;
import com.galdino.ufood.notification.NotifierType;
import com.galdino.ufood.notification.UrgencyLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivationClientService {

//    @Autowired(required = false)
//    @Qualifier("sms")
    @NotifierType(UrgencyLevel.URGENT)
    @Autowired
    private Notifier notifier;
//    private List<Notifier> notifiers;

//    @Autowired
//    public ActivationClientService(Notifier notifier) {
//        this.notifier = notifier;
//    }

//    public ActivationClientService(String any) {
//
//    }

    public void activate(Client client) {
        client.activate();

        notifier.notify(client, "Your registration in the system is active!");
//        notifiers.forEach(notifier -> notifier.notify(client, "Your registration in the system is active!"));

//        if (notifier != null) {
//            notifier.notify(client, "Your registration in the system is active!");
//        } else {
//            System.out.println("There is no notifier, but the client was activated.");
//        }
    }

//    @Autowired
//    public void setNotifier(Notifier notifier) {
//        this.notifier = notifier;
//    }
}
